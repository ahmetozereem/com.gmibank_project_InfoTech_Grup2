package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.RegistrationPage;
import pages.UserManagementPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US017 {

    String ssn;
    String firstname;
    String lastname;
    String address;
    String phone;
    String userName;
    String email;
    String password;


    RegistrationPage page=new RegistrationPage();
    UserManagementPage userManagementPage=new UserManagementPage();
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
        ssn=faker.idNumber().ssnValid();
        firstname=faker.name().firstName();
        lastname=faker.name().lastName();
        address=faker.address().streetAddress();
        phone=faker.phoneNumber().cellPhone();
        userName=firstname+lastname;
        email=firstname+lastname+"@gmail.com";
        password=faker.internet().password(12,12,true,true,true);
        System.out.println(firstname+" "+lastname+"\n"+userName);

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

    @And("user clicks on sign in link")
    public void userClicksOnSignInLink() {
        userManagementPage.signInLink.click();
    }

    @And("user sends {string} to username box")
    public void userSendsToUsernameBox(String adminUsername) {
        userManagementPage.usernameBox.sendKeys(adminUsername);
    }

    @And("user sends {string} to password box")
    public void userSendsToPasswordBox(String adminPassword) {
        userManagementPage.passwordBox.sendKeys(adminPassword);
    }

    @And("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        userManagementPage.signInButton.click();
    }

    @And("user clicks on administration link")
    public void userClicksOnAdministrationLink() {
        userManagementPage.administrationLink.click();
    }

    @And("user clicks on user management link")
    public void userClicksOnUserManagementLink() {
        userManagementPage.userManagementLink.click();
    }


    @And("user clicks on modifiedDate")
    public void userClicksOnModifiedDate() {
        userManagementPage.modifiedDate.click();
    }

    @And("user clicks on deactivated button to activate new user")
    public void userClicksOnDeactivatedButtonToActivateNewUser() {
        userManagementPage.activationButton.click();
    }

    @Then("system confirm that activation has been completed")
    public void systemConfirmThatActivationHasBeenCompleted() throws InterruptedException {
        Driver.wait(1);

        WebElement newUser=Driver.getDriver().findElement(By.xpath("//div[text()='A user is updated with identifier "+userName+"']"));
        Assert.assertTrue(newUser.isDisplayed());
    }
}
