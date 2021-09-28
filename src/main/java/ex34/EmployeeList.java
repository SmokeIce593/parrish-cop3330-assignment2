/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex34;

import java.util.*;
import java.util.ArrayList;

public class EmployeeList {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeList myapp = new EmployeeList();
        List<String> namesList = Arrays.asList( "John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin");
        ArrayList<String> employeeNames = new ArrayList<>(namesList);


        while (employeeNames.size() != 0){
            myapp.print(employeeNames);
            String Remove = myapp.input();
            employeeNames = myapp.removal(Remove, employeeNames);
        }

    }

    private String input(){
        System.out.print("\nEnter an employee name to remove:");
        String holder = input.nextLine();
        System.out.print("\n");
        return holder;
    }

    public ArrayList<String> removal(String Remove, ArrayList<String> employeeNames){
        for (int i=0; i<employeeNames.size(); i++)
        if (employeeNames.get(i).equals(Remove)){
            employeeNames.remove(i);
        }
        return employeeNames;
    }

    private void print(ArrayList<String> employeeNames){
        System.out.printf("There are %d employees:\n", employeeNames.size());

        for(int i=0; i<employeeNames.size(); i++) {
            System.out.printf("%s\n", employeeNames.get(i));
        }
    }
}