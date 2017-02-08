package com.rittick;

/**
 * Created by Rittick on 1/30/2017.
 */
public class Desk {
    private String size;
    private boolean isShelfAvailable;
    private boolean isLightAvailable;

    public Desk(String size, boolean isShelfAvailable, boolean isLightAvailable) {
        this.size = size;
        this.isShelfAvailable = isShelfAvailable;
        this.isLightAvailable = isLightAvailable;
    }

    public void placeBook(Book book){
        System.out.println("Book is placed.");
    }

    public void removeBook(Book book){
        System.out.println("Book is removed.");
    }
}
