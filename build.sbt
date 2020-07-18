scalaVersion := "2.11.12"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

libraryDependencies += "org.rogach" %%% "scallop" % "3.5.0"

libraryDependencies += "com.github.david-bouyssie" % "sqlite4s_native0.3_2.11" % "0.1.0"