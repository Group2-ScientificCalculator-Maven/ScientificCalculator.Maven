package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoreCalcTest {

    @Test
    void addition() {
        //Given
        CoreCalc coreCalc = new CoreCalc();
        double first = 5.0;
        double second = 10.0;

        //When
        double expected = 15.0;
        double actual = coreCalc.addition(first, second);

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void subtraction() {
    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }

    @Test
    void square() {
    }

    @Test
    void exponential() {
    }

    @Test
    void squareRoot() {
    }

    @Test
    void inverse() {
    }

    @Test
    void invert() {
    }
}