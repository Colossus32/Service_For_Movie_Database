package com.colossus.service_for_movie_database.repo;

import com.colossus.service_for_movie_database.DTO.UserDataDTO;
import com.colossus.service_for_movie_database.DTO.UserRegistrationDTO;
import com.colossus.service_for_movie_database.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class InMemoryRepo {
    List<User> userList = new ArrayList<>();

    public void save(User user) {
        userList.add(user);
    }
    public Optional<User> getUserById (UUID id) {
        System.out.println(userList.size());
        return userList.stream().findAny();
    }
}
