package com.example.govtservice.repository;

import com.example.govtservice.repository.dto.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
