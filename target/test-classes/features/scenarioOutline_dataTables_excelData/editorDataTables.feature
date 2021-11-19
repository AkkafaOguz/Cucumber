@ddt
Feature: Create an Account

  Scenario Outline: User should create and verify an account #1


    Given kullanici "editorDataTables" sayfasina gider
    And yeni bir kullanici olusturmak icin new butonuna tiklar
    Then adini "<name>" girer
    And soyadini "<surname>" girer
    Then pozisyonunu "<position>" girer
    And ofisini "<office>" oldugunu girer
    Then extension "<extension>" girer
    And baslangic tarihini "<startDate>" girer
    Then maasini "<salary>" girer
    And create tusuna basar
    When adini "<name>" arama kutusuna girer
    Then kaydinin olustugunu dogrular "<name>", "<surname>"

    Examples:

      | name      | surname | position     | office | extension | startDate  | salary |
      | Oguzhan   | Akkafa  | QA Lead      | LA     | 1995      | 2021-11-18 | 125000 |
      | Onur Enes | Celik   | Team Lead    | NY     | 1996      | 2021-11-19 | 150000 |
      | Muhammed  | Guner   | Psychologist | FL     | 1996      | 2021-06-01 | 225000 |



  Scenario: User should create and verify an account #2
    Given kullanici "editorDataTables" sayfasina gider
    And yeni bir kullanici olusturmak icin new butonuna tiklar formu doldurur ve kaydini dogrular
      | name      | surname | position     | office | extension | startDate  | salary |
      | Oguzhan   | Akkafa  | QA Lead      | LA     | 1995      | 2021-11-18 | 125000 |
      | Onur Enes | Celik   | Team Lead    | NY     | 1996      | 2021-11-19 | 150000 |
      | Muhammed  | Guner   | Psychologist | FL     | 1996      | 2021-06-01 | 225000 |

  Scenario: User should create and verify an account #3
    Given kullanici "editorDataTables" sayfasina gider
    And yeni bir kullanici olusturmak icin new butonuna tiklar formu doldurur "src/test/resources/testData/kullaniciBilgileriExcelData.xlsx" "KullaniciBilgileri" ve kaydini dogrular
