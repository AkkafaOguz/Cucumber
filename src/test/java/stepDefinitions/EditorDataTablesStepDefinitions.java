package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import okhttp3.WebSocket;
import okhttp3.internal.cache.DiskLruCache;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EditorDataTablesPage;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class EditorDataTablesStepDefinitions {

    EditorDataTablesPage ed = new EditorDataTablesPage();

    @Given("yeni bir kullanici olusturmak icin new butonuna tiklar")
    public void yeni_bir_kullanici_olusturmak_icin_new_butonuna_tiklar() {

        ed.newButton.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("adini {string} girer")
    public void adiniGirer(String name) {
        ed.firstNameBox.sendKeys(name);
    }

    @And("soyadini {string} girer")
    public void soyadiniGirer(String surname) {
        ed.lastNameBox.sendKeys(surname);
    }

    @Then("pozisyonunu {string} girer")
    public void pozisyonunuGirer(String position) {
        ed.positionBox.sendKeys(position);
    }

    @And("ofisini {string} oldugunu girer")
    public void ofisiniOldugunuGirer(String office) {
        ed.officeBox.sendKeys(office);
    }

    @Then("extension {string} girer")
    public void extensionGirer(String extension) {
        ed.extensionBox.sendKeys(extension);
    }

    @And("baslangic tarihini {string} girer")
    public void baslangicTarihiniGirer(String startDate) {
        ed.startDateBox.sendKeys(startDate);
    }

    @Then("maasini {string} girer")
    public void maasiniGirer(String salary) {
        ed.salaryBox.sendKeys(salary);
    }

    @When("create tusuna basar")
    public void create_tusuna_basar() {
        ed.createButton.click();
    }

    @When("adini {string} arama kutusuna girer")
    public void adiniAramaKutusunaGirer(String name) {
        ed.searchBox.clear();
        ed.searchBox.sendKeys(name);
    }

    @Then("kaydinin olustugunu dogrular {string}, {string}")
    public void kaydininOlustugunuDogrular(String name, String surname) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(ed.newButton));
        List<WebElement> names = ed.namesOnTheTable;
        names.stream().forEach(t-> System.out.println(t.getText()));
        Assert.assertTrue("Creation a new account is failed",names.stream().anyMatch(t -> t.getText().equals(name + " " + surname)));
    }

    @Given("yeni bir kullanici olusturmak icin new butonuna tiklar formu doldurur ve kaydini dogrular")
    public void yeni_bir_kullanici_olusturmak_icin_new_butonuna_tiklar_formu_doldurur_ve_kaydini_dogrular(DataTable dataTable) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        List<Map<String,String>> fields = dataTable.asMaps();
        System.out.println(fields);
        fields.stream().forEach(t-> {
            System.out.println(t);
            ed.newButton.click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ed.firstNameBox.sendKeys(t.get("name"));
            ed.lastNameBox.sendKeys(t.get("surname"));
            ed.positionBox.sendKeys(t.get("position"));
            ed.officeBox.sendKeys(t.get("office"));
            ed.extensionBox.sendKeys(t.get("extension"));
            ed.startDateBox.sendKeys(t.get("startDate"));
            ed.salaryBox.sendKeys(t.get("salary"));
            ed.createButton.click();
            ed.searchBox.clear();
            ed.searchBox.sendKeys(t.get("name"));
            wait.until(ExpectedConditions.visibilityOf(ed.newButton));
            List <WebElement> names =  ed.namesOnTheTable;
            Assert.assertTrue("Creation a new account is failed",names.stream().anyMatch(x -> x.getText().equals(t.get("name") + " " + t.get("surname"))));
        });
    }


    @And("yeni bir kullanici olusturmak icin new butonuna tiklar formu doldurur {string} {string} ve kaydini dogrular")
    public void yeniBirKullaniciOlusturmakIcinNewButonunaTiklarFormuDoldururVeKaydiniDogrular(String filePath, String sheetName) {
        ExcelUtil excelUtil = new ExcelUtil(filePath,sheetName);
        List<Map<String,String>> fields = excelUtil.getDataAsListOfMap();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        fields.stream().forEach(t-> {
            System.out.println(t);
            ed.newButton.click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ed.firstNameBox.sendKeys(t.get("name"));
            ed.lastNameBox.sendKeys(t.get("surname"));
            ed.positionBox.sendKeys(t.get("position"));
            ed.officeBox.sendKeys(t.get("office"));
            ed.extensionBox.sendKeys(t.get("extension"));
            ed.salaryBox.sendKeys(t.get("salary"));
            ed.createButton.click();
            ed.searchBox.clear();
            ed.searchBox.sendKeys(t.get("name"));
            wait.until(ExpectedConditions.visibilityOf(ed.newButton));
            List <WebElement> names =  ed.namesOnTheTable;
            Assert.assertTrue("Creation a new account is failed",names.stream().anyMatch(x -> x.getText().equals(t.get("name") + " " + t.get("surname"))));
        });


    }
}
