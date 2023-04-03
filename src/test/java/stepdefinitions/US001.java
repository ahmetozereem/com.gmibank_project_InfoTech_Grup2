package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US001_Page;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {

    US001_Page us001 =new US001_Page();
    @Given("user goes to home page")
    public void userGoesToHomePage() throws InterruptedException {
        try{Driver.getDriver().get(ConfigReader.getProperty("url"));}

        catch (Exception e){
            e.printStackTrace();
        }
    }

    @When("User clicks the user button")
    public void userClicksTheUserButton() throws InterruptedException {
        CommenSteps.waitForClickablility(us001.userButton,10);
        us001.userButton.click();




    }

    @And("User clicks on register tab")
    public void userClicksOnRegisterTab() throws InterruptedException {
        us001.registerButton.click();
        Driver.wait(1);
            }

    @And("Enters the appropriate SSN number")
    public void entersTheAppropriateSSNNumber() throws InterruptedException {
        us001.ssnLogin.sendKeys("123-12-1234");

    }

    @Then("Checks that there is no warning under the SSN number")
    public void checksThatThereIsNoWarningUnderTheSSNNumber() {
        Assert.assertFalse(us001.ssnCheck.isDisplayed());
    }

    @And("Enters the appropriate name")
    public void entersTheAppropriateName() {
        us001.name.sendKeys("omer");
    }

    @And("Checks that there is no warning under the name")
    public void checksThatThereIsNoWarningUnderTheName() throws InterruptedException {
        Assert.assertFalse(us001.nameCheck.isDisplayed());
    }
    @And("Enters the appropriate lastname")
    public void entersTheAppropriateLastname() {
        us001.lastName.sendKeys("celik");

    }

    @And("Checks that there is no warning under the lastname")
    public void checksThatThereIsNoWarningUnderTheLastname() {
        Assert.assertFalse(us001.lastNameCheck.isDisplayed());

    }

    @And("Enters the appropriate adress")
    public void entersTheAppropriateAdress() {

        us001.adress.sendKeys("austrasse 176 74075 Heilbronn");
    }

    @Then("Checks that there is no warning under the adress")
    public void checksThatThereIsNoWarningUnderTheAdress() {

        Assert.assertFalse(us001.adresscheck.isDisplayed());
    }

    @And("Enters the appropriate Phone Number")
    public void entersTheAppropriatePhoneNumber() {

        us001.phoneNumber.sendKeys("1782344569");
    }

    @Then("Checks that there is no warning under the Phone number")
    public void checksThatThereIsNoWarningUnderThePhoneNumber() {

        Assert.assertFalse(us001.phoneNumberCheck.isDisplayed());
    }

    @And("Enters the appropriate new password")
    public void entersTheAppropriateNewPassword() {
        us001.password.sendKeys("Ankara123?");
    }

    @Then("Checks that there is no warning under the new password")
    public void checksThatThereIsNoWarningUnderTheNewPassword() {

        Assert.assertFalse(us001.passwordCheck.isDisplayed());
    }
}
