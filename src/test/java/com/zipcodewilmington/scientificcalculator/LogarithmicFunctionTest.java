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
        double num1 = 3;
        double num2 = 81;
        double expectedResult = 4;
        //Ask
        double result = objLogarithmicfunction.Log(num1, num2);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testInverseLog() {
        int num1 = 1000;
        int expectedResult = 3;
        //Ask
        double result = objLogarithmicfunction.inverseLog(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testInverseLn() {
        int num1 = 0;
        double expectedResult = 1;
        //Ask
        double result = objLogarithmicfunction.inverseLn(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testNaturalLog() {
        double num1 = 1;
        double expectedResult = 0;
        //Ask
        double result = objLogarithmicfunction.naturalLog(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
}