package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EditeProfilePage;
import pages.LoginPage;

public class EditeProfileTests extends LandingTest {
    final String PATH = "login?as=educator";

    @BeforeMethod
    void logIn() {
        navigateToURI(PATH);
        LoginPage loginPage = new LoginPage();
        loginPage.typeTextOnEmail();
        loginPage.typeTextOnPassword();
        loginPage.clickOnLogin();
        Assert.assertTrue(true);
    }

    @Test
    void editeProfile() {

        EditeProfilePage editeProfilePage = new EditeProfilePage();
        editeProfilePage.clickOnProfile();
        editeProfilePage.clickOnEditeProfileBtn();
        editeProfilePage.clickOnPublicName();
        editeProfilePage.typeTextOnBirthDay();
        editeProfilePage.typeOnBirthMonth();

        editeProfilePage.typeOnBirthYear();
        editeProfilePage.clickOnGenderSection();
        editeProfilePage.typeOnGender();

        editeProfilePage.clickOnSaveBtn();
    }
}
