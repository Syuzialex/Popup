package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.SeleniumActions;

public class LoginPage extends LandingPage {
    @FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/div[2]/a[1]")
    private WebElement logIn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/form/button")
    private WebElement login;

    public void clickOnLogIn(){
        SeleniumActions.clickOnElement(logIn);
    }
    public void typeTextOnEmail(){
        SeleniumActions.typeTextOnElement(email, "syuzanna.aleksanyan@popupschool.com");
    }
    public void typeTextOnPassword(){
        SeleniumActions.typeTextOnElement(password, "dasaran.am1234@");
    }
    public void clickOnLogin(){
        SeleniumActions.clickOnElement(login);
    }
}

