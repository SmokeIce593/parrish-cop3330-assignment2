/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex37;

import java.util.Collections;
import java.util.Scanner;
import  java.util.Random;
import java.util.ArrayList;

public class PasswordGenerator {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordGenerator myapp = new PasswordGenerator();
        ArrayList<String> solution;
        ArrayList<Character> letters;
        ArrayList<String> specialArray;
        ArrayList<Integer> numbersArray;

        int minlen = myapp.input("What's the minimum length? ");
        int specialchar = myapp.input("How many special characters?");
        int numbers = myapp.input("How many numbers? ");
        int minlencon = specialchar + numbers;

        int totalletters = extragen(minlen-specialchar-numbers, minlencon);
        letters = myapp.charactergenerator(totalletters);
        numbersArray = numgenerator(numbers);
        specialArray = myapp.specialChar();
        solution = combiningSol(totalletters, numbers, specialchar, letters, numbersArray, specialArray);
        myapp.output(totalletters, numbers, specialchar, solution);


    }

    private int input(String str){
        System.out.printf("%s", str);

        return input.nextInt();
    }

    private char randomnletter(){
        Random random = new Random();

        return (char)(random.nextInt(26) + 'a');
    }

    private static int randomnum(){
        Random random = new Random();
        return random.nextInt(10);
    }

    private static int randomnumcap7(){
        Random random = new Random();
        return random.nextInt(8);
    }


    public ArrayList<Character> charactergenerator(int totallength){
        ArrayList<Character> letters = new ArrayList<>();
        for (int i=0; i<totallength; i++){
            letters.add(randomnletter());
        }
        return letters;
    }

    public static ArrayList<Integer> numgenerator(int numbers){
        ArrayList<Integer> numbersArray = new ArrayList<>();

        for(int i=0; i<numbers; i++){
            numbersArray.add(randomnum());
        }

        return numbersArray;
    }

    public static int extragen(int minlen, int minlencon){
        // How many extra characters will there be?
        int extra = randomnum();
        int totallength;

        //Use minlencon for how many values
        if (minlen < minlencon){
            totallength = minlencon + extra;
        }
        //Use minlen for how many values
        else{
            totallength = minlen + extra;
        }

        return totallength;
    }


    private ArrayList<String> specialChar() {
        ArrayList<String> specialCharArray = new ArrayList<>();
        specialCharArray.add("%");
        specialCharArray.add("!");
        specialCharArray.add("*");
        specialCharArray.add("@");
        specialCharArray.add("#");
        specialCharArray.add("$");
        specialCharArray.add("^");
        specialCharArray.add("&");
        return specialCharArray;
    }

    private static ArrayList<String> combiningSol(int totalletters, int numbers, int specialchar, ArrayList<Character> letters, ArrayList<Integer> numbersArray, ArrayList<String> specialArray){
        ArrayList<String> solution = new ArrayList<>();
        for (int i = 0; i < totalletters; i++) {
            solution.add(Character.toString(letters.get(i)));
        }

        for (int i = 0; i < numbers; i++) {
            solution.add(Character.toString(Character.forDigit(numbersArray.get(i), 10)));
        }

        for (int i = 0; i < specialchar; i++) {
            solution.add(specialArray.get(randomnumcap7()));
        }


        System.out.print("\n");
        Collections.shuffle(solution);

        return solution;
    }
    private void output(int totalletters, int numbers, int specialchar, ArrayList<String> solution){
        for (int i = 0; i < totalletters+numbers+specialchar; i++) {
            System.out.printf("%s", solution.get(i));
        }
    }



}

