package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class SearchPage extends StepsAbstractClass{

    WebDriver driver;

    public SearchPage(){
        driver = Base.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(name="search")
    private WebElement searchText;

    @FindBy(xpath="//div[@id='search']/descendant::button")
    private WebElement searchButton;

    @FindBy(linkText="HP LP3065")
    private WebElement validHPProduct;

    @FindBy(xpath="//div[@id='content']/h2/following-sibling::p")
    private WebElement invalidProductWarningMessage;

    public void clickSearcButton(){
        clickFunction(searchButton);
    }

    public void searchAProduct(String text){
        sendKeysFunction(searchText, text);
    }

    public void displayStatusOfHPValidProduct(){
        checkTheElementIsDisplayed(validHPProduct);
    }

    public void displayStatusOfInvalidProduct(){
        checkTheElementIsDisplayed(invalidProductWarningMessage);
    }


}
