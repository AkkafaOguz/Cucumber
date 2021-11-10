package stepDefinitions;

import io.cucumber.datatable.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConcortHotel;
import utilities.Driver;

import java.util.List;


public class Concort_Hotel_Room_Reservation {

    ConcortHotel concortHotel = new ConcortHotel();
    @Given("user navigates to the create_room_reservation_page")
    public void user_navigates_to_the_create_room_reservation_page() {
        concortHotel.hotelManagementButton.click();
        concortHotel.roomReservationsButton.click();
        concortHotel.addRoomReservationButton.click();
    }

    @Given("user enters all required fields")
    public void user_enters_all_required_fields(DataTable roomData) {
       List<String> testData=  roomData.row(1);
        Select select = new Select(concortHotel.selectUserDropDown);
        select.selectByVisibleText(testData.get(0));
        select = new Select(concortHotel.selectHotelRoomDropDown);
        select.selectByVisibleText(testData.get(1));
        concortHotel.priceBox.sendKeys(testData.get(2));
        concortHotel.dateStartBox.sendKeys(testData.get(3));
        concortHotel.dateEndBox.sendKeys(testData.get(4));
        concortHotel.adultAmountBox.sendKeys(testData.get(5));
        concortHotel.childrenAmountBox.sendKeys(testData.get(6));
        concortHotel.contactNameSurnameBox.sendKeys(testData.get(7));
        concortHotel.contactPhoneBox.sendKeys(testData.get(8));
        concortHotel.contactEmailBox.sendKeys(testData.get(9));
        concortHotel.notesBox.sendKeys(testData.get(10));

    }

    @And("user clicks on the approved_checkbox")
    public void userClicksOnTheApproved_checkbox() {
        concortHotel.approvedBox.click();
    }

    @And("user clicks on the is paid_checkbox")
    public void userClicksOnTheIsPaid_checkbox() {
        concortHotel.isPaidBox.click();
    }

    @And("user clicks on save_button")
    public void userClicksOnSave_button() {
        concortHotel.saveButton.click();
    }

    @Then("user verifies the success_message")
    public void userVerifiesTheSuccess_message() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        Assert.assertTrue("Hotel reservation can not be saved",wait.until(ExpectedConditions.visibilityOf(concortHotel.successMessage)).isDisplayed());
        concortHotel.okButton.click();
    }
}
