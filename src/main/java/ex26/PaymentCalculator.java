/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex26;
import java.util.Scanner;
import java.lang.Math;

public class PaymentCalculator {
    public static void main(String[] args) {
        PaymentCalculator myapp = new PaymentCalculator();

        // Input Conditions
        Scanner input = new Scanner(System.in);

        // Balance
        System.out.print("What is your balance? ");
        double balance = input.nextDouble();
        balance = Math.ceil(balance * 100)/100;

        // APR
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();

        // Monthly Pay
        System.out.print("What is the monthly payment you can make? ");
        double monthpay = input.nextDouble();
        monthpay = Math.ceil(monthpay * 100)/100;

        // Checking to see if any of these values are 0
        if (balance <= 0 || apr <=0 || monthpay <= 0){
            System.out.print("There is an issue with your inputs.");
        }
        // Calculation of months with rounding
        else{
            int months = myapp.calculateMonthsUntilPaidOff(balance, apr, monthpay);
            System.out.printf("It will take you %d months to pay off this card.", months);
        }


    }


    public int calculateMonthsUntilPaidOff(double balance, double apr, double monthpay){
        double base = -1.0/30.0;
        double dailyRate = (apr/100)/365;
        double numMonths = (base*(Math.log(1 + (balance / monthpay) * (1-Math.pow(1+dailyRate, 30)))));
        numMonths =  (numMonths / Math.log(1 + dailyRate));
        return (int)Math.ceil(numMonths);
    }



}


