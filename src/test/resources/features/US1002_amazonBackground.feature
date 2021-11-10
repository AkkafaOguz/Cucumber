@Paralel01
Feature: US1002 amazon background

  Background: amazon sayfasina gitme
    When kullanici amazon sayfasina gider

  @amazon @nutella
  Scenario: TC04 amazon nutella arama

    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder



  Scenario: TC05 amazon java arama

    And java icin arama yapar
    Then sonucun java icerdigini test eder



  Scenario: TC06 amazon ipad arama

    And ipad icin arama yapar
    Then sonucun ipad icerdigini test eder
