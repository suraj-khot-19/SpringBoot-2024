package org.suraj;

import org.springframework.stereotype.Component;

public class Dev {
    public Dev(){
        System.out.println("Created a object of *Dev in container using config.xml file means in bean");
    }
    public void build(){
        System.out.println("Building a project...");
    }
}
