/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex36;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

public class computingstats {
    public static void main(String[] args) {
        computingstats myapp = new computingstats();
        String stats =  " ";
        ArrayList<Integer> numberarray = new ArrayList<>();

        while (!stats.equals("")){
            stats =  input();
            if (!stats.equals(""))
                numberarray.add(Integer.parseInt(stats));
        }
        double average = averageCalc(numberarray);
        int max = maxVal(numberarray);
        int min = minVal(numberarray);
        double deviation = std(numberarray, average);
        myapp.output(average, max, min, deviation);
    }

    public static String input() {
        Scanner input = new Scanner(System.in);
        String number = "";
        System.out.println("Enter a number: ");
        while (!input.hasNextInt()) {
            if (input.nextLine().equals("done")){
                return number;
            }
            System.out.println("Input is not a number. Try again.");
        }
        number= input.nextLine();

        return number;
    }

    public static double averageCalc(ArrayList<Integer> numberarray){
       int average = 0;

       for (int i=0; i<numberarray.size(); i++){
           average += numberarray.get(i);
       }
       average = average / numberarray.size();
        return average;
    }

    public static int maxVal(ArrayList<Integer> numberarray){
        int max = numberarray.get(0);
        for(int i=1; i<numberarray.size(); i++){
            if(numberarray.get(i) > max){
                max = numberarray.get(i);
            }
        }
        return max;
    }

    public static int minVal(ArrayList<Integer> numberarray){
        int min = numberarray.get(0);
        for(int i=1; i<numberarray.size(); i++){
            if(numberarray.get(i) < min){
                min = numberarray.get(i);
            }
        }
        return min;
    }


    public static double std(ArrayList<Integer> numberarray, double mean){
        double deviation = 0;
        for(int i=0; i<numberarray.size(); i++){
            deviation += Math.pow(numberarray.get(i) - mean, 2);
        }
        deviation = Math.sqrt(deviation / (numberarray.size()));
        return deviation;
    }

    public void output(double mean, int max, int min, double std){
        System.out.printf("The average is %.1f\nThe min is %d\nThe max is %d\nThe STD is %.2f", mean, min, max, std);
    }

}