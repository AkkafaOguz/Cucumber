@Paralel01
Feature: US1010 Screenshot failure

  Scenario: TC14 Amazon test

    When kullanici "amazonUrl" sayfasina gider
    Then basligin "Amazon" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC15 Ebay test

    When kullanici "ebayUrl" sayfasina gider
    Then basligin "eBay" icerdigini test eder
    And sayfayi kapatir


  Scenario: TC16 Concort test

    When kullanici "concortHotelQaUrl" sayfasina gider
    Then basligin "Concort" icerdigini test eder
    And sayfayi kapatir