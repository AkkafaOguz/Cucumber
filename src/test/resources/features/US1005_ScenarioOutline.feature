Feature: US1005 Amazon'da liste ile arama

  Scenario Outline: TC09 amazon'da verilen bir listeyi aratip sonuclari test etme

    Given kullanici "amazonUrl" sayfasina gider
    Then "<arananUrun>" icin arama yapar
    And sonuc yazisini yazdirir
    And sonucun "<arananUrun>" icerdigini test eder
    Then sayfayi kapatir

    Examples:

    |arananUrun|
    |nutella|
    |java   |
    |ipod   |
    |armut  |
    |Apple  |
