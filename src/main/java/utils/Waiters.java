package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    private static WebDriverWait wait;

    public static void setWait(int sec){
        wait = new WebDriverWait(DriverFactory.getDriver(), sec);
    }
    public static void waitForVisibility(String xpath) {
        setWait(5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }
    public static boolean waitForVisibility(WebElement element) {
        setWait(5);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    public static void waitForClickable(WebElement element) {
        setWait(3);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}

