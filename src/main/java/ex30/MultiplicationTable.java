/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex30;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable myapp = new MultiplicationTable();

        // Creating table
        String tableString = myapp.Table();

        // Outputting string containing table
        System.out.printf("%s", tableString);
    }


    private String Spaces(int tablenum) {
        StringBuilder spacesArray = new StringBuilder();

        String getLenOfNum = String.format("%d", tablenum);
        int numberlength = getLenOfNum.length();

        // Number of spaces between numbers
        int spacenum = 5;

        int totalspaces = spacenum - numberlength;
        for (int i = 0; i < totalspaces; i++) {
            spacesArray.append(" ");
        }
        return spacesArray.toString();
    }


    public String Table() {
        StringBuilder tableSB = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                int multiplicationval = j * i;
                String Space = Spaces(multiplicationval);
                tableSB.append(String.format("%s%d", Space, multiplicationval));
            }
            tableSB.append("\n");
        }
        return tableSB.toString();
    }
}