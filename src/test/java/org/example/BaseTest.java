package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Utils.ConfigReader;
import org.example.Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
   protected WebDriver driver;

   @BeforeTest(alwaysRun = true)
    public void setUp(){

        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
       driver.get(ConfigReader.get("base.url"));
    }

//    @AfterTest(alwaysRun = true)
    public void tearDown(){
        DriverManager.quitDriver();
    }

    public String getCurrentUrl(){
       return driver.getCurrentUrl();
    }

    public void navigateTo(String url){
       driver.navigate().to(url);
    }


    public void verifyCurrentUrl(String expectedUrl){
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    public void compareText(String act, String Exp){
       Assert.assertEquals(act,Exp);
    }



}
