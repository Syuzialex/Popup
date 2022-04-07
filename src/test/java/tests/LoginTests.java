package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTests extends LandingTest{
    final String PATH = "login?as=educator";
    //          //div[@class='subject-area mt-40']//li
   //          //li[@class='dropdown-submenu']/span
    @BeforeMethod
    void openPage(){
        navigateToURI(PATH);

    }

    @Test
    void teacherLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.typeTextOnEmail();
        loginPage.typeTextOnPassword();
        loginPage.clickOnLogin();
        Assert.assertTrue(true);


        }


    }



