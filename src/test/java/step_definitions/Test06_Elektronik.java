package step_definitions;

import io.cucumber.java.en.When;
import pages.BeyazEsya;

public class Test06_Elektronik {

    BeyazEsya byzEsya =new BeyazEsya();
    @When("Kullanici Elektronik tiklamali")
    public void kullanici_elektronik_tiklamali() throws InterruptedException {

        byzEsya.plpdeUrunAdiveKategoriEslestirme(byzEsya.Elektronik,byzEsya.televizyon);
    }
}
