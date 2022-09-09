package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserUtils;
import utility.Driver;

public class Methodlar {

    public Methodlar(){
        PageFactory.initElements(Driver.get(),this);
    }

    BeyazEsya byzEsya = new BeyazEsya();


    public void getText(WebElement element){
        System.out.println(" Ürün adı "+element.getText().toLowerCase());
    }

    public void plpdeUrunAdiveKategoriEslestirme(WebElement kategoriAdi, WebElement urunAdi) throws InterruptedException {
        // kategoriAdi.click();
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(kategoriAdi);
        urunAdi.click();

        for (WebElement urunIsmi : byzEsya.urunIsimleri) {


        }
    }
}