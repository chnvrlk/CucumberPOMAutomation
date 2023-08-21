package tests;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;
import utilities.Base;

import java.time.Duration;

public class SearchTest {

    private WebDriver driver;

    SearchPage searchPage = new SearchPage();

    @After
    public void tearDown(){
        Base.closeDriver();
    }

    @Given("^Go to website$")
    public void go_to_website() throws Throwable {
        driver = Base.getDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @When("^Click the search button$")
    public void click_the_search_button() throws Throwable {
        searchPage.clickSearcButton();
    }

    @Then("^Check the invalid product$")
    public void check_the_invalid_product() throws Throwable {
        searchPage.displayStatusOfInvalidProduct();
    }

    @Then("^Check the valid product$")
    public void check_the_valid_product() throws Throwable {
        searchPage.displayStatusOfHPValidProduct();
    }



    @And("^Type product \"([^\"]*)\" in the search field$")
    public void typeProductInTheSearchField(String product) throws Throwable {
        searchPage.searchAProduct(product);
    }
}
