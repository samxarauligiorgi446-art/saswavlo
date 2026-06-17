package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage {




    @FindBy(className = "title")
    private WebElement inventoryHeader;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartBtnBike;

    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement removeToCartBtnBike;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement inventoryItemTitle;

    public InventoryPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getInventoryHeaderText(){
        return getText(inventoryHeader);
    }

    public void addToCartBikeBtn(){
        click(addToCartBtnBike);
    }

    public String getRemoveBtnText(){
        return getText(removeToCartBtnBike);
    }

    public String getProductTitle(){
        return getText(inventoryItemTitle);
    }









}
