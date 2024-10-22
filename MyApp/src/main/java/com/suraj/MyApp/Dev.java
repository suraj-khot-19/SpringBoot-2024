package com.suraj.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //using laptop class method here

    //1. field injection
    //    @Autowired
    //    private Laptop laptop;

    //2. constructor injection
    //    private Laptop laptop;
    //
    //    public Dev(Laptop laptop) {
    //        this.laptop = laptop;
    //    }

    //3. setter injection
    @Autowired
    private Laptop laptop;

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build() {
        laptop.compile();
        System.out.println("Hello i am building a great project");
    }
}
