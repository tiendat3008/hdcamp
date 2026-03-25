package com.hdcamp.backend.auth.dto;

public record SocialProfile(
        String providerUserId, String email, boolean emailVerified, String displayName, String avatarUrl) {}
