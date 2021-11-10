package stepDefinitions;

import io.cucumber.datatable.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConcortHotel;

import java.util.List;

public class ConcortHotelQaEnvironmentStepDefinitions {

    ConcortHotel concortHotel = new ConcortHotel();

    @Then("login linkine tiklar")
    public void login_linkine_tiklar() {
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
    @Given("user enter manager_id and manager_password")
    public void user_enter_manager_id_and_manager_password(DataTable credentials) {
        List<String> managerCredentials = credentials.row(0);
        //System.out.println(managerCredentials); [manager, Manager1!]
        //System.out.println(managerCredentials.get(0)); manager
        //System.out.println(managerCredentials.get(1)); Manager1!
        concortHotel.userNameBox.sendKeys(managerCredentials.get(0));
        concortHotel.passwordBox.sendKeys(managerCredentials.get(1));
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(concortHotel.isLoginSuccessfully.isDisplayed());
    }

}
