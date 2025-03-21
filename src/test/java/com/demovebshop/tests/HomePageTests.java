package com.demovebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests  extends TestBase{

    @Test
    public void isLogoPresentTest(){
        //driver.findElement(By.cssSelector(".header-logo"));
        //System.out.println("Logo " + isLogoPresent());
        Assert.assertTrue(isLogoPresent());
    }

}
