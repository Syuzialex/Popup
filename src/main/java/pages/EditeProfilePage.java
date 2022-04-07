package pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DriverFactory;
import utils.SeleniumActions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EditeProfilePage extends LandingPage {
    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[2]/a")
    private WebElement profile;

    @FindBy(xpath = "//*[@id=\"content\"]/section[1]//div/a")
    private WebElement editeProfile;

    @FindBy(id = "fullName")
    private WebElement fullName;

    @FindBy(id = "displayName")
    private WebElement displayName;

    @FindBy(id = "birthDay")
    private WebElement birthDay;

    @FindBy(id = "birthMonth")
    private WebElement birthMonth;

    @FindBy(id = "birthYear")
    private WebElement birthYear;

    @FindBy(id = "gender")
    private WebElement gender;

    @FindBy(id = "subjects[0]")
    private WebElement iTeach;

    @FindBy(className = "//*[@class='form-control']")
    private WebElement bio;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "onSubmitBtn")
    private WebElement saveChanges;

    public void clickOnProfile(){
        SeleniumActions.clickOnElement(profile);
    }
    public void clickOnEditeProfileBtn(){
        SeleniumActions.clickOnElement(editeProfile);
    }
     public void clickOnPublicName(){
        SeleniumActions.clickOnElement(fullName);

     }
     public void typeTextOnFullName(){
        SeleniumActions.typeTextOnElement(fullName, "Miss S");
     }
     public void clickOnDisplayName(){
        SeleniumActions.clickOnElement(displayName);
     }
     public void typeTextOnDisplayName(){
        SeleniumActions.typeTextOnElement(displayName, "Miss Syuzi");
     }
     public void typeTextOnBirthDay(){
        SeleniumActions.typeTextOnElement(birthDay, "22");
     }
     public void typeOnBirthMonth(){
        SeleniumActions.typeTextOnElement(birthMonth, "2");
     }
     public void typeOnBirthYear(){
        SeleniumActions.typeTextOnElement(birthYear, "1989");
     }
     public void clickOnGenderSection(){
        SeleniumActions.clickOnElement(gender);
     }
     public void typeOnGender(){
        SeleniumActions.typeTextOnElement(gender, "2");
     }

     public void clickOnSaveBtn(){
        SeleniumActions.clickOnElement(saveChanges);
     }







    public static void setCookie(String URI) {
        String loginToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpYXQiOjE2NDg5NjcyNjUsImV4cCI6MTY0ODk3ODA2NSwicm9sZXMiOlsiUk9MRV9VU0VSIl0sInVzZXJuYW1lIjoic3l1emFubmEuYWxla3NhbnlhbkBwb3B1cHNjaG9vbC5jb20ifQ.nUIyTRjY-EWD06Fx44QBGEjYJeV_jWCuI2l-S86rJiH-0uoMSztpPGNpSov_hnz5pgMTfztoM2bToC_IFarDowpvexmS-qMCIHY2Q12J_9pmA44OogHgLhTEW0Iq2bQIQ7cL-tjKUJ0NvMRnT72P2OpY418NGbVLcZXR_e7mccLgaVuGHvBcZBpysA4TpVE4X9mDBXQbwnd7WQndPOtIVJEX6qmNk60TShpqtUQ3G-0mrkU4CBw2SD6_bi_goj8vDRXZxqtrck4c62DpSdZ2QjqntGT5AfT8jBKOE_1bTFFnsTVTsUZCQvJ-Yd20MWtIYQr1Pbx8WWBaBLVKq0SusBo7NLznEiyXZcNwy0gpzUQh8rpHZjECqZ1dRbtdhXoyMbr0qivGC2BWCeZmfremgQzWvsW0h_s0YfaahYP8uoFoYmyCoU0kXzQKpamteh62jQ4zu4KHoJJ_fk2owIwqSQQM5LT1Fvcqk-Go_cZUkE1RKP1z-IUn1_H_xcRuaTYucHgeFsknJp9n0BzydVmhVZe11fXDNKyCPt9gaCikKLBf9TZSv3NLIw-Eyg37P39m2m0WpzW6ggzq-lzjd91FBG-1kyAvwgSZmgOHXt7aSUEZ3-yYQR_94ijZG6fpxLzCC7EiHWaPfRuVlV-aHexBxLUbJpG6rNxItd-ytb9zGkE\n";
        /*
         * Get Date of now
         * Add one day
         * Convert to right format
         * */
        DateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String newDate = sdf.format(calendar.getTime());
        try {
            date = sdf.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*
         * Create Cookie with provided loginToken and generated date
         * */
        Cookie cookie = new Cookie(
                "bearer",
                loginToken,
                ".popupschool.com",
                "/",
                date,
                true);

        /*
         * Get URI passed to method
         * Add Cookie
         * Refresh Page to update Cookies
         * */
        DriverFactory.getDriver().get(URI);
        DriverFactory.getDriver().manage().addCookie(cookie);
        DriverFactory.getDriver().navigate().refresh();
    }

}
