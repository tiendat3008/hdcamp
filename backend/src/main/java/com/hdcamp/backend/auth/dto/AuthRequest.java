package com.hdcamp.backend.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AuthRequest(
        @NotBlank(message = "FIELD_REQUIRED") @Email(message = "INVALID_EMAIL") String email,
        @NotBlank(message = "FIELD_REQUIRED") String password) {}
