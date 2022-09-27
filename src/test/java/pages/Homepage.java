package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class Homepage {

    public Homepage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "sp-cc-accept")
    public WebElement acceptAllCookies;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@data-csa-c-content-id=\"nav_cs_bestsellers\"]")
    public WebElement bestSeller;




    @FindBy(xpath = "//div[@class='d']//a[@title='Teknolojiler']")
    public WebElement teknolojilerButton;

    @FindBy(id = "nav-item-signout")
    public WebElement logout;






}
