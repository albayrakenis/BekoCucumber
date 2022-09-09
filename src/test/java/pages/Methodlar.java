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

        BrowserUtils.verifyElementDisplayed(kategoriAdi);
        BrowserUtils.hover(kategoriAdi);
        urunAdi.click();
        System.out.println(byzEsya.solPanel.getSize());
        BrowserUtils.waitFor(3);



    }
}
