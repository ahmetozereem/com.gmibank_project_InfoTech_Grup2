package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_Page {
    public Login_Page() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(css="li[id='account-menu'] a[class='dropdown-toggle nav-link']") public WebElement signInRegister;

    @FindBy(css="a[id='login-item'] span") public WebElement signIn;

    @FindBy(css="#username") public WebElement userName;

    @FindBy(css="#password") public WebElement newPassword;

    @FindBy(css="button[type='submit']") public WebElement submitButtonForLogin;

    @FindBy(xpath="//span[normalize-space()='User Name']") public WebElement userNameAfterLogin;
    @FindBy(css=".btn.btn-secondary") public WebElement cancelButton;

    @FindBy(css="li[id='entity-menu'] a[class='dropdown-toggle nav-link'] span") public WebElement myOperations;

    @FindBy(css="div[role='alert'] span strong") public WebElement errorMessage;

    @FindBy(xpath="//span[normalize-space()='Did you forget your password?']") public WebElement didYouForgetYourPassword;

    @FindBy(css="div[class='col-md-8'] h1 span") public WebElement resetYourPassword;

    @FindBy(xpath="//span[normalize-space()='Register a new account']") public WebElement registerANewAccount;

    @FindBy(css="h1[id='register-title'] span") public WebElement registrationMessage;



}

