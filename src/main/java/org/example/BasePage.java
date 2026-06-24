package org.example;

import org.example.Utils.Utils;
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
        Utils.logInfo("Locator is cleared ");
        locator.sendKeys(text);
        Utils.logInfo("send key: " + text);
    }



    public void click(WebElement locator){
        locator.click();
        Utils.logInfo("Click to: " + locator);
    }





    public String getText(WebElement locator){
        Utils.logInfo("returned Text: " + locator.getText());
        return locator.getText();

    }




    public String getCssValue(WebElement locator, String propertyName){
        return locator.getCssValue(propertyName);
    }
}
