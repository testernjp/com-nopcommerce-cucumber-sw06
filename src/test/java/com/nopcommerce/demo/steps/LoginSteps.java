package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("Navigate to LoginPage")
    public void navigateToLoginPage() {
    }

    @And("verify that {string} message is display")
    public void verifyThatMessageIsDisplay(String displayMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(), displayMessage, "Message not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(), errorMessage, "Error message not displayed");
    }

    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay(String link) {
        Assert.assertEquals(new HomePage().isLogOutLinkDisplay(), link, "Logout not display");
    }

    @And("Click on LogOut Link")
    public void clickOnLogOutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        new HomePage().isLogInLinkDisplay();
    }
}