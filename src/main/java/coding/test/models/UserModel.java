package coding.test.models;

import lombok.Data;

/*
Create a REST API using Spring Boot that returns a list of users in JSON format.
Requirements:
Create a simple User class with fields like id, name, and email.
Implement a controller to return a hardcoded list of users as a JSON response.
 */

@Data
public class UserModel {
    private Integer id;
    private String name;
    private String email;
    private String password;
}
