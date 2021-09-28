/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex29;

import java.util.Scanner;

public class BadInput {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        BadInput myapp = new BadInput();
        int years = myapp.input();

        System.out.printf("It will take %d years to double your initial investment", years);


    }

    private int input() {
        boolean flag = false;
        String text = "";
        while (!flag) {
            System.out.print("What is the rate of return?");
            text = input.nextLine();
            flag = calculation(text);
        }
        return 72/Integer.parseInt(text);
    }

    public boolean calculation(String str){
        boolean flag;
        flag = str.matches("[1-9]+");
        if (!flag)
            System.out.print("Sorry. That's not a valid input.\n");
        return flag;
    }
    }

