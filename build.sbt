name := "LoL"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
            
EclipseKeys.projectFlavor := EclipseProjectFlavor.Java    
       
EclipseKeys.preTasks := Seq(compile in Compile)     
