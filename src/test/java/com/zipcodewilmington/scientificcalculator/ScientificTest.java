package com.zipcodewilmington.scientificcalculator;

import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ScientificTest {

    private Scientific objScientific;

    @Before
    public void setUp(){
        objScientific = new Scientific();
    }

    @Test
    public void testSin() {
        double num1 = 0;
        double expectedResult = 0;
        //Ask
        double result = objScientific.sin(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
    @Test
    public void testCos() {
        double num1 = 0;
        double expectedResult = 1;
        //Ask
        double result = objScientific.cos(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void tan() {
        double num1 = 0;
        double expectedResult = 0;
        //Ask
        double result = objScientific.tan(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testASin() {
        double num1 = 0;
        double expectedResult = 0;
        //Ask
        double result = objScientific.asin(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testACos() {
        double num1 = 1;
        double expectedResult = 0;
        //Ask
        double result = objScientific.acos(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testATan() {
        double num1 = 0;
        double expectedResult = 0;
        //Ask
        double result = objScientific.atan(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
}