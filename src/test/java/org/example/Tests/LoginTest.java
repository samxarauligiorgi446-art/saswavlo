package org.example.Tests;


import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import org.example.BaseTest;
import org.example.pages.InventoryPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

@Test
    public void testGetPosts(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com/";

        Map <String,Object> requestBody = new HashMap<>();
        requestBody.put("title","foo");
        requestBody.put("body","bar");
        requestBody.put("userId",1);



                    given()


//                    .header("Authorization","bearer your_token_is_here")
    //              .pathParam("userId",1)
//                    .contentType(JSON)
//                    .body(requestBody)

                    .when()

                    .get("/posts/1")

                    .then()
                    .statusCode(200)
                            .body("userId",equalTo(1));
//                    .extract()
//                    .path("title");




    }
}
