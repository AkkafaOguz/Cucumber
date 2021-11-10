@Paralel01
Feature: US1001 amazon arama

  @amazon @nutella
  Scenario: TC01 amazon nutella arama

    When kullanici amazon sayfasina gider
    And nutella icin arama yapar
    Then sonucun nutella icerdigini test eder


  @amazon @java
  Scenario: TC02 amazon nutella arama

    When kullanici amazon sayfasina gider
    And java icin arama yapar
    Then sonucun java icerdigini test eder


  @amazon @ipad
  Scenario: TC03 amazon nutella arama

    When kullanici amazon sayfasina gider
    And ipad icin arama yapar
    Then sonucun ipad icerdigini test eder
