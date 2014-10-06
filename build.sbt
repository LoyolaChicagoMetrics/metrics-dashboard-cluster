name := "akka-cluster-example"

version := "1.0"

val akkaVersion = "2.3.6"
val sprayVersion = "1.2.0"

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)
