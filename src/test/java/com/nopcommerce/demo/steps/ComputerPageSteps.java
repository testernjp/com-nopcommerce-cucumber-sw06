package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on Computer tab")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @Then("Navigate to Computer Page")
    public void navigateToComputerPage() {
    }

    @And("I click on Desktop link")
    public void iClickOnDesktopLink() {
        new ComputerPage().clickOnDesktopsLink();
    }

    @And("Click on product name {string}")
    public void clickOnProductName(String productName) {
        new ComputerPage().clickOnSoftwareLink();
    }

    @And("Select processor {string}")
    public void selectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().sendRAMName(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String hdd) {
        new BuildYourOwnComputerPage().sendHDDName(hdd);
    }

    @And("Select OS {string}")
    public void selectOS(String os) {
        new BuildYourOwnComputerPage().sendOSName(os);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().sendSoftwareName(software);
    }

    @And("Click on {string} Button")
    public void clickOnButton(String button) {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @And("Verify {string} message is displayed")
    public void verifyMessageIsDisplayed(String displayedMessage) {
        Assert.assertEquals(new ComputerPage(), displayedMessage, "Add to cart message not displayed");

    }

    @And("Verify {string} text is displayed in computer tab")
    public void verifyTextIsDisplayedInComputerTab(String computer) {
        Assert.assertEquals(new ComputerPage().getComputersText(), computer, "Text is not displayed");
    }

    @And("Verify {string} text is displayed in desktop tab")
    public void verifyTextIsDisplayedInDesktopTab(String desktop) {
        Assert.assertEquals(new DesktopsPage().getDesktopsText(), desktop, "Text not displayed");
    }
}