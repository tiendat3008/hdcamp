package com.hdcamp.backend.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record SocialLoginRequest(
        @NotBlank(message = "FIELD_REQUIRED") String code,
        @NotBlank(message = "FIELD_REQUIRED") String state,
        String codeVerifier,
        @NotBlank(message = "FIELD_REQUIRED") String redirectUri) {}
