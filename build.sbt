import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.janikdotzel"
ThisBuild / organizationName := "janikdotzel"

lazy val root = (project in file("."))
  .settings(
    name := "advent-of-code",
    libraryDependencies += scalaTest % Test
  )