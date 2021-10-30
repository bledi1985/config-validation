package com.example.configvalidation;

import com.example.configvalidation.config.ApiConfiguration;
import com.example.configvalidation.config.ApiTokenValidator;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ApiConfiguration.class,})
public class BeansConfiguration {

    @Bean
    public static ApiTokenValidator configurationPropertiesValidator() {
        return new ApiTokenValidator();
    }

}
