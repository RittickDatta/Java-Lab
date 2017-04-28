package com.rittick;

/**
 * Created by Rittick on 1/31/2017.
 */
public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPages = numberOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int ink){
        if(this.tonerLevel< 100 && (this.tonerLevel+ink) <= 100){
            this.tonerLevel += ink;
        }
    }

    public void print(int numberOfPages, boolean bothSides){
        if(tonerLevel > 5 && bothSides == false){
            this.numberOfPages = numberOfPages;
            this.tonerLevel -= 5 * numberOfPages;
        }

        if(tonerLevel > 5 && bothSides==true){
            numberOfPages = numberOfPages / 2;
            this.tonerLevel -= 5 * (numberOfPages);
        }
        System.out.println(numberOfPages+ " pages printed.");
        System.out.println("Current toner level: "+this.tonerLevel);
    }
}
