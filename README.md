
SpringBootMultiModeProject
==========================

This project will show the below stuffs
 - Create a multi module project
 - Each module will be built as seperate JAR file
 - use mvn executable to build the entire jars from command line
 - running all these jars through command prompt
 
This project has 3 modules
 - root module [no jars will be created but act as root node for other two modules]
 - application module [This will have the main method and REST controller and end points]
 - service module [This has a service component class which caters the request accessed from application module]
 
Dependency
 - application module depends on service module
