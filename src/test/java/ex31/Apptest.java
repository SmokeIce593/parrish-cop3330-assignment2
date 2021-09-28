/*
*   UCF COP3330 Fall 2021 Assignment 2 Solution
*   Copyright 2021 Cameron Parrish
*/

package ex31;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    void testMath(){
        HeartRate testapp = new HeartRate();

        int[] programval = testapp.calculator(22, 65);
        int[] expectedval = {138, 144, 151, 158, 164, 171, 178, 184, 191};

        assertArrayEquals(programval, expectedval);

    }
}
