package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageCustomersPage {

    public ManageCustomersPage() {PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy (css = "a[id='jh-create-entity']")
    public WebElement createANewCustomer;

    @FindBy (xpath = "//*[@class='table']/thead/tr") public WebElement customersInfoHeads;
    @FindBy (xpath = "//*[@class='table-responsive']/table/tbody/tr/td/div") public WebElement customersFirstLineButtonGroup;
    @FindBy (xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/div/a/span[normalize-space()='View'])[1]") public WebElement customersFirstLineViewButton;
    @FindBy (xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/div/a/span[normalize-space()='Edit'])[1]") public WebElement customersFirstLineEditButton;
    @FindBy (xpath = "(//*[@class='table-responsive']/table/tbody/tr/td/div/a/span[normalize-space()='Delete'])[1]") public WebElement customersFirstLineDeleteButton;
    @FindBy(linkText = "Manage Customers") public WebElement getCreateANewCustomer2;

}

