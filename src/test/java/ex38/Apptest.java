/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex38;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Apptest {

    @Test
    void BasicEventest(){
        ArrayList<Integer> even;

        // What should be in the array after even is undergone
        ArrayList<Integer> compare = new ArrayList<>();
        compare.add(10);

        // All values entered in
        ArrayList<Integer> allvalues = new ArrayList<>();
        allvalues.add(10);
        allvalues.add(11);

        even = Filtervalues.evenNum(allvalues);



        assertArrayEquals(compare.toArray(), even.toArray());

    }
    @Test
    void Filter(){
        Filtervalues testapp = new Filtervalues();

        // What should be in the array after even is undergone
        ArrayList<Integer> compare = new ArrayList<>();
        compare.add(10);
        compare.add(20);
        compare.add(15);

        // All values entered in
        ArrayList<Integer> allvalues;


        allvalues = testapp.getInputList("10 20 15");



        assertArrayEquals(compare.toArray(), allvalues.toArray());

    }
}