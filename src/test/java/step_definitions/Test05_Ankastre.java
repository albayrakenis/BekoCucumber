package step_definitions;

import io.cucumber.java.en.When;
import pages.BeyazEsya;

public class Test05_Ankastre {

    BeyazEsya byzEsya = new BeyazEsya();
    @When("Kullanici Ankastreyi tiklamali")
    public void kullanici_ankastreyi_tiklamali() throws InterruptedException {

        byzEsya.plpdeUrunAdiveKategoriEslestirme(byzEsya.Ankastre,byzEsya.ankastreFirinlar);

    }
}
