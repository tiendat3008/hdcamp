package com.hdcamp.backend.user.dto;

import java.util.List;

import com.hdcamp.backend.auth.enums.UserStatus;

public record UserMeResponse(
        Long userId,
        String email,
        UserStatus status,
        List<String> roles,
        String firstName,
        String lastName,
        String avatarUrl,
        String bio,
        String preferredLanguage,
        String preferredCurrency) {}
