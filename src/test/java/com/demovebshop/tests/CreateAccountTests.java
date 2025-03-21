package com.demovebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test
    public void newUserRegistrationTest(){
        //click on register link
        click(By.cssSelector("[href='/register']"));
        //enter gender
        click(By.id("gender-female"));
        //enter first name
        type(By.name("FirstName"), "Poman6");
        //enter last name
        type(By.cssSelector("[name='LastName']"), "Vasin");
        //enter email
        type(By.cssSelector("[id='Email']"), "pov66@gmail.com");
        //enter password
        type(By.name("Password"), "123456Ss#0");
        //enter confirm password
        type(By.name("ConfirmPassword"), "123456Ss#0");
        //click on Registration button
        click(By.cssSelector("#register-button"));
        //verify
        Assert.assertTrue(isElementPresent(By.cssSelector(".button-1.register-continue-button")));

    }


}
