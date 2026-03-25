package com.hdcamp.backend.auth.oauth2;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.hdcamp.backend.auth.enums.SocialProvider;
import com.hdcamp.backend.common.exception.AppException;
import com.hdcamp.backend.common.exception.ErrorCode;

@Component
public class SocialProviderClientFactory {

    private final Map<SocialProvider, SocialProviderClient> clients;

    public SocialProviderClientFactory(List<SocialProviderClient> clientList) {
        this.clients = clientList.stream().collect(Collectors.toMap(SocialProviderClient::provider, c -> c));
    }

    public SocialProviderClient getClient(SocialProvider provider) {
        return Optional.ofNullable(clients.get(provider))
                .orElseThrow(() -> new AppException(ErrorCode.OAUTH_PROVIDER_UNSUPPORTED));
    }
}
