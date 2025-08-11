package com.xworkz.thinkpad.configuration;

import javax.management.MXBean;

@Configuration
@ComponentScan("com.xworkz.thinkpad")
public class AppConfiguration {

    @Bean
    public String browserName(){
        System.out.println("registering browsername ");
        return "Chrome";
    }
    @Bean
    public String CompanyName(){
        System.out.println("registering companyName with Spring conatiner");
        return "Google";
    }
    @Bean
    public String CompanyName1() {
        System.out.println("registering companyName with Spring conatiner");
    }
}
