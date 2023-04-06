package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.CreateOrEditACustomerPage;
import pages.Login_Page;
import pages.ManageCustomersPage;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class US011 {
    SoftAssert softAssert = new SoftAssert();
    Login_Page loginPage = new Login_Page();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();

    CreateOrEditACustomerPage createACustomerPage = new CreateOrEditACustomerPage();


    @When("Provide the username of the applicant as admin")
    public void provide_the_username_of_the_applicant_as_admin() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("adminSehri"));
    }

    @When("Click on Create a New Customer")
    public void click_on_create_a_new_customer() {
        manageCustomersPage.createANewCustomer.click();
    }

    @When("Provide the invalid date in the past at the time of creation an account")
    public void provide_the_invalid_date_in_the_past_at_the_time_of_creation_an_account() {
        createACustomerPage.createDate.sendKeys("01/01/2010, 00:00");
    }

    @When("Fill in the other fields")
    public void fill_in_the_other_fields() {
        createACustomerPage.ssn.sendKeys("123-12-1234");
        createACustomerPage.selectButton.click();
        createACustomerPage.middleInitial.sendKeys("middleinitial");
        createACustomerPage.phoneNumber.sendKeys("123-987-7890");
        createACustomerPage.zipCode.sendKeys("1234");
        createACustomerPage.city.sendKeys("Eindhoven");
    }

    @When("Click on Save Button")
    public void click_on_save_button() {
        createACustomerPage.saveButton.click();
    }

    @Then("You should see the error message")
    public void you_should_see_the_error_message() {
        softAssert.assertTrue(createACustomerPage.alert.getText().contains("translation-not-found[gmiBankBackendApp.tPAccountRegistration.updated]"));
    }

    @Then("You should not see the error message")
    public void you_should_not_see_the_error_message() {
        System.out.println("alert------" + createACustomerPage.alert.getText());
        CommenSteps.verifyElementDisplayed(createACustomerPage.alert);
    }

    @Then("The date should be created as month, day, year, hour and minute")
    public void the_date_should_be_created_as_month_day_year_hour_and_minute() {
        String date = createACustomerPage.createDate.getAttribute("value");
        date = date.replace("-", "").replace(":", "").replace(" ", "").replace("T", "");
        softAssert.assertTrue(date.length() == 12);
        softAssert.assertAll();

    }

    @Then("You can choose a user from the registration")
    public void you_can_choose_a_user_from_the_registration() {
        Select select = new Select(createACustomerPage.user);
        CommenSteps.selectDropdown(createACustomerPage.user,3);
        CommenSteps.verifyElementDisplayed(createACustomerPage.user);

    }

    @Then("user from the registration cannot be blank you should see the error message")
    public void user_from_the_registration_cannot_be_blank_you_should_see_the_error_message() throws InterruptedException {
        softAssert.assertTrue(createACustomerPage.alert.getAttribute("value") == "");
        softAssert.assertFalse(createACustomerPage.alert.getText().contains("translation-not-found[gmiBankBackendApp.tPAccountRegistration.updated]"));
    }

    @Then("you can choose an account created on manage accounts")
    public void you_can_choose_an_account_created_on_manage_accounts() {
        CommenSteps.verifyElementDisplayed(createACustomerPage.account);


    }

    @When("User can select Zelle Enrolled optionally")
    public void user_can_select_zelle_enrolled_optionally() {
        CommenSteps.verifyElementDisplayed(createACustomerPage.zelleEnrolled);


    }

    @Then("you should succesfully saved")
    public void you_should_succesfully_saved() {
        softAssert.assertTrue(createACustomerPage.alert.getText().contains("translation-not-found[gmiBankBackendApp.tPAccountRegistration.updated]"));
        softAssert.assertAll();

    }

    @And("Click on Manage Customer")
    public void clickOnManageCustomer() {
        manageCustomersPage.getCreateANewCustomer2.click();
    }

    @And("Click on Save button")
    public void clickOnSaveButton() {
        createACustomerPage.saveButton.click();
    }

    @And("Click on Sign Outt")
    public void clickOnSignOutt() {
        loginPage.signInRegister.click();
        loginPage.signOutButton.click();
    }
}
