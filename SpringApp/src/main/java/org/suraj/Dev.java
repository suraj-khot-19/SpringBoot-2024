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


    //desktop assessing using constructor injection
    Desktop desktop;

    public Dev(int salary,int bonus,Desktop desktop){
        this.salary=salary;
        this.bonus=bonus;
        System.out.println("I am a parameterized constructor called by using bean");

        //constructor injection in desktop
        this.desktop=desktop;
    }


    //laptop accessing using injection configuration
    Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }



    public void build(){
        System.out.println("Building a project...");
        //accessing laptop method using setter injection
        laptop.loveDev();

        //accessing desktop method using constructor injection
        desktop.loveDesktop();
    }
}
