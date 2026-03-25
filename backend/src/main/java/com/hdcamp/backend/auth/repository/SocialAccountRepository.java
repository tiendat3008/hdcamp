package com.hdcamp.backend.auth.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hdcamp.backend.auth.entity.SocialAccount;
import com.hdcamp.backend.auth.enums.SocialProvider;

public interface SocialAccountRepository extends JpaRepository<SocialAccount, Long> {

    Optional<SocialAccount> findByProviderAndProviderUserId(SocialProvider provider, String providerUserId);

    List<SocialAccount> findAllByUserId(Long userId);

    Optional<SocialAccount> findByUserIdAndProvider(Long userId, SocialProvider provider);
}
