/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex37;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    void testInput1(){

        // 8 total - 2 special - 2 numbers total = total letters
        int lengthSpecialNum = 4;
        int length = 8-lengthSpecialNum;
        boolean expectedval = false;

        int programval = PasswordGenerator.extragen(length, lengthSpecialNum);

        if (programval >= length && programval >= lengthSpecialNum)
            expectedval = true;

        assertTrue(expectedval);

    }
}
