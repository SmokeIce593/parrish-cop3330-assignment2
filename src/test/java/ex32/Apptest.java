/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex32;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    void Lessthan10(){
        GuessNumber testapp = new GuessNumber();

        int programval = testapp.randomnum(1);
        boolean expectedval = programval >= 1 && programval <= 10;

        assertTrue(expectedval);

    }

    @Test
    void Lessthan100(){
        GuessNumber testapp = new GuessNumber();

        int programval = testapp.randomnum(2);
        boolean expectedval = programval >= 1 && programval <= 100;

        assertTrue(expectedval);

    }

    @Test
    void Lessthan1000(){
        GuessNumber testapp = new GuessNumber();

        int programval = testapp.randomnum(2);
        boolean expectedval = programval >= 1 && programval <= 1000;

        assertTrue(expectedval);

    }

    @Test
    void Validation(){
        GuessNumber testapp = new GuessNumber();

        boolean programval = testapp.validcheck("1", 1);

        assertTrue(programval);

    }

    @Test
    void ValidationFail(){
        GuessNumber testapp = new GuessNumber();

        boolean programval = testapp.validcheck("2", 1);

        assertFalse(programval);

    }
}
