/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex31;

import java.util.Scanner;

public class HeartRate {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HeartRate myapp = new HeartRate();
        System.out.print("What is your age?");
        int age = myapp.input();

        System.out.print("What is your resting heart rate?");
        int restheart = myapp.input();

        int[] array = myapp.calculator(age, restheart);
        myapp.print(array);

    }

    public int input() {
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }

        return input.nextInt();
    }

    public int[] calculator(int age, int restheart) {
        int[] array = new int[9];
        int i;
        int stacker = 0;
        for (i=55; i<=95; i+=5){
            array[i-55-stacker*4] = (((220-age)- restheart) * i/100) + restheart;
            stacker += 1;
        }

        return array;
    }

    private void print(int[] array) {

        System.out.print("Intensity     | Rate\n");
        System.out.print("--------------|--------\n");


        for (int i=0; i<=8; i++){
            System.out.printf("%d            | %d bpm\n", 55+i*5, array[i]);
        }

    }
}

