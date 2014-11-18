import com.typesafe.sbt.SbtNativePackager._
import sbt._
import sbt.Keys._
import play.PlayScala
import NativePackagerKeys._

object MetricsBuild extends Build {

  scalaVersion := "2.11.2"

  resolvers ++= Seq(
    Classpaths.typesafeReleases,
    Classpaths.typesafeSnapshots,
    "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/com/typesafe/akka/"
  )

  val akkaDeps = Seq(
    Dependency.akkaCluster, Dependency.akkaKernel, Dependency.akkaContrib
  )

  lazy val root = project.in(file(".")).aggregate(frontend, backend, common)

  lazy val frontend = project.settings(
    libraryDependencies ++= akkaDeps
  ).enablePlugins(PlayScala).dependsOn(common)

  lazy val backend = Project("backend", file("backend")).settings(
    name := """hello-kernel""",
    mainClass in Compile := Some("backend.Kernel"),
    libraryDependencies ++= akkaDeps
  ).settings(
    packageArchetype.akka_application: _*
  ).dependsOn(common)

  lazy val common = project.settings(
    libraryDependencies ++= akkaDeps
  )
}



object Dependency {
  object V {
    val Akka         = "2.3.3"
  }

  val akkaKernel     = "com.typesafe.akka" %% "akka-kernel"  % V.Akka
  val akkaCluster    = "com.typesafe.akka" %% "akka-actor"   % V.Akka
  val akkaContrib    = "com.typesafe.akka" %% "akka-contrib" % V.Akka
}