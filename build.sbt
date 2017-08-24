name := "scalaLib"

version := "1.0"

scalaVersion := "2.12.3"

lazy val akkaVersion = "2.5.3"



libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
)
// http://www.scalatest.org/install
//测试需要
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"