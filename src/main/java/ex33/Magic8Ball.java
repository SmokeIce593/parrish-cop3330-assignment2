/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex33;

import java.util.Scanner;
import  java.util.Random;

public class Magic8Ball {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Magic8Ball myapp = new Magic8Ball();
        myapp.input();
        int randomnumber = myapp.randomnum();
        String reply = myapp.switchstring(randomnumber);
        System.out.printf("%s", reply);

    }

    private void input(){
        System.out.print("What's your question?");
         input.nextLine();
    }

    public int randomnum(){
        Random random = new Random();
        return random.nextInt(5 - 1) + 1;
    }

    public String switchstring(int randomnum){
        String[] test = {"Yes.", "No.", "Maybe.", "Ask again later."};

        return test[randomnum-1];
    }
}

