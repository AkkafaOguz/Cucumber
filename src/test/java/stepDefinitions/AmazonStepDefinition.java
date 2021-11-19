package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {

        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);

    }
    @Then("sonucun nutella icerdigini test eder")
    public void sonucun_nutella_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.searchResult.getText().contains("Nutella"));
    }

    @When("java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("java" + Keys.ENTER);
    }
    @Then("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("java"));
    }

    @When("ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("ipad" + Keys.ENTER);
    }
    @Then("sonucun ipad icerdigini test eder")
    public void sonucun_ipad_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("ipad"));
    }


    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
          Driver.closeDriver();
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.searchBox.sendKeys(arananKelime + Keys.ENTER);

    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.searchResult.getText().contains(arananKelime));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }

    @And("sonuc yazisini yazdirir")
    public void sonucYazisiniYazdirir() {
        System.out.println(amazonPage.searchBox.getText());
    }

    @Then("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
}
