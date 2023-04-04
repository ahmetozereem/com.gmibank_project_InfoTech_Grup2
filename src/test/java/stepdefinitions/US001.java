package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {

    RegisterPage us001 =new RegisterPage();

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
        CommenSteps.waitForClickablility(us001.ssnLogin,3);
        us001.ssnLogin.sendKeys("123-12-1234");
        Driver.wait(3);


    }

    @Then("Checks that there is no warning under the SSN number")
    public void checksThatThereIsNoWarningUnderTheSSNNumber() {
       Assert.assertTrue(us001.ssnCheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir

    }

    @And("Enters the appropriate name")
    public void entersTheAppropriateName() throws InterruptedException {

        us001.name.sendKeys("omer");
        Driver.wait(3);
    }

    @And("Checks that there is no warning under the name")
    public void checksThatThereIsNoWarningUnderTheName() throws InterruptedException {
        Assert.assertTrue(us001.nameCheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir
    }
    @And("Enters the appropriate lastname")
    public void entersTheAppropriateLastname() throws InterruptedException {
        us001.lastName.sendKeys("celik");
        Driver.wait(3);

    }

    @And("Checks that there is no warning under the lastname")
    public void checksThatThereIsNoWarningUnderTheLastname() {
        Assert.assertTrue(us001.lastNameCheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir

    }

    @And("Enters the appropriate adress")
    public void entersTheAppropriateAdress() throws InterruptedException {

        us001.adress.sendKeys("austrasse 176 74075 Heilbronn");
        Driver.wait(3);
    }

    @Then("Checks that there is no warning under the adress")
    public void checksThatThereIsNoWarningUnderTheAdress() {

        Assert.assertTrue(us001.adresscheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir
    }

    @And("Enters the appropriate Phone Number")
    public void entersTheAppropriatePhoneNumber() throws InterruptedException {

        us001.phoneNumber.sendKeys("1782344569");
        Driver.wait(3);
    }

    @Then("Checks that there is no warning under the Phone number")
    public void checksThatThereIsNoWarningUnderThePhoneNumber() {

        Assert.assertTrue(us001.phoneNumberCheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir
    }

    @And("Enters the appropriate new password")
    public void entersTheAppropriateNewPassword() throws InterruptedException {
        us001.password.sendKeys("Ankara123?");
        Driver.wait(3);
    }

    @Then("Checks that there is no warning under the new password")
    public void checksThatThereIsNoWarningUnderTheNewPassword() {

        Assert.assertTrue(us001.passwordCheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir
    }

    @And("Enters the appropriate emailAdress")
    public void entersTheAppropriateEmailAdress() throws InterruptedException {

        us001.email.sendKeys("okanburuk@hotmail.com");
        Driver.wait(3);
    }

    @Then("Checks that there is no warning under the emailAdress")
    public void checksThatThereIsNoWarningUnderTheEmailAdress() {

        Assert.assertTrue(us001.emailCheck.getAttribute("class").contains("is-touched is-dirty av-valid form-control"));//atttribute locate yerini verir
    }
}
