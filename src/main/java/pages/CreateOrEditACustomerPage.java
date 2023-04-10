package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditACustomerPage {
    public CreateOrEditACustomerPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (css = "input[id='tp-customer-address']")    public WebElement addressTextBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]") public WebElement forAddressTextBoxErrorMessage;
    @FindBy (xpath = "(//div[@class='text-danger form-group'])[2]") public WebElement forAddressGroupErrorMessage;
    @FindBy (xpath = "(//div[@class='text-danger form-group'])[2]") public WebElement forAddressTextBox;
    @FindBy (css = "input[id='tp-customer-city']")  public WebElement cityTextBox;
    @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]") public WebElement forCityTextBoxErrorMessage;
    @FindBy (xpath = "(//div[@class='text-danger form-group'])[4]") public WebElement forCityGroupErrorMessage;
    @FindBy (css = "select[id='tp-customer-country']") public WebElement countryDropDownMenu;
    @FindBy (xpath = "//*[@id='tp-customer-country']/option[70]") public WebElement countryDropDownMenuUSA;
    @FindBy (css = "input[id='tp-customer-state']") public WebElement stateTextBox;
    @FindBy (css = "select[id='tp-customer-user']") public WebElement userDropDownMenu;

    @FindBy (css = "button[id='save-entity']") public WebElement saveButton;

    @FindBy (css = "a[id='cancel-save']") public WebElement backButton;
    @FindBy (css = "li[id='account-menu']") public WebElement userAccountDownMenu;
    @FindBy(xpath="//span[normalize-space()='Sign out']") public WebElement signOutButton;





}


