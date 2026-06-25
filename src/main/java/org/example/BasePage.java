package org.example;

import org.example.Utils.ConfigReader;
import org.example.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(ConfigReader.getLong("wait")));
        PageFactory.initElements(driver, this);

    }

    public void waitForElementToBeVisable(WebElement locator){
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public void waitForElementToBeClickable(WebElement locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }




//driverManager<-baseTest->LoginTest->LoginPage->BasePage


    public void sendKeys(WebElement locator, String text){
        waitForElementToBeVisable(locator);
        locator.clear();
        Utils.logInfo("Locator is cleared ");
        locator.sendKeys(text);
        Utils.logInfo("send key: " + text);
    }



    public void click(WebElement locator){
        waitForElementToBeClickable(locator);
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
