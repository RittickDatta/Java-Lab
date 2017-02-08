package com.rittick;

/**
 * Created by Rittick on 1/30/2017.
 */
public class Car extends Vehicle{

    private int doors;
    private  int engineCapacity;

    public Car(int doors, int engineCapacity) {
        super("Car");
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
