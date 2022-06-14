package com.test;

import com.main.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModuloTest {
    Calculator c;

    @BeforeMethod
    public void setUp(){
        c = new Calculator();
    }

    @Test
    public void verifyWithOneZeroAndOtherzero(){
        int expResult = 4;
        int actResult = c.modulo(9,5);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithNegative10AndPositiveThree(){
        int expResult = 0;
        int actResult = c.modulo(5,1);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndNegativeThree(){
        int expResult = 1;
        int actResult = c.modulo(1,5);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithNegativeFiveAndPositiveZero(){
        int expResult = 0;
        int actResult = c.modulo(-15,-3);
        Assert.assertEquals(expResult, actResult);
    }
    @Test
    public void verifyWithPositiveThirtyAndPositiveTen(){
        int expResult =-3;
        int actResult = c.modulo(-15,4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen1(){
        int expResult =3;
        int actResult = c.modulo(15,-4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen2(){
        int expResult =0;
        int actResult = c.modulo(0,4);
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void verifyWithPositiveThirtyAndPositiveTen3(){
        int expResult =0;
        int actResult = c.modulo(15,1);
        Assert.assertEquals(expResult, actResult);
    }
}

