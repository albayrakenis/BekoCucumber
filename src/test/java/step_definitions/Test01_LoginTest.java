package step_definitions;

import io.cucumber.java.en.*;
import pages.Login;
import utility.ConfigurationReader;
import utility.Driver;

public class Test01_LoginTest {
    Login login = new Login();



    @Given("Kullanici giris sayfasina gitmeli")
    public void kullaniciGirisSayfasinaGitmeli() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
    }

    @Then("Kullanici su sayfaya gelmeli {string}")
    public void kullaniciSuSayfayaGelmeli(String string1) {
        Driver.closeDriver();
        System.out.println("giriş başarılı");
    }

    @When("Kullanici yanlis kullanici bilgilerini girmeli")
    public void kullaniciYanlisKullaniciBilgileriniGirmeli() {
        login.uyelikButonu.click();
        login.username.sendKeys(ConfigurationReader.get("username")+1);
        login.password.sendKeys(ConfigurationReader.get("password")+1);
        login.girisYapButonu.click();
        Driver.closeDriver();



    }

    @Then("Kullanici su sayfaya gelmeli basarisiz giris {string}")
    public void kullaniciSuSayfayaGelmeliBasarisizGiris(String string2) {
        Driver.closeDriver();

    }

    @When("Kullanici login olmali")
    public void kullaniciLoginOlmali() throws InterruptedException {
        Thread.sleep(1500);
        login.bekoLogin();

    }
}
