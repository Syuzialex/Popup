package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class LandingPage {
    LandingPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/nav/div/a/img")
    private WebElement icon;
}
