package com.rittick;

/**
 * Created by Rittick on 1/29/2017.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private  int tail;
    private  int teeth;
    private String  coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        movelegs(speed);
        super.move(speed);
    }

    private void movelegs(int speed) {
        System.out.println("Dog.movelegs() is called.");
    }
}
