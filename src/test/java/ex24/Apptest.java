/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex24;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {
    @Test
    void AnagramCheck1(){
        AnagramCheck testapp = new AnagramCheck();

        boolean programval = testapp.isAnagram("note", "tone");

        assertTrue(programval);

    }
    @Test
    void AnagramCheck2(){
        AnagramCheck testapp = new AnagramCheck();

        boolean programval = testapp.isAnagram("note", "tone1");

        assertFalse(programval);

    }

    @Test
    void AnagramCheck3(){
        AnagramCheck testapp = new AnagramCheck();

        boolean programval = testapp.isAnagram("note1", "tone");

        assertFalse(programval);

    }

    @Test
    void AnagramCheck4(){
        AnagramCheck testapp = new AnagramCheck();

        boolean programval = testapp.isAnagram("bob", "tone");

        assertFalse(programval);

    }




}
