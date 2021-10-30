package com.example.configvalidation.config;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ApiTokenValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return ApiConfiguration.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ApiConfiguration apiConfiguration = (ApiConfiguration) target;
        if (apiConfiguration.getApiToken().startsWith("${") && apiConfiguration.getApiToken().endsWith("}")) {
            errors.rejectValue("api-token", "filed.required", new Object[]{apiConfiguration.getApiToken()},
                    "Environment variable TOKEN not found");
        }
    }
}
