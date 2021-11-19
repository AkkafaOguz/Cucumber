@CH
Feature: US1006 Concort Hotel sayfasinda farkli kullanici bilgileri ile negatif test


  Scenario Outline:


    Given kullanici "concortHotelQaUrl" sayfasina gider
    Then login linkine tiklar
    And username kutusuna "<wrongUserName>" yazar
    And password kutusuna "<wrongPassword>" yazar
    And login butonuna basar
    Then giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:

  |wrongUserName|wrongPassword|
  |Manager5     | Manager5!   |
  |Manager6     |Manager6!    |
  |Manager7     |Manager7!    |
  |Manager8     |Manager8!    |
  |Manager9     |Manager9!    |