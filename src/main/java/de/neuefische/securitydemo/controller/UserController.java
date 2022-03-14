package de.neuefische.securitydemo.controller;

import de.neuefische.securitydemo.model.UserDocument;
import de.neuefische.securitydemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<UserDocument> findUserInRepo(@RequestBody UserDocument user){
        return ResponseEntity.of(userService.findByUsername(user.getName()));
    }

    @PostMapping
    public ResponseEntity<UserDocument> saveUserInRepo(@RequestBody UserDocument user){
        Optional<UserDocument> newUser= userService.saveUser(user);
        return ResponseEntity.of(newUser);
    }
}
