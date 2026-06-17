package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
   protected WebDriver driver;

   @BeforeMethod
    public void setUp(){

        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com");
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.quitDriver();
    }


    public void verifyCurrentUrl(String expectedUrl){
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void compareText(String act, String Exp){
       Assert.assertEquals(act,Exp);
    }


21:31
}
