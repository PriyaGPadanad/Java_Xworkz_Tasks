package com.xworkz.company.configuration;

@Configuration
@ComponentScan(basePackages)
public class CompanyConfiguration {
    public CompanyConfiguration(){
        System.out.println("No-arg constructor");
    }
}
