package step_definitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.Login;
import pages.SatinAl;
import utility.ConfigurationReader;
import utility.Driver;

import java.util.concurrent.TimeUnit;

public class Test02_SatinAl {

    SatinAl satinAl = new SatinAl();

    @When("Kullanici urun secmeli")
    public void kullanici_urun_secmeli() throws InterruptedException {
        satinAl.satinAlma("Mini Buzdolabı");
    }

    @When("Kullanici sepete eklemeli")
    public void kullanici_sepete_eklemeli() throws InterruptedException {
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1500);

        satinAl.UrunDort.click();
        satinAl.sepeteAt.click();



    }

    @When("Kullanici odeme adimina gitmeli")
    public void kullanici_odeme_adimina_gitmeli() {

        satinAl.sepeteGit.click();
        satinAl.sepetiOnayla.click();
        satinAl.krediKarti.click();



    }

    @Then("Kullanici kart bilgilerini girmeli")
    public void kullanici_kart_bilgilerini_girmeli() {

        satinAl.krediKartiNumarasi.sendKeys(ConfigurationReader.get("krediKartiNumarasi"));
        satinAl.krediKartiSahibi.sendKeys("enis albayrak");
        satinAl.krediKartiTarih.sendKeys("1230");
        satinAl.krediKartiCvv.sendKeys("000");
        satinAl.onBilgilendirme.click();
        satinAl.mesafeliSatisSozlesmesi.click();



    }



}
