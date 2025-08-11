package com.xworkz.thinkpad.component;
@Component
public class Browser {
    @Qualifier("browserName")//String
    @Autowired
    private String name; //NoUniqueBeanDefinitionException
    @Autowired
    private String companyName;

    public Browser() {
        System.out.println("Browser created  by spring container");    }
}
