package de.neuefische.securitydemo.service;

import de.neuefische.securitydemo.model.UserDocument;
import de.neuefische.securitydemo.repo.MongoUserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final MongoUserRepo mongoUserRepo;

    public Optional<UserDocument> findByUsername(String username) {
        return mongoUserRepo.findByUsername(username);
    }

    public Optional<UserDocument> saveUser(UserDocument user) {
        Optional<UserDocument> oldUser = mongoUserRepo.findByUsername(user.getUsername());
        if(oldUser.equals(Optional.empty())){
            return Optional.of(mongoUserRepo.save(user));
        }
        return Optional.empty();
    }
}
