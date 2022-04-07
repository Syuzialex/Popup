package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class LandingTest {
    final String BASE_URL = "https://www.popupschool.com/";
    void navigateToURI(String path){
        DriverFactory.getDriver().get(BASE_URL + path);
    }
    @BeforeMethod
    public void setUp(){
        DriverFactory.initDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}

