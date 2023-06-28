package com.colossus.service_for_movie_database.service.impl;

import com.colossus.service_for_movie_database.DTO.UserDataDTO;
import com.colossus.service_for_movie_database.DTO.UserRegistrationDTO;
import com.colossus.service_for_movie_database.entity.User;
import com.colossus.service_for_movie_database.repo.UserRepo;
import com.colossus.service_for_movie_database.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service

@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private final String INPUT_ERROR = "INPUT ERROR!!!";


    @Override
    public User save(UserRegistrationDTO dto) {

        return null;
    }

    @Override
    public UserDataDTO getUserById(UUID id, UUID idParam) {
        return null;
    }
}
