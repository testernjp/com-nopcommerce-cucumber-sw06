package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;


    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link " + loginLink.getText() + "<br>");
        log.info("Click on loginLink : " + loginLink.getText());
        clickOnElement(loginLink);
    }

    public boolean isLogInLinkDisplay() {
        boolean b = loginLink.isDisplayed();
        Reporter.log("Checking is loginLink displayed : " + loginLink.getText() + "<br>");
        log.info("Checking is loginLink displayed : " + loginLink.getText());
        return b;
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on register link " + registerLink.getText() + "<br>");
        log.info("Click on registerLink : " + registerLink.getText());
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Clicking on myAccountLink : " + myAccountLink.getText() + "<br>");
        log.info("Click on myAccountLink : " + myAccountLink.getText());
        clickOnElement(myAccountLink);
    }

    public HomePage clickOnLogOutLink() {
        Reporter.log("Clicking on logOutLink : " + logOutLink.getText() + "<br>");
        log.info("Click on logOutLink : " + logOutLink.getText());
        clickOnElement(logOutLink);
        return new HomePage();
    }

    public boolean isLogOutLinkDisplay() {
        boolean b = logOutLink.isDisplayed();
        Reporter.log("Checking is logOutLink displayed : " + logOutLink.getText() + "<br>");
        log.info("Checking is logOutLink displayed : " + logOutLink.getText());
        return b;
    }

    public boolean isLogoDisplayed() {
        boolean b = logo.isDisplayed();
        Reporter.log("Checking logo is Displayed <br>");
        log.info("Checking logo is Displayed");
        return b;
    }

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                Reporter.log("Click on '" + tab + "' tab <br>");
                log.info("Click on '" + tab + "' tab");
                clickOnElement(menu);
                break;
            }
        }
    }

}