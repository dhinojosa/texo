name := "texo"

version := "1.0-SNAPSHOT"

organization := "org.texo"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.1" % "test",
                            "com.typesafe.akka" %% "akka-actor" % "2.3.9")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

mainClass := Some("org.texo.Runner")


