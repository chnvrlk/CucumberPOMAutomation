package tests;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import pages.LoginPage;
import utilities.Base;

import java.time.Duration;

public class LoginTest {

    private WebDriver driver;

    LoginPage loginPage = new LoginPage();

    @After
    public void tearDown(){
        Base.closeDriver();
    }

    @Given("^Go to example test website$")
    public void go_to_example_test_website() throws Throwable {
        driver = Base.getDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Given("^Navigate to Login Page$")
    public void nagivate_to_login_page() throws Throwable {
        loginPage.navigateToLogin();
    }

    @When("^Type Valid \"([^\"]*)\" user and \"([^\"]*)\" password$")
    public void typeValidUserAndPassword(String user, String pass) throws Throwable {
        loginPage.successLogin(user,pass);
    }

    @Then("^Verify Success Message$")
    public void verify_success_message() throws Throwable {
        loginPage.verifyLogin();
    }




}

