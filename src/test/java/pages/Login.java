package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.ConfigurationReader;
import utility.Driver;


public class Login {

    public Login() {

        PageFactory.initElements(Driver.get(), this);
    }
    @FindAll({
            @FindBy(xpath = "//*[text()='Üyelik']"),
            @FindBy(xpath = "//a[@data-selector='user-name']")
    })
    public WebElement uyelikButonu;

    @FindBy(id = "j_username")
    public WebElement username;

    @FindBy(id = "j_password")
    public WebElement password;

    @FindBy(id = "login-failed-div")
    public WebElement yanlisSifre;

    @FindAll({
            @FindBy(id = "form-login-btn"),
            @FindBy(xpath = "//*[text()='Giriş Yap']")
    })
    public WebElement girisYapButonu;


    public void bekoLogin() throws InterruptedException {
        Thread.sleep(2000);
        uyelikButonu.click();
        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        girisYapButonu.click();
        Thread.sleep(1500);
    }

}
