package com.example.configvalidation.config;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

@Validated
@Value
@ConstructorBinding
@ConfigurationProperties(prefix = "service")
public class ApiConfiguration {

    String apiToken;
}
