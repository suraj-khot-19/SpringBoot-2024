package com.suraj.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //using laptop class method here

    //injection types==>
    //1. field injection => need @Autowired annotation
    //2. setter injection => need @Autowired annotation
    //3. constructor injection => no any need @Autowired annotation it is just default

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
    //    @Autowired
    //    private Laptop laptop;
    //
    //    public void setLaptop(Laptop laptop) {
    //        this.laptop = laptop;
    //    }

    //    task to create field injection of interface computer
    @Autowired
    private Computer com;

    public void build() {
        //  laptop.compile();
        com.compile();
        System.out.println("Hello i am building a great project");
    }
}
