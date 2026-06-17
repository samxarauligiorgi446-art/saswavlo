package org.example.pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {


    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement productTitle;


    public CartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public String getProductTitleFromCurrentPage(){
        return getText(productTitle);
    }


}
