## Project structure

|── main
│   ├── test
│   │   └── java
│   │      
└── test
    ├── java
    │   ├── pages
    │   ├── services
    |	|	|_ApiServices.java
	|	|_DriverManager.java
    │   └── steps
    │_TestRunner.java       
    └── resources
        └── Driver
        |    └── chromedriver.exe
	|_Features

# Excecution

Runner de ejemplo: Class TestRunner.java 
Ejecucion con: Junit
Modificar los tags que se quieran agregar al Runner a ejecutar
Runner example:

@CucumberOptions(features="src/test/resources/Features",glue={"steps"}
        ,monochrome = true,
        plugin = {"pretty", "junit:target/JunitReports/report.xml","json:target/JunitReports/reportXML.xml","html:target/JunitReports/reporHTML.html"},
        tags="@Test"
        )
