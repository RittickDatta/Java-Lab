package com.rittick;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + String.format("%.2f", calculateInterest(10000.0, 2.0)));

        for (int i = 0; i < 6; i++) {
            System.out.println("loop " + i + " Hello !");
        }

        for (int interest = 2; interest < 9; interest++) {
            System.out.println("Interest at " + interest + "% is " + String.format("%.2f", calculateInterest(10000.0, interest)));
        }

        for (int interest = 8; interest >= 2; interest--)
            System.out.println("Interest at " + interest + "% is " + String.format("%.2f", calculateInterest(10000.0, interest)));

        int count = 0;
        for (int number = 3; number < 99; number++){
            boolean flag = false;
            flag = isPrime(number);
            if (flag == true){
                System.out.println("Found a prime number: "+number);
                count++;
            }
        }
        System.out.println("Found "+count+" prime numbers.");

    }






    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
