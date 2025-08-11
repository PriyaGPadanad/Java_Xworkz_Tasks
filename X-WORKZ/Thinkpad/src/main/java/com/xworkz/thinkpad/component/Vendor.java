package com.xworkz.thinkpad.component;
@Component
public class Vendor {
    private Vendor vendor;
    @Autowired
    public Provider(Vendor vendor){
        System.out.println("Created Vendor by Spring container");
        this.vendor=vendor;
    }
}
