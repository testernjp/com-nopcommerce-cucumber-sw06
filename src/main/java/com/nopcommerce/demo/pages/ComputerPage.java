package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement verifyComputersText;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computer;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement softwareLink;


    public String verifyComputerTextIsDisplayed() {
        String message = getTextFromElement(computer);
        log.info("Getting text from : " + computer.toString());
        return message;

    }

    public void clickOnComputerTab() {
        clickOnElement(computer);
        log.info("Computers" + computer.toString());

    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
        log.info("Desktops" + desktopsLink.toString());
    }


    public void clickOnNotebooksLink() {
        clickOnElement(notebooksLink);
        log.info("Notebooks" + notebooksLink.toString());
    }

    public void clickOnSoftwareLink() {
        clickOnElement(softwareLink);
        log.info("Software" + softwareLink.toString());

    }

    public String getComputersText() {
        log.info("Click on Computers Tab");
        return getTextFromElement(verifyComputersText);
    }
}