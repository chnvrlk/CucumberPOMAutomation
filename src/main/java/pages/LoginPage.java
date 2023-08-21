package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class LoginPage extends StepsAbstractClass{

    WebDriver driver;

    public LoginPage(){
        driver = Base.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath="//span[text()='My Account']")
    private WebElement myAccountDropMenu;

    @FindBy(linkText="Login")
    private WebElement loginOption;

    @FindBy(id="input-email")
    private WebElement emailAdressField;

    @FindBy(id="input-password")
    private WebElement passwordField;

    @FindBy(xpath="//input[@value='Login']")
    private WebElement loginButton;

    @FindBy(linkText="Edit your account information")
    private WebElement editYourAccountInfoOption;

    public void navigateToLogin(){
        clickFunction(myAccountDropMenu);
        clickFunction(loginOption);
    }

    public void successLogin(String email, String password){
        emailAdressField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void verifyLogin(){
        checkTheElementIsDisplayed(editYourAccountInfoOption);
    }

}
