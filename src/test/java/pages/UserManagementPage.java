package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserManagementPage {
    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement signInLink;

    @FindBy (id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationLink;

    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagementLink;

    @FindBy(id="modified-date-sort")
    public WebElement modifiedDate;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement activationButton;


}
