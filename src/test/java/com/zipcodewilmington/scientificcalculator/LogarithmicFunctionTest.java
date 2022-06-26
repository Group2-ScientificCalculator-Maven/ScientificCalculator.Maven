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
        int num1 = 10;
        int expectedResult = 1;
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
    public void testLog1p() {
        int num1 = 9;
        double expectedResult = 2.302585092994046;
        //Ask
        double result = objLogarithmicfunction.log1p(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);]
    }

    @Test
    public void testE() {
        int num1 = 1;
        double expectedResult = 2.71828182846;
        //Ask
        double result = objLogarithmicfunction.e(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
}