package org.example.Tests;

import org.example.BaseTest;
import org.example.pages.CartPage;
import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest {

    @Test
    public void testAddcart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce" );

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addToCartBikeBtn();

        //Check if add to cart
        String actualText = inventoryPage.getRemoveBtnText();
        String expectedText = "Remove";
        compareText(actualText,expectedText);

        navigateTo("https://www.saucedemo.com/cart.html");


        CartPage cartPage = new CartPage(driver);
        String expectedItemTitle = inventoryPage.getProductTitle();
        String actualItemTitle =cartPage.getProductTitleFromCurrentPage();
        compareText(actualItemTitle,expectedItemTitle);

    }
}
