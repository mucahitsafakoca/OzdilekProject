package com.ozdilek.pages;

import com.ozdilek.driver.BaseTest;
import com.ozdilek.driver.Methods;
import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;


public class ProductListPage extends BaseTest {
    private String thirdElementPrice;
    private String savedPrice;

    @Step("Click Marka to see brands")
    public void ClickMarka() {
        try {
            WebElement markaClick = waitUntilElementToBeClickable(Locators.MarkalarBTN);
            markaClick.click();
        } catch (Exception e) {
            System.err.println();
        }
    }
    @Step("Select two random brands from the list") //Ürün sayısını kaydetmeyi denedim ancak yapamadım
    public void selectTwoRandomBrands() {

        Random random = new Random();
        int firstRandomIndex = random.nextInt(13)+1;
        int secondRandomIndex;


        do {
            secondRandomIndex = random.nextInt(13)+1;
        } while (secondRandomIndex == firstRandomIndex);

        String firstBrand = "(//android.view.ViewGroup[@resource-id=\"com.ozdilek.ozdilekteyim:id/relativeLayout\"])[" + firstRandomIndex + "]";
        String secondBrand = "(//android.view.ViewGroup[@resource-id=\"com.ozdilek.ozdilekteyim:id/relativeLayout\"])[" + secondRandomIndex + "]";

        try{
            WebElement brandOne = waitUntilElementToBeClickable(By.xpath(firstBrand));
            brandOne.click();
            WebElement brandTwo = waitUntilElementToBeClickable(By.xpath(secondBrand));
            brandTwo.click();

        }catch (Exception e){
            System.err.println();
        }
    }
    @Step("Click Uygula")
    public void uygula(){
        try {
            WebElement uygula= waitUntilElementToBeClickable((Locators.UygulaBTN));
            uygula.click();
        }catch (Exception e){
            System.err.println();
        }
    }
    //Listeden seçilen ürün sayılarını kaydedemediğin için kontrol yapamıyorum
    @Step("Click Sirala")
    public void sirala(){
        try {
            WebElement sirala = waitUntilElementToBeClickable(Locators.SiralaBTN);
            sirala.click();
        }catch (Exception e){
            System.err.println();
        }
    }
    @Step("Click Cok Satanlar")
    public void cokSatanlar(){
        try {
            WebElement bestSale = waitUntilElementToBeClickable(Locators.CokSatanBTN);
            bestSale.click();
        }catch (Exception e){
            System.err.println();
        }
    }

    @Step("Get 3. Price")
    public void getPrice(){
        Methods methods = new Methods();
        try {
            methods.swipeDownUntilElementVisible(Locators.ThirdElement);

            Thread.sleep(2000);

            WebElement thirdProdPriceElement = waitUntilElementToBeClickable(Locators.ThirdElement);
            thirdElementPrice = thirdProdPriceElement.getText();
            savedPrice = thirdElementPrice;
            System.out.println(savedPrice);
        } catch (Exception e){
            System.err.println("Error occurred while getting the price: " + savedPrice);
        }
    }
    @Step("Click Selected Item")
    public void clickItem(){
        try{
            WebElement clickItem = waitUntilElementToBeClickable(Locators.ThirdElement);
            clickItem.click();
        }catch (Exception e){
            System.err.println();
        }
    }
    @Step("Compare prices")
    public void compare(){
        try {
            WebElement prodPrice = waitUntilElementToBeClickable(Locators.ProdPrice);
            String prodPr = prodPrice.getText();
            Assertions.assertEquals(savedPrice,prodPr);

        }catch (Exception e){
            System.err.println(savedPrice);
        }
    }
    @Step("Click Sepet")
    public void sepet(){
        try {
            WebElement sepeteEkle =waitUntilElementToBeClickable(Locators.SepeteEkleBTN);
            sepeteEkle.click();
        }catch (Exception e){
            System.err.println();
        }
    }

}
