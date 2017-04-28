package com.rittick;

public class Main {

    public static void main(String[] args) {

    // int has a width of 32    2^31
	int myMinValue = -2_147_483_648;
	int myMaxValue = 2_147_483_647;
	int myTotal = (myMinValue/2);
	System.out.println("My total = "+ myTotal);

        //byte has a width of 8
	byte myByteValue = -128;
	byte myNewByteValue = (myByteValue/2);

	//short has a width of 16
	short mySortValue = 32767;

	//long has a width of 64 2^63
	long myLongValue = 100L;
    }
}
