package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement elementProcessor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement elementRAM;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement elementHDDRadio1;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement elementHDDRadio2;

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement elementOSVistaHome;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement elementOSVistaPremium;

    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement elementSoftwareMicrosoft;
    @CacheLookup
    @FindBy(id = "product_attribute_5_11")
    WebElement elementSoftwareAcrobat;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement elementSoftwareTotalCommander;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement elementAddToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement elementVerifyAddedToCart;

    public void selectProcessor(String value) {
        selectByVisibleTextFromDropDown(processor, value);
    }


    public void clickOnAddToCart() {
        clickOnElement(elementAddToCartButton);
    }

    public void sendProcessorName(String selectProcessorMenu1) {
        selectByVisibleTextFromDropDown(elementProcessor, selectProcessorMenu1);
        log.info("Getting text from : " + selectProcessorMenu1);
    }

    public void sendRAMName(String selectRAMMenu1) {
        selectByVisibleTextFromDropDown(elementRAM, selectRAMMenu1);
    }

    public void sendHDDName(String selectHDDMenu1) {
        if (selectHDDMenu1.contains("320 GB")) {
            clickOnElement(elementHDDRadio1);
        } else {
            clickOnElement(elementHDDRadio2);
        }
    }

    public void sendOSName(String selectOSMenu1) {
        if (selectOSMenu1.contains("Home")) {
            clickOnElement(elementOSVistaPremium);
        } else {
            clickOnElement(elementOSVistaPremium);
        }
    }

    public void sendSoftwareName(String selectSoftwareMenu1) {
        if (selectSoftwareMenu1.contains("Microsoft")) {
            clickOnElement(elementSoftwareMicrosoft);
        } else if (selectSoftwareMenu1.contains("Acrobat")) {
            clickOnElement(elementSoftwareAcrobat);
        } else {
            clickOnElement(elementSoftwareTotalCommander);
        }
    }

    public void verifyProductSelectedMessage(String verifyProductSelectionMessage1) {
        Assert.assertEquals(getTextFromElement(elementVerifyAddedToCart), verifyProductSelectionMessage1, "Error");
    }


}