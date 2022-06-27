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
        int num1 = 5;
        int expectedResult = 120;
        //Ask
        int result = objFactorialFunction.factorial(num1);
        //Assert
        Assert.assertEquals(expectedResult, result);
    }

}