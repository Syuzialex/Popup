package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {
    static Actions actions = new Actions(DriverFactory.getDriver());

    public static void clickOnElement(WebElement element) {
        Waiters.waitForClickable(element);
        actions.click(element).build().perform();

    }

    public static void typeTextOnElement(WebElement element, String text) {
        if (Waiters.waitForVisibility(element)) {
            System.out.println("Typing: " + text + " on element: " + element);
            actions.sendKeys(element, text).build().perform();
            System.out.println("Typed: " + text + " on element: " + element);

        } else System.out.println("element is not visible");

    }
}

