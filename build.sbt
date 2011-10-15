import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

organization := "sassunt"

name := "unfiltered-on-heroku"

scalaVersion := "2.8.1"

version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "0.5.1",
   "net.databinder" %% "unfiltered-jetty" % "0.5.1"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)
