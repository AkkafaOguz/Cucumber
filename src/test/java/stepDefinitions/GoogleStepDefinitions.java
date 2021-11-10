package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Google;
import utilities.Driver;

public class GoogleStepDefinitions {

    Google google = new Google();

    @Then("kullanici arama kutusuna {string} yazar ve aratir")
    public void kullanici_arama_kutusuna_yazar_ve_aratir(String string) {

        google.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("Sonucun {string} icerdigini test eder")
    public void sonucun_icerdigini_test_eder(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}
