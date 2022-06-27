package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FactorialFunctionTest {
    private FactorialFunction objFactorialFunction;
    @Before
    public void setUp() {
        objFactorialFunction = new FactorialFunction();
    }

    @Test
    void testFactorial() {
        double num1 = 5;
        double expectedResult = 120;
        //Ask
        double result = objFactorialFunction.factorial(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

}