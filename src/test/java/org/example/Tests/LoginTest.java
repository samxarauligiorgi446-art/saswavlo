package org.example.Tests;

import io.restassured.RestAssured;
import org.example.BaseTest;
import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.path.xml.XmlPath.given;

public class LoginTest extends BaseTest {


//    @DataProvider(name="userData")
//    public Object[][] provideData(){
//        return new Object[][]{
//                {"nana"},
//                {"giorgi"},
//                {"saba"},
//                {"sofia"},
//                {"tekla"},
//                {"mariami"}
//        };
//    }


//    @Test(dataProvider = "userData")
//    public void simpleTest(String username){
//        System.out.println("Hello" + username);
//    }
//
//    @Test(groups = {"smoke", "regression","login","blackbox"})
//    @Parameters({"username","password"})
//    public void testValidLogin(String username,String password){
//        LoginPage loginPage = new LoginPage(driver);
//        //login
//        loginPage.login(username,password);
//
//        //verify curent url
//        verifyCurrentUrl("https://www.saucedemo.com/inventory.html");
//
//        //verify page using header text
//        InventoryPage inventoryPage = new InventoryPage(driver);
//        compareText(inventoryPage.getInventoryHeaderText(),"Products");
//    }
//
//    @Test(groups = {"regression","ui"})
//    public void testLoginButtonTextColor(){
//        LoginPage loginPage = new LoginPage(driver);
//
//        String actualColor=loginPage.getLoginButtonTextColor();
//        String expectedColor="rgba(19, 35, 34, 1)";
//        compareText(actualColor,expectedColor);
//    }


    public void testGetPosts(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com/";

                given()

                .when()

                .get("/posts")

                .then();

                39.29
    }
}
