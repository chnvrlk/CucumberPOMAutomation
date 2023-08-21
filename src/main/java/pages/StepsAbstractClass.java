package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Base;
import org.testng.Assert;

import java.time.Duration;


public abstract  class StepsAbstractClass {

    private WebDriver driver = Base.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public void clickFunction(WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void sendKeysFunction(WebElement webElement,String text){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(text);
    }

    public void selectElementFromDropdown(WebElement webElement,String element){
        Select slc = new Select(webElement);
        slc.selectByVisibleText(element);
    }

    public void checkTheElementIsDisplayed(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        Assert.assertTrue(webElement.isDisplayed(),"Element is not displayed");
    }


}
