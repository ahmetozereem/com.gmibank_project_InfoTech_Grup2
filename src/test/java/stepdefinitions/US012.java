package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utilities.CommenSteps;
import utilities.ConfigReader;

public class US012 {
    GmiBankHomePage gmiBankHomePage = new GmiBankHomePage();
    SignInPage signInPage = new SignInPage();
    Login_Page loginPage = new Login_Page();
    ManageCustomersPage manageCustomersPage = new ManageCustomersPage();

    @When("Employee clicks dropdown account menu")
    public void employeeClicksDropdownAccountMenu() {
        CommenSteps.waitForClickablility(gmiBankHomePage.accountMenu,5);
        gmiBankHomePage.accountMenu.click();
    }

    @And("Employee clicks on the Sign in")
    public void employeeClicksOnTheSignIn() {
        gmiBankHomePage.loginItem.click();
    }

    @And("Employee types the valid username in the relevant field")
    public void employeeTypesTheValidUsernameInTheRelevantField() {
        CommenSteps.waitForClickablility(signInPage.userNameTextBox,5);
        signInPage.userNameTextBox.sendKeys(ConfigReader.getProperty("employeeLoginName"));
    }

    @And("Employee types the valid password in the relevant field")
    public void employeeTypesTheValidPasswordInTheRelevantField() {
        signInPage.newPasswordTextBox.sendKeys(ConfigReader.getProperty("employeeLoginPassword"));
    }

    @And("Employee clicks on Sign in button")
    public void employeeClicksOnSignInButton() {
        CommenSteps.waitForVisibility(signInPage.userNameTextBox,5);
        signInPage.signInButton.click();
    }

    @And("Employee clicks on My Operations menu")
    public void employeeClicksOnMyOperationsMenu() {
        CommenSteps.waitForVisibility(loginPage.myOperations,5);
        loginPage.myOperations.click();
    }

    @And("Employee clicks on Manage Customers")
    public void employeeClicksOnManageCustomers() {
        CommenSteps.waitForVisibility(loginPage.manageCustomers,5);
        loginPage.manageCustomers.click();
    }

    @Then("Employee validates the customers fact {string}")
    public void employeeValidatesTheCustomersFact(String sheetHeaders) {
        boolean expectedValue = true;
        boolean actualValue = manageCustomersPage.customersInfoHeads.getText().contains(sheetHeaders);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Then("Employee validates view option button all for all customers")
    public void employeeValidatesViewOptionButtonAllForAllCustomers() {
        boolean expectedValue = true;
        boolean actualValue = manageCustomersPage.customersFirstLineButtonGroup.getText().contains("View");
        Assert.assertEquals(expectedValue,actualValue);
    }
}
