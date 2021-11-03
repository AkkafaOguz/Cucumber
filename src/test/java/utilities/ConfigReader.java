package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    /*

    Test class ile Configuration.properties arasinda bir kopru gorevi gorur.

    1- Properties objesi olustur

    2- Bu class'in amaci configuration.properties dosyasini okumak ve oradaki key-value birimlerini kullanarak
       istedigimiz key'e ait value'yu bize getir.

    3- Test class'larindan configReader class'ina ulasip yukaridaki islemleri yapmammizi saglayacak bir method olustur.


     */


//  1-

     static Properties properties;

//  2-

    static {
        String filePath = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getProperty (String key) {

        String value = properties.getProperty(key);

        return value;
    }
}
