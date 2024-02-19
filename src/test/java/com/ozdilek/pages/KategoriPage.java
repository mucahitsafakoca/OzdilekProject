package com.ozdilek.pages;

import com.ozdilek.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Random;

public class KategoriPage extends BaseTest {
    @Step("Click Kadin Category")
    public void clickKadin() {
        try {
            WebElement kadinClick = waitUntilElementToBeClickable(Locators.KadinBTN);
            kadinClick.click();
        } catch (Exception e) {
            System.err.println();
        }
    }

    @Step("Scroll down until canta visible")
    public void swipeDownUntilElementVisible() {
        try {
            By locator = Locators.CantaBTN;
            boolean isElementVisible = false;
            int maxSwipes = 10;
            int swipeCount = 0;

            while (!isElementVisible && swipeCount < maxSwipes) {
                if (isElementPresent(locator)) {
                    isElementVisible = true;
                } else {
                    swipeDown();
                    swipeCount++;
                }
            }

            if (!isElementVisible) {
                logger.warn("Element is not visible after swiping down");
            } else {
                logger.info("Element is visible after swiping down");
            }
        } catch (Exception e) {
            logger.error("Failed to swipe down until element is visible");
            e.printStackTrace();
        }
    }

    private void swipeDown() {
        Dimension size = appiumDriver.manage().window().getSize();
        int width = size.getWidth();
        int height = size.getHeight();

        int startX = width / 2;
        int startY = (int) (height * 0.8);
        int endY = (int) (height * 0.2);

        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    private boolean isElementPresent(By locator) {
        try {
            appiumDriver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    @Step("Click Canta")
    public void clickCanta() {
        try {
            WebElement cantaClick = waitUntilElementToBeClickable(Locators.CantaBTN);
            cantaClick.click();
        } catch (Exception e) {
            System.err.println();
        }
    }


}
