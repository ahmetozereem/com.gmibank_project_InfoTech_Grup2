package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//li[@id='account-menu']//a[@class='dropdown-toggle nav-link']")
    public WebElement userButton;

    @FindBy(xpath  ="//span[normalize-space()='Register']")
    public WebElement registerButton;

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement ssnLogin;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement ssnCheck;
    //div[normalize-space()='Please enter your social security number.']
    //div[@class='invalid-feedback']

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement name;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement nameCheck;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement lastNameCheck;

    @FindBy(xpath = "//input[@id='address']")
    public  WebElement adress;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement adresscheck;

    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement phoneNumberCheck;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement passwordCheck;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement emailCheck;


}



