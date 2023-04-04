package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditACustomerPage {
    public CreateOrEditACustomerPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (css = "input[id=tp-customer-address]")    public WebElement addressTextBox;
    @FindBy (xpath = "(//*[contains(text(),'This field is required.')])[1]") public WebElement forAddressTextBoxErrorMessage;
    @FindBy (css = "input[id=tp-customer-city]")    public WebElement cityTextBox;
    @FindBy (xpath = "(//*[contains(text(),'This field is required.')])[2]") public WebElement forCityTextBoxErrorMessage;
    @FindBy (xpath = "//*[@id=\"tp-customer-country\"]/option[70]") public WebElement countryDropDownMenu;
    @FindBy (css = "input[id=tp-customer-state]") public WebElement stateTextBox;
    @FindBy (css = "button[id=save-entity]") public WebElement saveButton;
    @FindBy (css = "a[id=cancel-save]") public WebElement backButton;




}


