package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BeyazEsya;
import utility.BrowserUtils;
import utility.Driver;

public class Test04_BeyasEsyalar {
    BeyazEsya beyazEsya = new BeyazEsya();

    @When("Kullanici urunlere tiklamali")
    public void kullanici_urunlere_tiklamali() {

        beyazEsya.urunler.click();
    }

    @When("Kullanici {string} tiklamali")
    public void kullanici_tiklamali(String string) throws InterruptedException {

        beyazEsya.plpdeUrunAdiveKategoriEslestirme(beyazEsya.beyazEsyaButonu, beyazEsya.buzdolabi);

    }

    @Then("Plp urunler ve kategori adi ayni olmali")
    public void plp_urunler_ve_kategori_adi_ayni_olmali() throws InterruptedException {

        for (WebElement urunIsmi : beyazEsya.urunIsimleri) {
            System.out.println(beyazEsya.urunIsimleri.size());
            System.out.println(urunIsmi.getText());
        }

        Driver.closeDriver();
    }
}
