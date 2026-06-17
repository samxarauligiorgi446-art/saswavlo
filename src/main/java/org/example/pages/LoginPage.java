package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {




    @FindBy (id = "user-name")
    private WebElement usernameField;

    @FindBy (id = "password")
    private WebElement getPasswordField;

    @FindBy (id = "login-button")
    private WebElement loginButton;




    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void login(String username, String password){

        sendKeys(usernameField, username);
        sendKeys(getPasswordField, password);
        click(loginButton);
    }

    public String getLoginButtonTextColor (){
        return getCssValue(loginButton,"color");

    }






}
