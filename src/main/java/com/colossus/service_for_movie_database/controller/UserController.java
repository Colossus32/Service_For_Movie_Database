package com.colossus.service_for_movie_database.controller;

import com.colossus.service_for_movie_database.DTO.UserDataDTO;
import com.colossus.service_for_movie_database.DTO.UserRegistrationDTO;
import com.colossus.service_for_movie_database.entity.User;
import com.colossus.service_for_movie_database.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/registration")
    public User userRegistration (@RequestBody UserRegistrationDTO dto) {
        return userService.save(dto);
    }

    @GetMapping("/{id}")
    public UserDataDTO getUserById (@RequestHeader("User_Id")UUID id, @PathVariable("id") UUID idParam) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();

        return userService.getUserById(id, idParam);
    }
}
