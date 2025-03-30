package com.demovebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test(enabled = false)
    public void newUserRegistrationTest(){

        clickOnRegisteredButton();
        clickGenderRadioButton("gender-female");
        fillFormRegistration(new User().setFirstName("Poman6").setLastName("Vasin").setMail("pov66@gmail.com").setPassword("123456Ss#0"));
        clickButtonRegistrationEnd("#register-button");
        Assert.assertTrue(isElementPresent(By.cssSelector(".button-1.register-continue-button")));

    }

    @Test
    public void existedUserRegistrationTest(){
        clickOnRegisteredButton();
        clickGenderRadioButton("gender-female");
        fillFormRegistration(new User().setFirstName("Poman6").setLastName("Vasin").setMail("pov66@gmail.com").setPassword("123456Ss#0"));
        clickButtonRegistrationEnd("#register-button");
        Assert.assertTrue(isElementPresent(By.cssSelector(".validation-summary-errors")));

    }




}
