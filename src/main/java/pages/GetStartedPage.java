
    package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.SeleniumActions;

    public class GetStartedPage extends LandingPage{
        @FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/div[2]/a[2]")
        private WebElement getStarted;

        @FindBy(id = "fullName")
        private WebElement fullName;

        @FindBy(id = "displayName")
        private WebElement displayName;

        @FindBy(id = "email")
        private WebElement email;

        @FindBy(id = "password")
        private WebElement password;

        @FindBy(id ="passwordConfirmation")
        private WebElement passwordConfirmation;

        @FindBy(xpath = "//*[@id=\"__next\"]/form/div/div/div/div[6]/div/input")
        private WebElement checkbox;

        @FindBy (xpath = "//*[@id=\"__next\"]/form/div/div/div/button")
        private WebElement signUp;

        public void clickOnGetStarted(){
            SeleniumActions.clickOnElement(getStarted);

        }
        public void typeTextOnFullName(){
            SeleniumActions.typeTextOnElement(fullName, "Maria G");
        }
        public void typeTextOnDisplayName(){
            SeleniumActions.typeTextOnElement(displayName, "ELA teacher");

        }
        public void typeTextOnEmail(){
            SeleniumActions.typeTextOnElement(email, "mariag@gmail.com");

        }
        public void typeTextOnPassword(){
            SeleniumActions.typeTextOnElement(password, "asdfg12345.,");

        }
        public void typeTextOnPasswordConfirmation(){
            SeleniumActions.typeTextOnElement(passwordConfirmation, "asdfg12345.,");

        }
        public void clickOnCheckbox() {
            SeleniumActions.clickOnElement(checkbox);
        }
        public void clickOnSignUp() {
            SeleniumActions.clickOnElement(signUp);
        }


    }


