/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex34;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    // Removing one item from list and seeing if list shifted
    void removesuccess(){
        EmployeeList testapp = new EmployeeList();
        boolean flag = false;

        // Names you want to add to list
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.add("Bob");
        employeeNames.add("Carole");

        // String you want to remove
        String Remove = "Bob";
        employeeNames = testapp.removal(Remove, employeeNames);

        if (employeeNames.get(0).equals("Carole")){
            flag = true;
        }

        assertTrue(flag);

    }

    @Test
        // Removing mistyping one item to remove
    void removefail(){
        EmployeeList testapp = new EmployeeList();
        boolean flag = false;

        // Names you want to add to list
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.add("Bob");
        employeeNames.add("Carole");

        // String you want to remove
        String Remove = "Bob1";
        employeeNames = testapp.removal(Remove, employeeNames);

        if (employeeNames.get(0).equals("Carole")){
            flag = true;
        }

        assertFalse(flag);

    }
}
