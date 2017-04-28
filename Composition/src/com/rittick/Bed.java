package com.rittick;

/**
 * Created by Rittick on 1/30/2017.
 */
public class Bed {
    private String size;
    private int height;
    private boolean isMattressAvailable;

    public Bed(String size, int height, boolean isMattressAvailable) {
        this.size = size;
        this.height = height;
        this.isMattressAvailable = isMattressAvailable;
    }

    public String getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public boolean isMattressAvailable() {
        return isMattressAvailable;
    }
}
