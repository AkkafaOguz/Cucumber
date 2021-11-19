package stepDefinitions;

import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConcortHotel;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class ConcortHotelQaEnvironmentStepDefinitions {

    ConcortHotel concortHotel = new ConcortHotel();
    AmazonStepDefinition setUp = new AmazonStepDefinition();

    @Then("login linkine tiklar")
    public void login_linkine_tiklar() {
        concortHotel.loginButton.click();
        if (!Driver.getDriver().getCurrentUrl().equals(ConfigReader.getProperty("loginUrl"))) {
            setUp.kullaniciSayfasinaGider("concortHotelQaUrl");
            concortHotel.loginButton.click();
        }

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

        // 1. Way: credentials.row()

//        List<String> managerCredentials = credentials.row(0);
//        //System.out.println(managerCredentials); [manager, Manager1!]
//        //System.out.println(managerCredentials.get(0)); manager
//        //System.out.println(managerCredentials.get(1)); Manager1!
//        concortHotel.userNameBox.sendKeys(managerCredentials.get(0));
//        concortHotel.passwordBox.sendKeys(managerCredentials.get(1));

        // 2. Way: credentials.asLists()

//        List<List<String>> managerCredentials = credentials.asLists();
//        managerCredentials.stream().filter(t -> !t.get(0).equals("username")).forEach(t -> {
//            concortHotel.userNameBox.sendKeys(t.get(0));
//            concortHotel.passwordBox.sendKeys(t.get(1));
//        });

        // 3. Way: credentials.asMaps()

        List <Map<String,String>> managerCredentials = credentials.asMaps();
        System.out.println(managerCredentials);
        managerCredentials.stream().forEach(t-> {concortHotel.userNameBox.sendKeys(t.get("username")); concortHotel.passwordBox.sendKeys(t.get("password"));});

    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(concortHotel.isLoginSuccessfully.isDisplayed());
    }


    @Given("user log in the application using {string} {string}")
    public void user_log_in_the_application_using_excel_admin(String filePath,String sheetName) {
        String excelFile = ConfigReader.getProperty(filePath);
        String excelFileSheetName = ConfigReader.getProperty(sheetName);;
        ExcelUtil excelUtil = new ExcelUtil(excelFile,excelFileSheetName);
        List<Map<String,String>> testData = excelUtil.getDataAsListOfMap();
        for (Map<String,String> w: testData) {
            setUp.kullaniciSayfasinaGider("concortHotelQaUrl");
            login_linkine_tiklar();
            username_kutusuna_yazar(w.get("username"));
            password_kutusuna_yazar(w.get("password"));
            login_butonuna_basar();
            sayfayaGirisYaptiginiKontrolEder();
        }
    }
}
