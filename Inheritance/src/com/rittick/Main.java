package com.rittick;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5,5);

        Dog dog = new Dog("Yorkee", 8, 20, 2, 4, 1, "Long Silky");

//        dog.eat();
       dog.walk();
        //dog.run();
    }
}