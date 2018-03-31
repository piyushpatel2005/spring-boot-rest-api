# Simple REST API using Spring Boot

This is a simple REST API for Courses website. You can access different endpoints and it returns response in JSON format.

## Pre-requisites:

- Basic understanding of Maven
- Java 8 Programming Knowledge
- Spring Framework and Spring MVC understanding
- Basics of Maven
- Basics of RESTful webservices

## Technologies Used:

- Maven
- Spring Boot
- Java SE 8
- Tomcat Server 8
- Eclipse IDE
- Spring Data JPA

Spring Applications can be intialized using various methods.

1. Using spring-boot-starter-parent as parent of your project (like this project)
2. Using Spring Initializr
Visit [http://start.spring.io](http://start.spring.io) which is Web UI for building your project.
3. Spring Boot CLI
Download Spring Boot CLI. Extract the file and go into that directory
```shell
cd spring-1.4.2.RELEASE/bin
./spring  # gives help commands for spring cli
./spring run app.groovy
```

```groovy
// app.groovy
@RestController
class AppCtrl {
	@RequestMapping("/")
	String app() {
		"Hello world"
	}
}
```
4. STS IDE
Create Spring Starter Project using IDE.

To configure different application properties, we use application.properties. You can also search for resource on the internet with "Commong application properties"
