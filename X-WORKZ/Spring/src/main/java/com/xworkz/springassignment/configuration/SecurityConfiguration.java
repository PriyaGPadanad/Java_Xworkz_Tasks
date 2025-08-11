package com.xworkz.springassignment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan("com.xworkz.springassignment")
public class SecurityConfiguration {

    @Bean
    public String encryptionAlgorithm() {
        return "AES-256";
    }

    @Bean
    public Integer maxLoginAttempts() {
        return 5;
    }

    @Bean
    public Boolean twoFactorAuthEnabled() {
        return true;
    }

    @Bean
    public List<String> allowedCountries() {
        return Arrays.asList("India", "USA", "Germany");
    }

    @Bean
    public Map<String, String> firewallRules() {
        Map<String, String> rules = new HashMap<>();
        rules.put("rule1", "ALLOW_INBOUND_HTTP");
        rules.put("rule2", "BLOCK_OUTBOUND_SSH");
        return rules;
    }

    @Bean
    public Set<String> trustedDevices() {
        return new HashSet<>(Arrays.asList("DeviceA", "DeviceB"));
    }

    @Bean
    public Double threatScoreThreshold() {
        return 7.5;
    }

    @Bean
    public Long lockoutDuration() {
        return 300L;
    }

    @Bean
    public Character securityGrade() {
        return 'A';
    }

    @Bean
    public String securityVendor() {
        return "Fortinet";
    }
}
