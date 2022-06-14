package com.test;


import com.main.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DivTest {
    Calculator c;
    //static int testCaseNum = 0;
    int expResult = 0;
    int actResult = 0;

    @BeforeMethod
    public void beforeMessage(){
        c = new Calculator();
        //System.out.println("==TestCase# "+ ++testCaseNum);
    }
    @AfterMethod
    public void verifyAll(){
        System.out.println("==================");
    }


    @Test
    public void verify_WithBiggerPositiveDivisor(){

        expResult = 0;
        actResult = c.div(5,6);
        Assert.assertEquals(expResult, actResult);

    }

    @Test
    public void verify_WithZeroAndZero(){

        expResult = 1;
        actResult = c.div(0,0);
        Assert.assertEquals(expResult, actResult);


    }

    @Test
    public void verify_WithSmallerPositiveDivisor(){

        expResult = 5;
        actResult = c.div(10,2);
        Assert.assertEquals(expResult, actResult);

    }


    @Test
    public void verify_WithSameNegatives(){

        expResult = 1;
        actResult = c.div(-5,-5);
        Assert.assertEquals(expResult, actResult);

    }

    @Test
    public void verify_WithSamePositives(){

        expResult = 1;
        actResult = c.div(6,6);
        Assert.assertEquals(expResult, actResult);

    }

    @Test
    public void verify_WithOnePositiveOneNegative(){

        expResult = -10;
        actResult = c.div(100,-10);
        Assert.assertEquals(expResult, actResult);

    }

}
