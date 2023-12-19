package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Navigate to register Page")
    public void navigateToRegisterPage() {
    }

    @And("I click on REGISTER button")
    public void iClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }


    @And("verify that {string} message is displayed in firstname field")
    public void verifyThatMessageIsDisplayedInFirstnameField(String firstNameMessage) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequiredMessage(), firstNameMessage, "Text does not match");

    }

    @And("verify that {string} message is displayed in lastname field")
    public void verifyThatMessageIsDisplayedInLastnameField(String lastNameMessage) {
        Assert.assertEquals(new RegisterPage().getLastNameRequiredMessage(), lastNameMessage, "Text does not match");
    }

    @And("verify that {string} message is displayed in email field")
    public void verifyThatMessageIsDisplayedInEmailField(String emailMessage) {
        Assert.assertEquals(new RegisterPage().getEmailRequiredMessage(), emailMessage, "Text does not match");
    }

    @And("verify that {string} message is displayed in password field")
    public void verifyThatMessageIsDisplayedInPasswordField(String passwordMessage) {
        Assert.assertEquals(new RegisterPage().getPasswordRequiredMessage(), passwordMessage, "Text does not match");
    }

    @And("verify that {string} message is displayed in confirm password field")
    public void verifyThatMessageIsDisplayedInConfirmPasswordField(String confirmPasswordMessage) {
        Assert.assertEquals(new RegisterPage().getConfirmPassRequiredMessage(), confirmPasswordMessage, "Text does not match");
    }


    @And("I select gender as {string}")
    public void iSelectGenderAs(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter lastname {string}")
    public void iEnterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I select the day {string}")
    public void iSelectTheDay(String day) {
        new RegisterPage().dateOfBirthDay(day);
    }

    @And("I select the month {string}")
    public void iSelectTheMonth(String month) {
        new RegisterPage().dateOfBirthMonth(month);
    }

    @And("I select the year {string}")
    public void iSelectTheYear(String year) {
        new RegisterPage().dateOfBirthYear(year);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter the password in confirm password {string}")
    public void iEnterThePasswordInConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("verify that the {string} message is displayed")
    public void verifyThatTheMessageIsDisplayed(String message) {
        Assert.assertEquals(new RegisterPage().getYourRegisterText(), message, "Text does not match");

    }


}