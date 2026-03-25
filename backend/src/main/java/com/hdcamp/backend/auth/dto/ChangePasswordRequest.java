package com.hdcamp.backend.auth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ChangePasswordRequest(
        @NotBlank(message = "FIELD_REQUIRED") String currentPassword,
        @NotBlank(message = "FIELD_REQUIRED") @Size(min = 6, max = 100, message = "INVALID_PASSWORD_SIZE")
                String newPassword) {}
