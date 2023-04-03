package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US001_Page {
    public US001_Page () {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//li[@id='account-menu']//a[@class='dropdown-toggle nav-link']")
    public WebElement userButton;

    @FindBy(xpath  ="//span[normalize-space()='Register']")
    public WebElement registerButton;

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement ssnLogin;

    @FindBy(xpath = "//div[normalize-space()='Please enter your social security number.']")
    public WebElement ssnCheck;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement name;

    @FindBy(xpath = "//div[normalize-space()='Please enter your first name.']")
    public WebElement nameCheck;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//div[normalize-space()='Please enter your last name.']")
    public WebElement lastNameCheck;

    @FindBy(xpath = "//input[@id='address']")
    public  WebElement adress;

    @FindBy(xpath = "//div[normalize-space()='Please enter your address.']")
    public WebElement adresscheck;

    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[normalize-space()='Please enter your mobile phone number.']")
    public WebElement phoneNumberCheck;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//div[normalize-space()='Your password is required.']")
    public WebElement passwordCheck;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//div[normalize-space()='Please enter your email.']")
    public WebElement emailCheck;


}



