name := "texo"

version := "1.0-SNAPSHOT"

organization := "org.texo"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.0" % "test",
                            "com.typesafe.akka" %% "akka-actor" % "2.2.3")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

mainClass := Some("org.texo.Runner")


