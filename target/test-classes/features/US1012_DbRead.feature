Feature: US1012 Kullanici Concort Hotel Databse'ini Test Eder

  Scenario: TC18 Concort Hotel Database Read Test

    Given kullanici Concort Hotel database'ine baglanir
    And kullanici "tHotelRoom" tablosundaki "Price" verileri alir
    And kullanici "Price" sutunundaki verileri okur ve istedigi islemleri yapar
