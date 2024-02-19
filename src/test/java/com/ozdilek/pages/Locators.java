package com.ozdilek.pages;

import org.openqa.selenium.By;

public class Locators {
    static By DenyNotification = By.id("com.android.permissioncontroller:id/permission_deny_button");
    static By HomePageTopLogo = By.id("com.ozdilek.ozdilekteyim:id/iv_storeTopLogo");
    static By AlisveriseBaslaBTN = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    static By KategoriBTN = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");

    static By KadinBTN = By.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.ozdilek.ozdilekteyim:id/relLayCategoriesItem\"])[2]");
    static By CantaBTN = By.xpath("//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/subItem\" and @text=\"Çanta\"]");
    static By MarkalarBTN = By.xpath("//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/quickFilterTextView\" and @text=\"Markalar\"]");
    static By UygulaBTN = By.id("com.ozdilek.ozdilekteyim:id/applyButton");
    static By SiralaBTN = By.id("com.ozdilek.ozdilekteyim:id/rlSort");
    static By CokSatanBTN = By.xpath("//android.widget.RadioButton[@resource-id=\"com.ozdilek.ozdilekteyim:id/radioButton\" and @text=\"Çok Satanlar\"]");
    public static By ThirdElement = By.xpath("(//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/textViewPromotionPrice\"])[3]");
    static By ThirdElementPrice = By.xpath("//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/textViewProductPrice\"]");
    static By ProdPrice = By.id("com.ozdilek.ozdilekteyim:id/textViewPromotionPrice");
    static By SepeteEkleBTN = By.id("com.ozdilek.ozdilekteyim:id/relLayAddCartBtn");
    static By LoginBTN = By.id("com.ozdilek.ozdilekteyim:id/btnLogin");

}
