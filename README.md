# SpringMVC examples

## Dependencies

* Gradle
* SpringBoot 1.3.0
* Thymeleaf 2.1.4

## Running without tomcat

`gradle bootRun`

## Build 

`gradle war` will download the required dependencies and create a WAR file at *build/libs/springmvc_examples.war*.

## Deploy to tomcat

Copy WAR file to *$TOMCAT_HOME/webapps/*
