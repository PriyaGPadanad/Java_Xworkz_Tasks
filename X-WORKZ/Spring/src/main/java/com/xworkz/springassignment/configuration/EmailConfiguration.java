package com.xworkz.springassignment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan("com.xworkz.springassignment")
public class EmailConfiguration {
    @Bean
    public String smtpHost() {
        return "smtp.gmail.com";
    }

    @Bean
    public Integer smtpPort() {
        return 587;
    }

    @Bean
    public Boolean isTlsEnabled() {
        return true;
    }

    @Bean
    public List<String> allowedDomains() {
        return Arrays.asList("gmail.com", "outlook.com", "xworkz.in");
    }

    @Bean
    public Map<String, String> templates() {
        Map<String, String> map = new HashMap<>();
        map.put("welcome", "WelcomeTemplate.html");
        map.put("reset", "ResetPasswordTemplate.html");
        return map;
    }

    @Bean
    public Set<String> blacklistedEmails() {
        return new HashSet<>(Arrays.asList("spam@fake.com", "junk@mail.com"));
    }

    @Bean
    public Double mailQuotaMB() {
        return 500.0;
    }

    @Bean
    public Long emailExpiryInSeconds() {
        return 604800L; // 7 days
    }

    @Bean
    public Character defaultEmailPrefix() {
        return 'E';
    }

    @Bean
    public String defaultFromAddress() {
        return "noreply@xworkz.in";
    }
}
