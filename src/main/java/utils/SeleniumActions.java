package utils;

import org.openqa.selenium.Keys;
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

    public static void clearText(WebElement element) {
        if (Waiters.waitForVisibility(element)) {
            System.out.println("Clear: " + " on element: " + element);
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE)
                    .build().perform();
            System.out.println("Cleared: " + " on element: " + element);
        }
    }
}
