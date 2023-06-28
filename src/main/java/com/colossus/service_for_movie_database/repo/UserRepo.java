package com.colossus.service_for_movie_database.repo;

import com.colossus.service_for_movie_database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {
    Optional<User> getUserById(UUID id);
}
