/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex26;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class Apptest {
        @Test
        void basicTest(){
            PaymentCalculator testapp = new PaymentCalculator();

            int programval = testapp.calculateMonthsUntilPaidOff(5000, 12, 100);
            int expectedval = 70;

            assertEquals(expectedval, programval);

        }
        @Test
        void ZeroTest(){
            PaymentCalculator testapp = new PaymentCalculator();

            int programval = testapp.calculateMonthsUntilPaidOff(0, 12, 100);
            int expectedval = 0;

            assertEquals(expectedval, programval);

        }

}
