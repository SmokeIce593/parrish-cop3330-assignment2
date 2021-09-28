/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Cameron Parrish
*/

package ex29;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    void testInput1(){
        BadInput testapp = new BadInput();

        boolean programval = testapp.calculation("123");

        assertTrue(programval);

    }

    @Test
    void testInput2(){
        BadInput testapp = new BadInput();

        boolean programval = testapp.calculation("fdafda");

        assertFalse(programval);

    }
}
