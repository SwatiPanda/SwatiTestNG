package com.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstDemo {
    @Test
    public void verifyUserLogin(){
        System.out.println("Test 1");
    }

    @Test
    public void verifyUserCredential(){
        System.out.println("Test 2");
    }

    @Test
    public void verifyUserLogout(){
        System.out.println("Test 3");
    }

    @BeforeMethod
    public void initialWork(){
        System.out.println("Test 0");
    }

    @AfterMethod
    public void finalWork(){
        System.out.println("Test final");
    }

}
