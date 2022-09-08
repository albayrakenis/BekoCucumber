package step_definitions;

import io.cucumber.java.en.When;
import pages.BeyazEsya;

public class Test07_IsitmaSogutma {

    BeyazEsya byzEsya =new BeyazEsya();

    @When("Kullanici Isitma Sogutma tiklamali")
    public void kullanici_isitma_sogutma_tiklamali() throws InterruptedException {

        byzEsya.plpdeUrunAdiveKategoriEslestirme(byzEsya.IsitmaSogutma,byzEsya.klima);

    }

}
