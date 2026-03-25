package com.hdcamp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

import com.hdcamp.backend.common.config.JwtProperties;
import com.hdcamp.backend.common.config.MinioProperties;
import com.hdcamp.backend.common.config.OAuth2Properties;
import com.hdcamp.backend.common.config.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    JwtProperties.class,
    OAuth2Properties.class,
    MinioProperties.class,
    StorageProperties.class,
})
@EnableAsync // Required for @Async in MailService
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
}
