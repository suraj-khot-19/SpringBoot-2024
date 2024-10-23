package org.suraj;

public class Laptop {
    public Laptop() {
        System.out.println("Created a object of *Laptop in container using config.xml file means in bean");
    }

    public void coding() {
        System.out.println("Coding is a life...");
    }

    public void loveDev() {
        System.out.println("Dev loves me also me too ...!");
    }

//    auto wire
    public  void  wiring(){
        System.out.println("This is example of auto wiring....");
    }
}
