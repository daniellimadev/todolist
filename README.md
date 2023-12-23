# To-Do List Project in Spring Boot!! 🚀🚀

### API to manage tasks (CRUD)

# Technologies used

* **Language:** Java 17
* **Versioning:** Git/GitHub
* **IDE:** IntelliJ IDEA Community Edition
* **Data Base:** Postgres
* **Framework:** Spring Boot

- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)

<br>

## 🖼Screen

Code

![code](https://github.com/daniellimadev/todolist/blob/main/img/code.png)

Swagger ui

![swagger ui](https://github.com/daniellimadev/todolist/blob/main/img/swagger%20ui.png)

## Practices adopted

- SOLID, DRY, YAGNI, KISS
- REST API
- Queries with Spring Data JPA
- Dependency Injection
- Handling error responses
- Automatic generation of Swagger with OpenAPI 3

## How to Execute

- Clone git repository
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

The API can be accessed at [localhost:8080](http://localhost:8080).
Swagger can be viewed at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

To make the HTTP requests below, the tool [Postman](https://www.postman.com/) was used:

- Create Task
```
$ http POST :8080/all name="Todo 1" description="Desc Todo 1" priority=1

[
 
  "name": "string",
  "description": "string",
  "accomplished": true,
  "priority": 0
}
]
```

- List Tasks
```
$ http GET :8080/all

[
  {
    "id": 0,
    "name": "string",
    "description": "string",
    "accomplished": true,
    "priority": 0
  }
]
```

- Update Task
```
$ http PUT :8080/todos/1 name="Todo 1 Up" description="Desc Todo 1 Up" priority=2

[
  {
   "id": 0,
   "name": "string",
   "description": "string",
   "accomplished": true,
   "priority": 0
}
]
```

- Remove Task
```
http DELETE :8080/todos/1

[ ]
```


 <h3>Author</h3>

<a href="https://www.linkedin.com/in/danielpereiralima/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/96916005?v=4" width="100px;" alt=""/>

Made by Daniel Pereira Lima 👋🏽 Contact!

[![Linkedin Badge](https://img.shields.io/badge/-Daniel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/danielpereiralima/)](https://www.linkedin.com/in/danielpereiralima/)
