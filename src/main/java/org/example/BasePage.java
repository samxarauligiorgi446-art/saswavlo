package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }




//driverManager<-baseTest->LoginTest->LoginPage->BasePage


    public void sendKeys(WebElement locator, String text){
        locator.clear();
        locator.sendKeys(text);
    }
    public void click(WebElement locator){
        locator.click();
    }

    public String getText(WebElement locator){
        locator.getText();
    }

    public String getCssValue(WebElement locator, String propertyName){
        return locator.getCssValue(propertyName);
    }
}
