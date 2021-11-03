package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConcortHotel;

public class ConcortHotelQaEnvironmentStepDefinitions {

    ConcortHotel concortHotel = new ConcortHotel();

    @Then("login kinkine tiklar")
    public void login_kinkine_tiklar() {
        concortHotel.loginButton.click();
    }
    @Then("username kutusuna {string} yazar")
    public void username_kutusuna_yazar(String string) {
        concortHotel.userNameBox.sendKeys(string);
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String string) {
        concortHotel.passwordBox.sendKeys(string);
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        concortHotel.submitButton.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(concortHotel.isLoginFailed.isDisplayed());
    }


}
