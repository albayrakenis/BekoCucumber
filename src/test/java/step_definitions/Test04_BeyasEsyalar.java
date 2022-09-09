package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BeyazEsya;
import pages.Methodlar;
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


        Methodlar method = new Methodlar();
        method.plpdeUrunAdiveKategoriEslestirme(beyazEsya.beyazEsyaButonu, beyazEsya.buzdolabi);
       // method.plpdeUrunAdiveKategoriEslestirme(beyazEsya.beyazEsyaButonu, beyazEsya.camasirMakinesi);

    }

    @Then("Plp urunler ve kategori adi ayni olmali")
    public void plp_urunler_ve_kategori_adi_ayni_olmali() throws InterruptedException {


        System.out.println(beyazEsya.urunIsimleri.size());
        for (WebElement urunIsmi : beyazEsya.urunIsimleri) {


            Assert.assertTrue(urunIsmi.getText().toLowerCase().contains(beyazEsya.solPanel.getText().toLowerCase()));
        }
        Driver.closeDriver();
    }

    @And("Kullanici derinDondurucu tiklamali")
    public void kullaniciDerinDondurucuTiklamali() throws InterruptedException {
        Methodlar method = new Methodlar();
        method.plpdeUrunAdiveKategoriEslestirme(beyazEsya.beyazEsyaButonu, beyazEsya.derinDondurucu);

    }

    @And("Kullanici bulasikMakinesi tiklamali")
    public void kullaniciBulasikMakinesiTiklamali() throws InterruptedException {
        Methodlar method = new Methodlar();
        method.plpdeUrunAdiveKategoriEslestirme(beyazEsya.beyazEsyaButonu, beyazEsya.bulasikMakinesi);
    }

    @And("Kullanici camasir makinesi tiklamali")
    public void kullaniciCamasirMakinesiTiklamali() throws InterruptedException {
        Methodlar method = new Methodlar();
        method.plpdeUrunAdiveKategoriEslestirme(beyazEsya.beyazEsyaButonu, beyazEsya.camasirMakinesi);
    }
}
