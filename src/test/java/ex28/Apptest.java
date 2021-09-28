/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex28;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {
    // Add numbers
    @Test
    void addNumbers1(){
        AddingNum testapp = new AddingNum();

        int[] array = {1, 2, 3, 4, 5};
        int programval = testapp.getvalue(array);
        int expectedval = 15;

        assertEquals(expectedval, programval);

    }
    @Test
    void addNumbers2(){
        AddingNum testapp = new AddingNum();

        int[] array = {2, -2, 3, 4, 5};
        int programval = testapp.getvalue(array);
        int expectedval = 12;

        assertEquals(expectedval, programval);

    }
    @Test
    void addNumbers3(){
        AddingNum testapp = new AddingNum();

        int[] array = {2, 2, 3, 4, -15};
        int programval = testapp.getvalue(array);
        int expectedval = -4;

        assertEquals(expectedval, programval);

    }
}
