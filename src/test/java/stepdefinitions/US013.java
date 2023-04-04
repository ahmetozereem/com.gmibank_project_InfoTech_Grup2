package stepdefinitions;


import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class US013 {
    @Given("Go to the GmiBank home page")
    public void go_to_the_gmi_bank_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Click on Create a New Account")
    public void click_on_create_a_new_account() {

    }
    @When("Redirects to Create or edit a Account page")
    public void redirects_to_create_or_edit_a_account_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Description text box")
    public void click_on_description_text_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Balance text box")
    public void click_on_balance_text_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("You should see the error message under the textbox This field is required.")
    public void you_should_see_the_error_message_under_the_textbox_this_field_is_required() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Enter a valid value in the definition test box")
    public void enter_a_valid_value_in_the_definition_test_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("You should not see the error message under the textbox This field is required.")
    public void you_should_not_see_the_error_message_under_the_textbox_this_field_is_required() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter a a number in the definition test box")
    public void enter_a_a_number_in_the_definition_test_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should not see the error message under the textbox This field should be a number.")
    public void i_should_not_see_the_error_message_under_the_textbox_this_field_should_be_a_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Enter a character in the definition test box")
    public void enter_a_character_in_the_definition_test_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Account Type dropdown")
    public void click_on_account_type_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the error message under the text box This field should be a number.")
    public void i_should_see_the_error_message_under_the_text_box_this_field_should_be_a_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter a special character in the definition test box")
    public void enter_a_special_character_in_the_definition_test_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Then I should see the error message under the textbox This field should be a number.")
    public void then_i_should_see_the_error_message_under_the_textbox_this_field_should_be_a_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("I should select the an account type CHECKING")
    public void i_should_select_the_an_account_type_checking() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I should select the an account type SAVING")
    public void i_should_select_the_an_account_type_saving() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I should select the an account type CREDIT_CARD")
    public void i_should_select_the_an_account_type_credit_card() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should select the an acount type INVESTING")
    public void i_should_select_the_an_acount_type_investing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Click on Account Status dropdown")
    public void click_on_account_status_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I should select the an account status ACTIVE")
    public void i_should_select_the_an_account_status_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I should select the an account status SUSPENDED")
    public void i_should_select_the_an_account_status_suspended() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should select the an account status CLOSED")
    public void i_should_select_the_an_account_status_closed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Click on Employee dropdown")
    public void click_on_employee_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("You should an employee from the drop-down")
    public void you_should_an_employee_from_the_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
