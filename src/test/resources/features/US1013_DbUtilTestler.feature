Feature: US1013 Kullanici DB Util ile Concort Hotel Databse'ini Test Eder
  @dbutil
  Scenario: TC19 DB Util ile Concort Hotel Database Read Test

    Given kullanici DB Util ile Concort Hotel database'ine baglanir
    And kullanici DB Util ile "tHotelRoom" tablosundaki "Price" verileri alir
    And kullanici DB Util ile "Price" sutunundaki 5. fiyatin 400 oldugunu test eder

  @dbupdate
  Scenario: Kullanici tHOTEL tablosundan istedigi Emaili update eder

    Given kullanici DB Util ile Concort Hotel database'ine baglanir
    Then  DBU IDHotel degeri 1108 olan kaydin Email degerini "asddd@gmail.com" yapar