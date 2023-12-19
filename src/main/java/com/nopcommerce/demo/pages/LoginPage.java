package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by SP
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        Reporter.log("Getting welcome text " + welcomeText.getText() + "<br>");
        log.info("Get welcomeText : " + welcomeText.getText());
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        Reporter.log("Enter email " + email + " to email field " + emailField.getText() + "<br>");
        log.info("Enter EmailId '" + email + "' to email field : "
                + emailField.getText());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Enter password " + password + " to password field " + passwordField.getText() + "<br>");
        log.info("Enter Password '" + password + "' to password field : "
                + passwordField.getText());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("Clicking on Login Button <br>");
        log.info("Click on loginButton");
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        Reporter.log("Getting error message : " + errorMessage.getText() + "<br>");
        log.info("Get errorMessage : " + errorMessage.getText());
        return message;
    }
}