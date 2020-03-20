package com.app.sbrsmd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.sbrsmd.models.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
