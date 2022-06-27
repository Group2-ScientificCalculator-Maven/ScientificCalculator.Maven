package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LogarithmicFunctionTest {
    private LogarithmicFunction objLogarithmicfunction;

    @Before
    public void setUp() {
        objLogarithmicfunction = new LogarithmicFunction();
    }

    @Test
    public void testLog() {
        double num1 = 10;
        double expectedResult = 1;
        //Ask
        double result = objLogarithmicfunction.log(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testLog10() {
        int num1 = 1000;
        int expectedResult = 3;
        //Ask
        double result = objLogarithmicfunction.log10(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testInverseLn() {
        int num1 = 2;
        double expectedResult = 7.38905609893;
        //Ask
        double result = objLogarithmicfunction.inverseLn(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testE() {
        double num1 = 1;
        double expectedResult = 2.71828182846;
        //Ask
        double result = objLogarithmicfunction.e(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
}