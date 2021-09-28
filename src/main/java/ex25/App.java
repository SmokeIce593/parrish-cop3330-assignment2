/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex25;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) {
        App myapp = new App();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a password: ");
        String inpString = input.nextLine();
        int strength = myapp.passwordValidator(inpString);

        String StrengthString = "";

        // Switch for level of strength to prevent returning string
        switch(strength){
            case 0: StrengthString = "unknown";
                break;
            case 1: StrengthString = "very weak";
                break;
            case 2: StrengthString = "weak";
                break;
            case 3: StrengthString = "strong";
                break;
            case 4: StrengthString = "very strong";
                break;
        }
        System.out.printf("The password '%s' is a %s password", inpString, StrengthString);

    }


    public int passwordValidator(String inp) {
        int length = inp.length();

        // Checks to see if there is a number
        boolean number = inp.matches(".*\\d.*");
        boolean Onlynumber = inp.matches("[0-9]+");

        //Checks to see if string has a special character
        Pattern pattern= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inp);
        boolean special = matcher.find();

        // Length of password is less than 8
        if (length < 8){

            //If it only has numbers and is less than 8 in length
            if (Onlynumber){
                return 1;
            }

            // Checks to see if there are any numbers or special characters
            else if (!number && !special){
                return 2;
            }


        }

        // Length of password is 8 or greater
        else {

            // Checks to see if there are any special characters, numbers, and that it isn't all numbers.
            if (special && number && !Onlynumber){
                return 4;
            }

            // No special characters
            else if (!special && number && !Onlynumber){
                return 3;
            }
        }
        return 0;
    }
}


