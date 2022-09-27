package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ProductPage {

    public ProductPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//div[@id=\"B083Y1D8WB\"]")
    public WebElement termometer;

    @FindBy(id = "buy-now-button")
    public WebElement buyNow;

}
