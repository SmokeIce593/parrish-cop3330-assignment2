/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex35;

import java.util.Scanner;
import  java.util.Random;
import java.util.ArrayList;

public class WinnerPick {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        WinnerPick myapp = new WinnerPick();

       String output = myapp.inputname();

        System.out.printf("The Winner is %s", output);

    }

    public String inputname() {
        ArrayList<String> array = new ArrayList<>();
        WinnerPick myapp = new WinnerPick();
        String current = "1";
        while(!current.equals("")){
            System.out.print("Enter a winner:");
            current = input.nextLine();
            if (!current.equals(""))
                array.add(current);
        }
        int size = array.size();

        int random = myapp.randomnum(size);
        return array.get(random);

    }

    public int randomnum(int size){
        Random random = new Random();
        return random.nextInt(size);
    }
}

