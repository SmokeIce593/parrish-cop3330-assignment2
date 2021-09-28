/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex28;

import java.util.Scanner;


public class AddingNum {
    public static void main(String[] args) {
        AddingNum myapp = new AddingNum();
        int[] totalArray = myapp.input();

        int total = myapp.getvalue(totalArray);
        System.out.printf("The total is %d.", total);
        }

    public int[] input(){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<5; i++){
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }
        return array;
    }

    public int getvalue(int[] array){
        int total = 0;
        for (int i=0; i<5; i++){
            total += array[i];
        }
        return total;
    }

}

