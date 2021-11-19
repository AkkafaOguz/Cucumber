package dbStepDefinitions;

import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DbUtilStepDefinitions {

    @Given("kullanici DB Util ile Concort Hotel database'ine baglanir")
    public void kullanici_db_util_ile_concort_hotel_database_ine_baglanir() {
        DBUtils.getConnection();

    }
    @Given("kullanici DB Util ile {string} tablosundaki {string} verileri alir")
    public void kullanici_db_util_ile_tablosundaki_verileri_alir(String table, String field) {
        String readQuery = "SELECT " + field + " FROM " + table;
        DBUtils.executeQuery(readQuery);
    }
    @Given("kullanici DB Util ile {string} sutunundaki {int}. fiyatin {int} oldugunu test eder")
    public void kullanici_db_util_ile_sutunundaki_fiyatin_oldugunu_test_eder(String string, Integer int1, Integer int2) throws Exception {
        DBUtils.getResultset().first();

        int satirSayisi = DBUtils.getRowCount();

        int aktifSatirNumarasi=1;
        System.out.println(satirSayisi);
        DBUtils.getResultset().first();

        while (aktifSatirNumarasi<satirSayisi){
            System.out.println(aktifSatirNumarasi+".satirdaki fiyat : "+DBUtils.getResultset().getDouble(string));
            DBUtils.getResultset().next();
            aktifSatirNumarasi++;
        }


    }

    @Then("DBU IDHotel degeri {int} olan kaydin Email degerini {string} yapar")
    public void dbuIDHotelDegeriOlanKaydinEmailDegeriniYapar(int arg0, String arg1) throws SQLException {

        String readQuery = "SELECT IDHotel FROM tHotel";
        DBUtils.executeQuery(readQuery);

        for (int i = 0; i < 100; i++) {
            System.out.println(DBUtils.getResultset().getDouble("IDHotel"));
            DBUtils.getResultset().next();
        }

    }
}
