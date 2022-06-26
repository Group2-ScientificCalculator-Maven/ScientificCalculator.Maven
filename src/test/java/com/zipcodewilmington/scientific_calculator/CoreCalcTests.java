package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CoreCalc;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CoreCalcTests {
    private CoreCalc objCoreCalcTest;

    @Before
    public void setUp() {
        objCoreCalcTest = new CoreCalc();
    }

    @Test
    public void testAddition() {
        int num1 = 20; int num2 = 30;
        int expectedResult = 50;
      //Act
        double result = objCoreCalcTest.addition(num1, num2);
      //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testSubtracting() {
        int num1 = 50; int num2 = 30;
        int expectedResult = 20;
        //Act
        double result = objCoreCalcTest.subtraction(num1, num2);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testMultiplication() {
        int num1 = 5; int num2 = 6;
        int expectedResult = 30;
        //Act
        double result = objCoreCalcTest.multiplication(num1, num2) ;
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

    @Test
    public void testDivision() {
        int num1 = 30; int num2 = 6;
        int expectedResult = 5;
        //Act
        double result = objCoreCalcTest.division(num1, num2);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01);
    }

    @Test
    public void testSquare() {
        int num1 = 5;
        int expectedResult = 25;
        //Act
        double result = objCoreCalcTest.square(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01);
    }

//    @Test
//    public void testExponential() {
//        int num1 = 4; int num2 = 2;
//        int expectedResult = 16;
//        //Act
//        double result = objCoreCalcTest.exponential(num1, num2);
//        //Assert
//        Assert.assertEquals(expectedResult, result, 0.01);
//        }

    }

