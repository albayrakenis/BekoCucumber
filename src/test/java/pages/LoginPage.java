package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;


public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "ap_email")
    public WebElement email;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "signInSubmit")
    public WebElement signIn;

    @FindBy(xpath = "//h1[@class='a-spacing-small']")
    public WebElement signInText;






}
