package com.hdcamp.backend.auth.oauth2;

import com.hdcamp.backend.auth.dto.SocialLoginRequest;
import com.hdcamp.backend.auth.dto.SocialProfile;
import com.hdcamp.backend.auth.enums.SocialProvider;

public interface SocialProviderClient {

    SocialProvider provider();

    SocialProfile authenticate(SocialLoginRequest request);
}
