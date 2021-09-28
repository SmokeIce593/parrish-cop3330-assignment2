/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class Filtervalues {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Filtervalues myapp = new Filtervalues();
        ArrayList<Integer> parsed;

        String numberHold = myapp.input("Enter a list of numbers, separated by spaces: ");
        parsed = myapp.getInputList(numberHold);
        ArrayList<Integer> solution = evenNum(parsed);


        myapp.output(solution);
    }
    private void output(ArrayList<Integer> solution){
        System.out.print("The even numbers are: ");
        for (Integer integer : solution) {
            System.out.printf("%d ", integer);
        }
    }

    public static ArrayList<Integer> evenNum(ArrayList<Integer> parsed){
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer integer : parsed) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }
        return even;
    }

    public String input(String str){
        System.out.printf("%s", str);

        return input.nextLine();
    }

    public ArrayList<Integer> getInputList(String numberHold) {
        ArrayList<Integer> inputList = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for(int i=0; i<numberHold.length(); i++){
            if(Character.isWhitespace(numberHold.charAt(i))){
                inputList.add(Integer.parseInt(current.toString()));
                current = new StringBuilder();
            }
            else if(i == numberHold.length()-1) {
                current.append(numberHold.charAt(i));
                inputList.add(Integer.parseInt(current.toString()));
            }
            else {
                current.append(numberHold.charAt(i));
            }
        }

        return inputList;
    }


}

