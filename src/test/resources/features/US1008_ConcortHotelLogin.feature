@rapor1
Feature: US1008 Concort Hotel Login

  Scenario: TC12 kullanici gecerli bilgilerle giris yapar

    Given kullanici "concortHotelQaUrl" sayfasina gider
    Then login linkine tiklar
    And username kutusuna "manager" yazar
    And password kutusuna "Manager1!" yazar
    And login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir