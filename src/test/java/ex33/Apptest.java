/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Cameron Parrish
*/

package ex33;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
     void testInput1(){
        Magic8Ball testapp = new Magic8Ball();

        int programval = testapp.randomnum();
        boolean expectedval;

        expectedval = programval >= 1 && programval <= 4;

        assertTrue(expectedval);

    }
}
