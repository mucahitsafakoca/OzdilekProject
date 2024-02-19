package com.ozdilek.pages;

import com.ozdilek.driver.BaseTest;
import com.thoughtworks.gauge.Step;

public class LoginPage extends BaseTest {
    @Step("Check Login Screen")
    public void checkLogin(){
        try {
            waitUntilElementToBeClickable(Locators.LoginBTN);

        }catch (Exception e){
            System.err.println();
        }
    }
}
