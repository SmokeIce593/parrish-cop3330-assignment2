/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Cameron Parrish
*/

package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        AnagramCheck myapp = new AnagramCheck();
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        String First = myapp.input("Enter the first string: ");
        String Second = myapp.input("Enter the second string: ");
        boolean Anagram = myapp.isAnagram(First, Second);
        myapp.output(Anagram, First, Second);
    }

    public String input(String str) {
        System.out.printf("%s", str);

        return input.nextLine();
    }

    public boolean isAnagram(String First, String Second) {
        boolean anagram = false;

        // If they string equal eachother
        if (First.length() == Second.length()){
            char[] ArrayFirst = First.toLowerCase().toCharArray();
            char[] ArraySecond = Second.toLowerCase().toCharArray();
            Arrays.sort(ArrayFirst);
            Arrays.sort(ArraySecond);
            anagram = Arrays.equals(ArrayFirst, ArraySecond);
        }

        return anagram;
    }

    private void output(boolean output, String First, String Second) {
        if(output){
            System.out.printf("%s and %s are anagrams", First, Second);
        }
        else{
            System.out.printf("%s and %s are not anagrams", First, Second);
        }

    }

}

