package com.colossus.service_for_movie_database.controller;

import com.colossus.service_for_movie_database.entity.AuthenticationRequest;
import com.colossus.service_for_movie_database.entity.AuthenticationResponse;
import com.colossus.service_for_movie_database.entity.RegisterRequest;
import com.colossus.service_for_movie_database.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/registrations")
    public ResponseEntity<AuthenticationResponse> register (@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.userRegister(request));
    }

    @PostMapping("/authentications")
    public ResponseEntity<AuthenticationResponse> register (@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(service.userAuthenticate(request));
    }
}
