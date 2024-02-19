package com.ozdilek.pages;

import com.ozdilek.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest {

    @Step("Close notification Pop-Up")
    public void NotificationHandle() {
        try {
            appiumDriver.findElement(Locators.DenyNotification);
            waitUntilElementToBeClickable(Locators.DenyNotification).click();

        } catch (Exception e) {
            System.err.println();
        }
    }


    @Step("Check if application did open successfully")
    public void checkHomePage() {
        try {
            waitUntilElementToBeClickable(Locators.HomePageTopLogo);
            boolean isDisplayed = appiumDriver.findElement(By.id(String.valueOf(Locators.HomePageTopLogo))).isDisplayed();
            if (isDisplayed) {
                System.out.println("Application opened succesffuly");
            }
            else appiumDriver = null;
        }
        catch (Exception e){
            System.err.println();
        }
    }
    @Step("Click AlisveriseBasla")
    public void clickAlisverisBTN() {
        try {
            WebElement alisverisButton = waitUntilElementToBeClickable(Locators.AlisveriseBaslaBTN);
            alisverisButton.click();
        } catch (Exception e) {
            System.err.println();
        }
    }
    @Step("GoToKategori")
    public void clickKategori() {
        try {
            WebElement kategoriButton = waitUntilElementToBeClickable(Locators.KategoriBTN);
            kategoriButton.click();
        } catch (Exception e) {
            System.err.println();
        }
    }
}
