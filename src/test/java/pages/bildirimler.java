package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class bildirimler {

    public bildirimler(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "div[class='ntf-holder']")
    public WebElement bildirimIcon;

    @FindBy(xpath = "//a[@title='Tümünü Gör']")
    public WebElement tumunuGor;





}
