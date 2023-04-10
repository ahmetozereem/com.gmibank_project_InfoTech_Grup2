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
    Faker faker=new Faker();
    String ssn=faker.idNumber().ssnValid();;
    String firstname="Ali";
    String lastname="Kundilli";
    String  address=faker.address().streetAddress();
    String phone=faker.phoneNumber().cellPhone();
    String userName=firstname+lastname;
    String email=firstname+lastname+"@gmail.com";
    String password="February28.Month";


    RegistrationPage page=new RegistrationPage();
    UserManagementPage userManagementPage=new UserManagementPage();



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
    public void userClicksOnModifiedDate() throws InterruptedException {
        Driver.wait(1);
        userManagementPage.modifiedDate.click();
    }

    @And("user clicks on deactivated button to activate new user")
    public void userClicksOnDeactivatedButtonToActivateNewUser() throws InterruptedException {
        Driver.wait(2);
        userManagementPage.activationButton.click();
    }

    @Then("system confirm that activation has been completed")
    public void systemConfirmThatActivationHasBeenCompleted() throws InterruptedException {
        Driver.wait(2);

        Assert.assertTrue(userManagementPage.activationStuation.isDisplayed());
    }

    @And("user clicks on administrator menu")
    public void userClicksOnAdministratorMenu() {
        userManagementPage.administratorMenu.click();
    }

    @And("user clicks on sign out link")
    public void userClicksOnSignOutLink() throws InterruptedException {
        userManagementPage.signOutLink.click();
        Driver.wait(1);
    }

    @And("user clicks on view button")
    public void userClicksOnViewButton() throws InterruptedException {
        Driver.wait(2);
        userManagementPage.viewButton.click();
    }

    @Then("system confirm that information of user can be seen")
    public void systemConfirmThatInformationOfUserCanBeSeen() throws InterruptedException {
        Driver.wait(1);
        System.out.println("//b[text()='"+firstname+lastname+"']");
        WebElement userElement=Driver.getDriver().findElement(By.xpath("//b[text()='alikundilli']"));

        Assert.assertTrue(userElement.isDisplayed());

    }


    @When("user clicks on edit button")
    public void userClicksOnEditButton() {

        userManagementPage.editButton.click();
    }

    @And("user edits email")
    public void userEditsEmail() {

        userManagementPage.emailBox.clear();
        userManagementPage.emailBox.sendKeys("alikundilli@yandex.com");
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {

        userManagementPage.saveButton.click();
    }

    @Then("system confirm that editing has been completed")
    public void systemConfirmThatEditingHasBeenCompleted() throws InterruptedException {
        Driver.wait(2);

        Assert.assertTrue(userManagementPage.editUpdate.isDisplayed());
    }

    @And("user clicks on delete button")
    public void userClicksOnDeleteButton() {

        userManagementPage.deleteButton.click();
    }

    @And("user clicks on delete button{int}")
    public void userClicksOnDeleteButton(int arg0) {
        userManagementPage.deleteButton2.click();
    }

    @Then("system confirms that the new user has been deleted")
    public void systemConfirmsThatTheNewUserHasBeenDeleted() throws InterruptedException {
        Driver.wait(2);

        Assert.assertTrue(userManagementPage.deletedUpdate.isDisplayed());
    }
}
