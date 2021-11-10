package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EbayPage;

import java.security.Key;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();

    @Then("ebayda {string} icin arama yapar")
    public void ebayda_icin_arama_yapar(String string) {
        ebayPage.searchBox.sendKeys(string + Keys.ENTER);
    }
    @Then("ebayda sonucun {string} icerdigini test eder")
    public void ebayda_sonucun_icerdigini_test_eder(String string) {

        Assert.assertTrue(ebayPage.resultText.getText().contains(string));
    }
}
