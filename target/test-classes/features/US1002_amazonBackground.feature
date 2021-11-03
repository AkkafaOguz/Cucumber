@background
Feature: US1002 amazon background

  Background: amazon sayfasina gitme
    When kullanici amazon sayfasina gider

  @amazon @nutella
  Scenario: TC04 amazon nutella arama

    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 amazon nutella arama

    And java icin arama yapar
    Then sonucun java icerdigini test eder
    And sayfayi kapatir


  Scenario: TC06 amazon nutella arama

    And ipad icin arama yapar
    Then sonucun ipad icerdigini test eder
    And sayfayi kapatir