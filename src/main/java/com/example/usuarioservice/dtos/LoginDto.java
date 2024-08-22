package com.example.usuarioservice.dtos;

import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

@Data
public class LoginDto {

    @NotEmpty(message = "Username is required")
    private String username;

    @NotEmpty(message = "Password is required")
    private String password;
}
