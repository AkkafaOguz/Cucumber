package dbStepDefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbStepDefinition {

    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=qaconcorthotel; user=Ahmet_User;password=Ahmet123!";
    String username = "Ahmet_User";
    String password = "Ahmet123!";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici Concort Hotel database'ine baglanir")
    public void kullanici_concort_hotel_database_ine_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

    }

    @And("kullanici {string} tablosundaki {string} verileri alir")
    public void kullaniciTablosundakiVerileriAlir(String table, String field) throws SQLException {
        //SELECT Price FROM tHotelRoom
        String readQuery = "SELECT " + field + " FROM " + table;
        resultSet = statement.executeQuery(readQuery);
    }

    @Given("kullanici {string} sutunundaki verileri okur ve istedigi islemleri yapar")
    public void kullanici_sutunundaki_verileri_okur_ve_istedigi_islemleri_yapar(String field) throws SQLException {

        resultSet.first();
        System.out.println(resultSet.getObject(field).toString());

        resultSet.next();

        //next() -> Iterator'daki hasNext() gibi true ve false deger dondurur.
        //Bunu yaparken eger sonuc true ise pointer bir sonraki elemana gecer.

        resultSet.first();
        do {
            try {
                System.out.println(resultSet.getObject(field).toString());
            } catch (Exception e) {
            }
        } while (resultSet.next());

        List<String> elemanlar = new ArrayList<>();

        resultSet.first();
        for (int i = 0; i < 100; i++) {
            try {
                elemanlar.add((i + 1) + "- " + resultSet.getObject(field).toString());
            } catch (Exception e) {

            }
        }

        System.out.println(elemanlar);
    }


}
