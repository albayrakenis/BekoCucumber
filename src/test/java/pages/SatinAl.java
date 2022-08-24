package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class SatinAl {

    public SatinAl(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[@type='button']/span[@class='d']")
    public WebElement urunler;

    @FindBy(xpath = "(//a[@title='İncele'])[2]")
    public WebElement UrunBir;

    @FindBy(xpath = "(//a[@title='İncele'])[4]")
    public WebElement UrunDort;

    @FindBy(xpath = "//*[button='Taksit Seçenekleri']/button")
    public WebElement taksitSecenekleri;

    @FindBy(id = "nav-commercial-tab")
    public WebElement ticariKart;

    @FindBy(id = "nav-commercial-tab")
    public WebElement bireyselKart;

    @FindBy(xpath = "(//button[@title='Sepete At'])")
    public WebElement satinAl;

    @FindBy(xpath = "(//a[@title='Sepete Git'])")
    public WebElement sepeteGit;

    @FindBy(xpath = "(//a[@title='Sepeti Onayla'])")
    public WebElement sepetiOnayla;

    @FindBy(xpath = "//ul[@class='accordion']/li[@id='pay-payment-card']")
    public WebElement krediKarti;

    @FindBy(xpath = "(//input[@name='number'])[1]")
    public WebElement krediKartiNumarasi;

    @FindBy(xpath = "(//input[@name='cardOwner'])[1]")
    public WebElement krediKartiSahibi;

    @FindBy(xpath = "(//input[@name='expiry'])[1]")
    public WebElement krediKartiTarih;

    @FindBy(xpath = "(//input[@name='cvv'])[1]")
    public WebElement krediKartiCvv;

    @FindBy(id = "postPayment")
    public WebElement alisverisiTamamla;

    public void satinAlma(String urunAdi) throws InterruptedException {
        Thread.sleep(1000);
        urunler.click();
        Driver.get().findElement(By.xpath("//a[@title='"+urunAdi+"']")).click();
    }

}
