package com.colossus.service_for_movie_database.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDataDTO {
    private UUID id;
    private String email;
    private String username;
    private String name;
}
