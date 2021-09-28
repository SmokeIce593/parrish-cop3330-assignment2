/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex27;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {
    @Test
        // Nothing wrong
    void SuccessTest() {

        String programval = ValidInput.validationMain("Cameron", "Parrish", "32766", "AA-1234");
        String expectedval = "";

        assertEquals(expectedval, programval);

    }

    @Test
        // One missing number
    void IDTest1() {

        String programval = ValidInput.validationMain("Cameron", "Parrish", "32766", "AA-123");
        String expectedval = "The employee ID must be in the format of AA-1234.\n";

        assertEquals(expectedval, programval);

    }

    @Test
        //Missing Hyphen
    void IDTest2() {

        String programval = ValidInput.validationMain("Cameron", "Parrish", "32766", "AA12345");
        String expectedval = "The employee ID must be in the format of AA-1234.\n";

        assertEquals(expectedval, programval);

    }

    @Test
        // 0 Letter First name
    void FirstName() {

        String programval = ValidInput.validationMain("", "Parrish", "32766", "AA-1234");
        String expectedval = "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";

        assertEquals(expectedval, programval);

    }


    @Test
        // 0 Letter Last name
    void LastName() {

        String programval = ValidInput.validationMain("Cameron", "", "32766", "AA-1234");
        String expectedval = "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";

        assertEquals(expectedval, programval);

    }

    @Test
        // 1 Letter Last name
    void LastName1() {

        String programval = ValidInput.validationMain("Cameron", "a", "32766", "AA-1234");
        String expectedval = "The last name must be at least 2 characters long.\n";

        assertEquals(expectedval, programval);

    }

    @Test
        // 1 Letter Last name
    void FirstName1() {

        String programval = ValidInput.validationMain("a", "Parrish", "32766", "AA-1234");
        String expectedval = "The first name must be at least 2 characters long.\n";

        assertEquals(expectedval, programval);

    }

    @Test
        // Letters in ZIP
    void ZIP() {

        String programval = ValidInput.validationMain("Cameron", "Parrish", "afa12", "AA-1234");
        String expectedval = "The zipcode must be a 5 digit number.\n";

        assertEquals(expectedval, programval);

    }


}


