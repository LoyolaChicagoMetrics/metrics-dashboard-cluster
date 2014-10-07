import sbt._
import Keys._
import play.PlayScala

object MetricsBuild extends Build {

  val akkaVersion = "2.3.6"

  scalaVersion := "2.11.2"

  resolvers ++= Seq(
    Classpaths.typesafeReleases,
    Classpaths.typesafeSnapshots,
    "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
  )

  val akkaDeps = Seq(
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
    "com.typesafe.akka" %% "akka-contrib" % akkaVersion
  )

  lazy val root = project.in(file(".")).aggregate(frontend, backend, common)

  lazy val frontend = project.settings(
    libraryDependencies ++= akkaDeps
  ).enablePlugins(PlayScala).dependsOn(common)

  lazy val backend = project.settings(
    libraryDependencies ++= akkaDeps
  ).dependsOn(common)

  lazy val common = project.settings(
    libraryDependencies ++= akkaDeps
  )
}