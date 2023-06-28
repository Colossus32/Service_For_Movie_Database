package com.colossus.service_for_movie_database.service;

import com.colossus.service_for_movie_database.DTO.UserDataDTO;
import com.colossus.service_for_movie_database.DTO.UserRegistrationDTO;
import com.colossus.service_for_movie_database.entity.User;

import java.util.UUID;

public interface UserService {

    User save(UserRegistrationDTO dto);

    UserDataDTO getUserById(UUID id, UUID idParam);
}
