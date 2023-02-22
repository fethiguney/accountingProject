package stepdefinitons;

import io.cucumber.java.en.*;
import pages.PastelBulutPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class PastelBulutStepDefinitons {

    PastelBulutPages pastelBulutPages=new PastelBulutPages();
    List<String> windowList;

    @Given("kullanici pastelbulut url adresine gider")
    public void kullanici_pastelbulut_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullanici giris yapin butonuna tiklar")
    public void kullanici_giris_yapin_butonuna_tiklar() {
        pastelBulutPages.girisYapınButton.click();
        windowList=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windowList.get(1));

    }
    @Then("kullanici gecerli eposta adresi girer")
    public void kullanici_gecerli_eposta_adresi_girer() {
        pastelBulutPages.epostaGiris.sendKeys(ConfigReader.getProperty("email"));
        ReusableMethods.waitFor(1);
    }
    @Then("kullanici gecerli parola girer ve giris butonuna tiklar")
    public void kullanici_gecerli_parola_girer_ve_giris_butonuna_tiklar() {
        pastelBulutPages.parolaGiris.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(1);
        pastelBulutPages.girisButton.click();

    }
    @Then("kullanici basarili bir sekilde sisteme girdigini dogrular")
    public void kullanici_basarili_bir_sekilde_sisteme_girdigini_dogrular() {
        ReusableMethods.waitFor(1);
        pastelBulutPages.kullanimPaketi.click();

    }

}
