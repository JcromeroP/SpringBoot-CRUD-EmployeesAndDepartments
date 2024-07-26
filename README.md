# CRUD TO MANAGE TASKS

I have developed a CRUD in Spring Boot to manage employees associated with departments, implementing a RESTful API that follows REST design principles. It uses appropriate HTTP verbs (GET, POST, PUT, DELETE) to perform CRUD operations, and has efficient error handling that provides clear messages and HTTP status codes reflecting the result of each operation, related to custom validations to ensure that the data is correct and flawless. In addition, I have performed extensive testing with Postman to ensure the correct operation of all endpoints.

## What tools have I used?
1. Java - Spring Boot
2. Postman
3. MySQL Workbench
4. Vscode
## Dependencies used
1. Spring Boot
2. Spring Data JPA
3. Spring Boot Dev Tools
4. Spring Web
5. Validation
6. Lombok
7. H2 Database

## Testing endpoints with postman:
1. POST /save:
Method: POST
URL: http://localhost:8080/save
Body (JSON):
{
"name":  "Camilo",
"lastName":  "Romero p",
"email":  "juanromero@gmail.com",
"phone":  3117899856,
"age":  22,
"height":  1.75,
"married":  true,
"dataOfBirth":  "2002-11-26",
"departmentDTO":  {
"name":  "Recursos",
"city":  "Medellin"
}
}
Verify that the task is created correctly.
