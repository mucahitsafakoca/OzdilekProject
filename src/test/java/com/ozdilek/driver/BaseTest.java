package com.ozdilek.driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static AppiumDriver<MobileElement> appiumDriver;
    protected static Logger logger = LogManager.getLogger(BaseTest.class);


    @BeforeScenario
    public static void startUp() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ozdilek.ozdilekteyim");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ozdilek.ozdilekteyim.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
        try {
            appiumDriver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            logger.info("Driver started up successfully");
        } catch (MalformedURLException e) {
            logger.info("Failed to start up driver!");

            e.printStackTrace();
        }

    }
    @AfterScenario
    public static void closeDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            logger.info("Driver terminated successfully!");
        }
    }

    public WebElement waitUntilElementToBeClickable(By element) {
        WebDriverWait wait = new WebDriverWait(appiumDriver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
