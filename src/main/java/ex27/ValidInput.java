/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex27;
import java.util.Scanner;
import java.lang.*;

public class ValidInput {
    public static void main(String[] args) {
        ValidInput myapp = new ValidInput();

        String Firstname = myapp.readInput("Enter the first name: ");
        String Lastname = myapp.readInput("Enter the last name: ");
        String ZIP = myapp.readInput("Enter the ZIP code: ");
        String ID = myapp.readInput("Enter the employee ID: ");

        String Output = validationMain(Firstname, Lastname, ZIP, ID);
        if(!Output.equals("")){
            System.out.printf("%s", Output);
        }
        else{
            System.out.print("There were no errors found.");
        }

    }

    private String readInput(String question){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", question);

        return input.nextLine();
    }

    public static String validationMain(String FirstString, String LastString, String ZIPString, String IDString){
        String FirstS = firstName(FirstString);
        String LastS = lastName(LastString);
        String ZIPS = ZIP(ZIPString);
        String IDS = employeeID(IDString);


        return FirstS + LastS + IDS + ZIPS;
    }


    private static String firstName(String Firstname){
        // If it is less than 2 characters
        if (Firstname.length() < 2){

            // If it is less than 2 characters and equals 0
            if (Firstname.length() == 0){
                return "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";
            }
            return "The first name must be at least 2 characters long.\n";
        }
        return "";

    }


    private static String lastName(String Lastname){
        // If it is less than 2 characters
        if (Lastname.length() < 2){

            // If it is less than 2 characters and equals 0
            if (Lastname.length() == 0){
                return "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";
            }
            return "The last name must be at least 2 characters long.\n";
        }
        return "";

    }


    private static String ZIP(String ZIP) {
        boolean Onlynumber = ZIP.matches("[0-9]+");

        if (!Onlynumber)
            return "The zipcode must be a 5 digit number.\n";

        return "";
    }


    private static String employeeID(String ID) {
        char[] IDarray = ID.toCharArray();

            // Condition for wrong ID
            if (ID.length() != 7){
                return "The employee ID must be in the format of AA-1234.\n";
            }

            // First two
            for (int i = 0; i < 2; i++) {
                char pointer = Character.toLowerCase(IDarray[i]);
                if(!(pointer >= 'a' && pointer <='z')){
                    return "The employee ID must be in the format of AA-1234.\n";
                }
            }

            // Next Hypthen
        if (IDarray[2] != '-') {
            return "The employee ID must be in the format of AA-1234.\n";
        }
        else {
            for (int i=0; i<4; i++){
                if (!Character.isDigit(IDarray[i+3]))
                    return "The employee ID must be in the format of AA-1234.\n";
            }
            return "";
        }
    }
}


