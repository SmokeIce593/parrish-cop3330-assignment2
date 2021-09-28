/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex25;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {
    // Only has numbers and is less than 8 characters
    @Test
    void numbersLess8(){
        App testapp = new App();

        int programval = testapp.passwordValidator("12345");
        int expectedval = 1;

        assertEquals(expectedval, programval);

    }

    // Only has letters and is less than 8 characters
    @Test
    void lettersLess8(){
        App testapp = new App();

        int programval = testapp.passwordValidator("fdaffda");
        int expectedval = 2;

        assertEquals(expectedval, programval);

    }
    // Contains letters, at least one number, more than 8 characters, and no special characters
    @Test
    void strongpass(){
        App testapp = new App();

        int programval = testapp.passwordValidator("fdaffda1234");
        int expectedval = 3;

        assertEquals(expectedval, programval);

    }
    // Contains letters, at least one number, more than 8 characters, and at least one special character
    @Test
    void verystrongpass(){
        App testapp = new App();

        int programval = testapp.passwordValidator("fdaffda1234=");
        int expectedval = 4;

        assertEquals(expectedval, programval);

    }
}
