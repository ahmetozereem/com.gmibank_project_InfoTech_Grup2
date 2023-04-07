package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US017 {

    RegistrationPage page=new RegistrationPage();
    Faker faker=new Faker();


    @Given("user goes to gmibank web address")
    public void user_goes_to_gmibank_web_address() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @When("user clicks on account menu button")
    public void userClicksOnAccountMenuButton() {
        page.accountMenu.click();

    }

    @And("user clicks on register link")
    public void userClicksOnRegisterLink() {
        page.registerLink.click();
    }

    @And("user fills out all credentials")
    public void userFillsOutAllCredentials() {
        String ssn=faker.idNumber().ssnValid();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        String address=faker.address().streetAddress();
        String phone=faker.phoneNumber().cellPhone();
        String userName=firstname+lastname;
        String email=firstname+lastname+"@gmail.com";
        String password=faker.internet().password(6,12,true,true,true);


        page.ssnBox.sendKeys(ssn);
        page.firstName.sendKeys(firstname);
        page.lastName.sendKeys(lastname);
        page.address.sendKeys(address);
        page.mobilePhone.sendKeys(phone);
        page.userName.sendKeys(userName);
        page.email.sendKeys(email);
        page.firstPassword.sendKeys(password);
        page.secondPassword.sendKeys(password);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        page.registerButton.click();
    }

    @Then("system verifies that the has been successfully created")
    public void systemVerifiesThatTheHasBeenSuccessfullyCreated() throws InterruptedException {
        Driver.wait(1);
        Assert.assertTrue(page.registrationSaved.isDisplayed());

    }
}
