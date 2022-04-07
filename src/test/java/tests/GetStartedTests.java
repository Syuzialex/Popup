package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.GetStartedPage;

public class GetStartedTests extends LandingTest {

    final String PATH = "";



    @BeforeMethod
    void openPage() {
        navigateToURI(PATH);

    }

    @Test
    void teacherSignUp() {
        GetStartedPage getStartedPage = new GetStartedPage();
        getStartedPage.clickOnGetStarted();
        getStartedPage.typeTextOnFullName();
        getStartedPage.typeTextOnDisplayName();
        getStartedPage.typeTextOnEmail();
        getStartedPage.typeTextOnPassword();
        getStartedPage.typeTextOnPasswordConfirmation();
        getStartedPage.clickOnCheckbox();
        getStartedPage.clickOnSignUp();

    }
}

