package org.suraj;

import org.springframework.stereotype.Component;

public class Dev {
    public Dev(){
        System.out.println("Created a object of *Dev in container using config.xml file means in bean");
    }

    // setter injection
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // constructor injection
     int salary,bonus;

    Dev(int salary,int bonus){
        this.salary=salary;
        this.bonus=bonus;
        System.out.println("I am a parameterized constructor called by using bean");
    }

    public void build(){
        System.out.println("Building a project...");
    }
}