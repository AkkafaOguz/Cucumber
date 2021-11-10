@screenshot
Feature: US1010 Screenshot failure

  Scenario: TC14 Amazon test

    When kullanici "amazonUrl" sayfasina gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC15 Amazon test

    When kullanici "ebayUrl" sayfasina gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC16  Amazon test

    When kullanici "concortHotelQaUrl" sayfasina gider
    Then basligin "amazon" icerdigini test eder
    And sayfayi kapatir