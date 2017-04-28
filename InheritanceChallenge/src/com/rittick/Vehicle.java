package com.rittick;

/**
 * Created by Rittick on 1/30/2017.
 */
public class Vehicle {
    private int numberOfWheels;
    private int numberOfDoors;

    public Vehicle(int numberOfDoors) {
        this.numberOfWheels = 4;
        this.numberOfDoors = numberOfDoors;
    }

    public void move(int speed){
        System.out.println("Vehicle is moving at "+speed+" mph");
    }

    public void changeGear(){
        System.out.println("Gear changed.");
    }

    public void handleSteering(){
        System.out.println("Steering rotated.");
    }

    public void steer(int direction){

    }

    public void move(int velocity, int direction){

    }
}
