package org.suraj;

public class AutoWireEx {
    private Laptop lap;

    public Laptop getLaptop() {
        return lap;
    }

    public void setLaptop(Laptop lap) {
        this.lap = lap;
    }

    public void autoWiring(){
       lap.wiring();
    }
}
