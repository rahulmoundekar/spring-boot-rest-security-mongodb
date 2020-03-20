package com.app.sbrsmd.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.sbrsmd.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);
}
