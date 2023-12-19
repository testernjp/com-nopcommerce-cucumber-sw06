package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement yourRegCompletedText;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordReqText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordReqText;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessText;

    public String getYourRegisterText() {
        log.info("Getting Your registration completed Text");
        return getTextFromElement(registerSuccessText);
    }


    public String getRegisterText() {
        String message = getTextFromElement(registerText);
        Reporter.log("Get registerText : " + registerText.getText() + "<br>");
        log.info("Get registerText : " + registerText.getText());
        return message;
    }

    public void selectGender(String gender) {
        for (WebElement radio : genderRadios) {
            if (radio.getText().contains(gender)) {
                Reporter.log("Select '" + gender + "' radio button" + "<br>");
                log.info("Select '" + gender + "' radio button");
                clickOnElement(radio);
                break;
            }
        }
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        Reporter.log("Enter Firstname : '" + firstName + "' to firstName field" + "<br>");
        log.info("Enter Firstname : '" + firstName + "' to firstName field");
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        Reporter.log("Enter Lastname : '" + lastName + "' to lastName field" + "<br>");
        log.info("Enter Lastname : '" + lastName + "' to lastName field");
    }

    public void dateOfBirthDay(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        Reporter.log("Select day : '" + day + "<br>");
        log.info("Select day : '" + day + "'' for DayOfBirth");
    }

    public void dateOfBirthMonth(String month) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        Reporter.log("Select month : '" + month + "<br>");
        log.info("Select month : '" + month + "'' for DayOfBirth");
    }

    public void dateOfBirthYear(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        Reporter.log("Select year : '" + year + "<br>");
        log.info("Select year : '" + year + "'' for YearOfBirth");

    }


    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        Reporter.log("Enter Email : '" + email + "' to email field" + "<br>");
        log.info("Enter Email : '" + email + "' to email field");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Enter Password : '" + password + "' to password field" + "<br>");
        log.info("Enter Password : '" + password + "' to password field");
    }

    public void enterConfirmPassword(String confPassword) {
        sendTextToElement(confirmPasswordField, confPassword);
        Reporter.log("Enter Confirm password : '" + confPassword + "' to confirm password field" + "<br>");
        log.info("Enter Confirm password : '" + confPassword + "' to confirm " +
                "password field");
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click on 'REGISTER' button" + "<br>");
        clickOnElement(registerBtn);
        log.info("Click on 'REGISTER' button");
    }

    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                Reporter.log("Click on 'REGISTER' button" + "<br>");
                log.info("Validation message : '" + message.getText() + "' for " +
                        "fieldName '" + fieldName + "'");
                break;
            }
        }
        return validationMessage;
    }

    public String getYourRegCompletedText() {
        String message = getTextFromElement(yourRegCompletedText);
        Reporter.log("Get your reg completed text : " + yourRegCompletedText.getText() + "<br>");
        log.info("Get your reg completed text : " + yourRegCompletedText.getText());
        return message;
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on 'CONTINUE' button" + "<br>");
        log.info("Click on 'CONTINUE' button");
        clickOnElement(continueBtn);
    }

    public String getFirstNameRequiredMessage() {
        log.info("Getting First name is required Message");
        return getTextFromElement(firstNameReqText);

    }

    public String getLastNameRequiredMessage() {
        log.info("Getting Last name is required Message");
        return getTextFromElement(lastNameReqText);
    }

    public String getEmailRequiredMessage() {
        log.info("Getting Email is required Message");
        return getTextFromElement(emailReqText);
    }

    public String getPasswordRequiredMessage() {
        log.info("Getting Password is required Message");
        return getTextFromElement(passwordReqText);
    }

    public String getConfirmPassRequiredMessage() {
        log.info("Getting Password is required Message");
        return getTextFromElement(confirmPasswordReqText);
    }
}