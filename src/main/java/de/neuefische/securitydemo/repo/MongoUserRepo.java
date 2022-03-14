package de.neuefische.securitydemo.repo;

import de.neuefische.securitydemo.model.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MongoUserRepo extends MongoRepository<UserDocument, String> {

    Optional<UserDocument> findByName(String username);
}
