package de.neuefische.securitydemo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("/users")
@Data
public class UserDocument {

    private String username;
    private String password;
    private String role;

    @Id
    private String id;

}
