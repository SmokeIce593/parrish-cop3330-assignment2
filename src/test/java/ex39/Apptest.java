/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Apptest {

    @Test
    void testSuccessDecipher(){
        SortingRecords testapp = new SortingRecords();
        ArrayList<String> partition;
        ArrayList<String> compare = new ArrayList();
        compare.add("Bob");
        compare.add("Joe");
        compare.add("1995");
        partition= testapp.decipher("Bob,Joe,1995,");

        assertArrayEquals(compare.toArray(), partition.toArray());

    }
}
