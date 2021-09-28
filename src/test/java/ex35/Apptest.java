/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex35;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    //Size of 1
    void testInput1(){
        WinnerPick testapp = new WinnerPick();

        int size = 1;
        int programval = testapp.randomnum(size);
        boolean expectedval;

        if(programval >= 0 && programval <= size-1){
            expectedval = true;
        }
        else{
            expectedval = false;
        }

        assertTrue(expectedval);
    }

    @Test
        //Size of 3
    void testInput3(){
        WinnerPick testapp = new WinnerPick();

        int size = 3;
        int programval = testapp.randomnum(size);
        boolean expectedval;

        if(programval >= 0 && programval <= size-1){
            expectedval = true;
        }
        else{
            expectedval = false;
        }

        assertTrue(expectedval);
    }
    @Test
        //Size of 5
    void testInput5(){
        WinnerPick testapp = new WinnerPick();

        int size = 5;
        int programval = testapp.randomnum(size);
        boolean expectedval;

        if(programval >= 0 && programval <= size-1){
            expectedval = true;
        }
        else{
            expectedval = false;
        }

        assertTrue(expectedval);
    }

}
