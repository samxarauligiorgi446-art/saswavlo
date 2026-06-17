package org.example.Tests;

import org.example.BaseTest;
import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {



    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        //login
        loginPage.login("standard_user","secret_sauce");

        //verify curent url
        verifyCurrentUrl("https://www.saucedemo.com/inventory.html");

        //verify page using header text
        InventoryPage inventoryPage = new InventoryPage(driver);
        compareText(inventoryPage.getInventoryHeaderText(),"Products");
    }

    @Test
    public void testLoginButtonTextColor(){
        LoginPage loginPage = new LoginPage(driver);

        String actualColor=loginPage.getLoginButtonTextColor();
        String expectedColor="rgba(19, 35, 34, 1)";
        compareText(actualColor,expectedColor);
    }
}
