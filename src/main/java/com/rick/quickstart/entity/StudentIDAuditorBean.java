package com.rick.quickstart.entity;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Date;
import java.util.Optional;

@Configuration
public class StudentIDAuditorBean implements AuditorAware<Integer> {
    @Override
    public Optional<Integer> getCurrentAuditor() {
        return Optional.of((int)new Date().getTime());
    }
}
