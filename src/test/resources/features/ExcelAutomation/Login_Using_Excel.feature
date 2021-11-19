@excel_data_login
Feature: login_feature

  Scenario: admin_login
    Given user log in the application using "loginExcelFilePath" "loginExcelSheetForAdmin"
    And sayfayi kapatir


  Scenario: manager_login
    Given user log in the application using "loginExcelFilePath" "loginExcelSheetForManager"
    And sayfayi kapatir

