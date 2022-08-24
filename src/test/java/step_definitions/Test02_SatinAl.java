package step_definitions;

import io.cucumber.java.en.*;
import pages.Login;
import pages.SatinAl;
import utility.ConfigurationReader;
import utility.Driver;

public class Test02_SatinAl {
    SatinAl satinAl = new SatinAl();

    @When("Kullanici urun secmeli")
    public void kullanici_urun_secmeli() throws InterruptedException {
        satinAl.satinAlma("Mini Buzdolabı");
    }

    @When("Kullanici sepete eklemeli")
    public void kullanici_sepete_eklemeli() {


    }

    @When("Kullanici odeme adimina gitmeli")
    public void kullanici_odeme_adimina_gitmeli() {
        System.out.println("3");
    }

    @Then("Kullanici kart bilgilerini girmeli")
    public void kullanici_kart_bilgilerini_girmeli() {
        System.out.println("4");

    }



}
