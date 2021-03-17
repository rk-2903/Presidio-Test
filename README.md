# Presidio-Test Instruction to Run


There are there micro-service in here. Execute in the order described

Requirements:
- Docekr
- Java 8
- Node

Step 1:
 - Pull the mongoDb Image
 - cd Presidio-Test
 - command: `docker-compose up -d`

Step 2:

1:  job-posting-eureka -(Naming Server)
 - run command: `mvn spring-boot:run`
 - port: 8761


2: job-posting (microservice)
 - run command:  `mvn spring-boot:run`
 - port: 8060
 
 
3: job-posting-webapp (UI as a microservice)
 - To execute UI as a microservice: ( build the dist file first and then excecute the run command)
 - cd presidio-ui 
 - run: npm i (to install the dependencies)
 - run: ng build (to build the dist)
 - cd .. (back to the `job-posting-webapp` directory)
 - run: `mvn spring-boot:run`
 - port: 8083 (Port to access the UI)

       ---OR---
 (one more option to run the UI directly)
 - after installing dependencies. (npm i)
 - just run: `ng s`
 - port: 4200 (UI will be up at this port)


   
