@room_reservation
Feature: Room Reservation

#  Her karsilasilan kosul icin screeshot alinmasi ileride yasanacak problemlerin onune gecmek icin faydali olabilir.
#  Fakat bu kadar gorselin depolanmasi problemi nasil asilacak bilemiyorum.
#  Scenario Outline varken DataTable kullanmak ne kadar mantikli onu da bilemiyorum.


  Scenario: TC01_user_should_login_manager_profile

    Given kullanici "concortHotelQaUrl" sayfasina gider
    Then take screenshot
    Then login linkine tiklar
    And user enter manager_id and manager_password
      | username | password  |
      | manager  | Manager1! |
    Then take screenshot
    And login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    Then take screenshot

  Scenario: TC02_user_should_navigate_room_reservation_page

    Given user navigates to the create_room_reservation_page


  Scenario: TC03_user_should_be_able_to_book_a_reservation

    Given user enters all required fields
      | selectUserDropDown | selectHotelRoomDropDown | priceBox | dateStartBox | dateEndBox | adultAmountBox | childrenAmountBox | contactNameSurnameBox | contactPhoneBox | contactEmailBox | notesBox |
      | manager            | Oguzhan                 | 500      | 11/18/2021   | 11/20/2021 | 2              | 3                 | Test                  | (999) 999-9999  | test@gmail.com  | test not |

    And user clicks on the approved_checkbox
    And user clicks on the is paid_checkbox
    And user clicks on save_button
    Then user verifies the success_message
    Then take screenshot
    And sayfayi kapatir


