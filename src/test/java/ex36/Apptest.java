/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex36;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


class Apptest {

    @Test
    void average(){
        ArrayList<Integer> numberarray = new ArrayList<>();
        numberarray.add(100);
        numberarray.add(200);
        numberarray.add(1000);
        numberarray.add(300);

        double programval = computingstats.averageCalc(numberarray);
        double expectedval = 400;


        assertEquals(expectedval, programval);
    }

    @Test
    void max(){
        ArrayList<Integer> numberarray = new ArrayList<>();
        numberarray.add(100);
        numberarray.add(200);
        numberarray.add(1000);
        numberarray.add(300);


        int programval = computingstats.maxVal(numberarray);
        double expectedval = 1000;


        assertEquals(expectedval, programval);
    }

    @Test
    void min(){
        ArrayList<Integer> numberarray = new ArrayList<>();
        numberarray.add(100);
        numberarray.add(200);
        numberarray.add(1000);
        numberarray.add(300);


        int programval = computingstats.minVal(numberarray);
        double expectedval = 100;


        assertEquals(expectedval, programval);
    }

    @Test
    void standard_deviation(){
        ArrayList<Integer> numberarray = new ArrayList<>();
        numberarray.add(100);
        numberarray.add(200);
        numberarray.add(1000);
        numberarray.add(300);


        double programval = computingstats.std(numberarray, 400);
        double expectedval = 353.5533905932738;


        assertEquals(expectedval, programval);
    }

}
