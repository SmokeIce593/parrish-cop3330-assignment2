/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex32;

import java.util.Scanner;
import  java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        boolean playagain = true;
        while(playagain){
            GuessNumber myapp = new GuessNumber();
            System.out.print("Let's play Guess the Number!\n\nEnter the difficulty level (1, 2, or 3): ");
            int difficulty = myapp.input();
            int guesses = myapp.game(difficulty);

            System.out.printf("You got it in %d guesses!\n", guesses);
           playagain = playagaininput();

        }
    }

    private int input() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("Input is not a number.");
            input.nextLine();
        }

        return input.nextInt();
    }

    public static boolean playagaininput() {
        Scanner input = new Scanner(System.in);
        boolean playagain;
        System.out.print("Would you like to play again?(Y/N): ");

        String playagainString = input.nextLine().toLowerCase();
        if (playagainString.equals("y")){
            playagain = true;
        }
        else if (playagainString.equals("n")){
            playagain = false;
        }
        else {
            System.out.print("This is not a valid input. We will assume you want to play again.\n");
            playagain = true;
        }

        return playagain;
    }

    public int game(int difficulty) {
        Scanner input = new Scanner(System.in);
       boolean valid = false;
       int guesses = 0;
       int computernum = randomnum(difficulty);
       String guessString;
        System.out.printf("I have my number. What's your guess? %d", computernum);

       while (!valid){
           guessString = input.nextLine();
           guesses+= 1;
           valid = validcheck(guessString, computernum);
       }

        return guesses;
       }


    public int randomnum(int difficulty) {
        Random random = new Random();
        int num = 1;
        switch(difficulty){
            case 1: num = 10;
                    break;
            case 2: num = 100;
                    break;
            case 3: num = 1000;
                    break;

        }

        return random.nextInt(num - 1) + 1;
    }

    public boolean guessvalid(String guess) {
        boolean isInputInt;
        try {
            int input = Integer.parseInt(guess);
            isInputInt = true;
        } catch (NumberFormatException nfe) {
            isInputInt = false;
        }
        return isInputInt;
    }

    private void loworhigh(int currentguess, int computernum){
        if (currentguess < computernum){
            System.out.print("Too low. Guess again: ");
        }
        else{
            System.out.print("Too High. Guess again: ");
        }
    }

    public boolean validcheck(String guessString, int computernum){
        boolean valid = false;
        if(!guessvalid(guessString)){
            System.out.print("Not a valid input");
        }
        else{
            int currentguess = Integer.parseInt(guessString);
            if (computernum == currentguess){
                valid = true;
            }
            else{
                loworhigh(currentguess, computernum);
            }
        }
        return valid;
    }


}

