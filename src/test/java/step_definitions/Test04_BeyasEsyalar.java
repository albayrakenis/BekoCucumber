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


    }

    @Then("Plp urunler ve kategori adi ayni olmali")
    public void plp_urunler_ve_kategori_adi_ayni_olmali() throws InterruptedException {


        System.out.println(beyazEsya.urunIsimleri.size());
        for (WebElement urunIsmi : beyazEsya.urunIsimleri) {
            System.out.println(urunIsmi.getText());
        }
        Driver.closeDriver();
    }
}
