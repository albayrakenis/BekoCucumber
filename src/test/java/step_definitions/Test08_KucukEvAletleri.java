package step_definitions;

import io.cucumber.java.en.When;
import pages.BeyazEsya;

public class Test08_KucukEvAletleri {

    BeyazEsya byzEsya =new BeyazEsya();


    @When("Kullanici Kucuk Ev Aletleri tiklamali")
    public void kullanici_kucuk_ev_aletleri_tiklamali() throws InterruptedException {

        byzEsya.plpdeUrunAdiveKategoriEslestirme(byzEsya.KücükEvAletleri,byzEsya.supurge);
        
    }
}
