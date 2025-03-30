package com.demovebshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public boolean isLogoPresent(){
        return driver.findElements(By.cssSelector(".header-logo")).size()>0;

    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;

    }

    @AfterMethod (enabled = false)
    public void teaDown(){
        driver.quit();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickButtonRegistrationEnd(String button) {
        click(By.cssSelector(button));
    }

    public void fillFormRegistration(User user) {
        type(By.name("FirstName"), user.getFirstName());
        type(By.cssSelector("[name='LastName']"), user.getLastName());
        type(By.cssSelector("[id='Email']"), user.getMail());
        type(By.name("Password"), user.getPassword());
        type(By.name("ConfirmPassword"), user.getPassword());
    }

    public void clickGenderRadioButton(String gender) {
        click(By.id(gender));
        //click(By.id("gender-male"));
        // click(By.id("gender-female"));
    }

    public void clickOnRegisteredButton() {
        clickButtonRegistrationEnd("[href='/register']");
    }
}
