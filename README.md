# zemogatest
PORTFOLIO JAVA WEB APP SEBASTIAN MARTINEZ

# Technologies used

- Spring BOOT
- MySQL JDBC Connector
- FasterXML(For JSON Parsing)
- Thymeleaf(For UI)
- JAVA 11
- JPA
- Spring DevTools(For development process)
- JUnit 5
- Bootstrap 
- Gradle

# Steps to use

Follow this steps to clone and start the project:

## Prerequisites

You will need to have the JAVA JDK version 11 and Git in your computer, in order to run this application.

## Clone

By using the git bash clone the following repository:

https://github.com/Skywave008/zemogatest.git

## Execute the application

- Navigate to the **zemogatest** folder and execute
> ./gradlew clean build 
> and then 
> ./gradlew bootRun

## Open the application

By using a browser as Google Chrome, Mozilla or Edge, go to 
> [http://localhost:8080/](http://localhost:8080/)
**Be sure the port 8080 is free to run this application**

Now you will see the Portfolio page with the required information

## Consuming the Rest API

The application exposes two enpoints:

>**Path:** /getPortfolio

>**Produces:** application/json

>**Description:** Gets the portfolio data for an user by id

>**Method:** GET

>**Parameters:**

>**- id:** Required=true, type= Integer

and

>**Path:** /updatePortfolio

>**Produces:** application/json

>**Description:** Allows the consumer to update the portfolio information

>**Method:** POST

>**Parameters:**

>**- id:** Required=true, type= Integer

>**- description:** Required=true, type= String

>**- image:** Required=true, type= String

>**- twitterUserName:** Required=true, type= String

>**- title:** Required=true, type= String

For the last one you will need to use a tool as Postman to call the API with the POST method

# Time to build and document this application

It tooks to me about 5 hours taking into account that I haven't installed the Eclipse IDE and JAVA 11 in my machine, before this test.
