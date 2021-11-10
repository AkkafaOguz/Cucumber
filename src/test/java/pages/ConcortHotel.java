package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConcortHotel {

    public ConcortHotel() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Log in")
    public WebElement loginButton;

    @FindBy (id = "UserName")
    public WebElement userNameBox;

    @FindBy (id = "Password")
    public WebElement passwordBox;

    @FindBy (id = "btnSubmit")
    public WebElement submitButton;

    @FindBy (xpath = "//*[.='Try again please']")
    public WebElement isLoginFailed;

    @FindBy (xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement isLoginSuccessfully;

    @FindBy (xpath = "//span[.='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy (partialLinkText = "Room reservations")
    public WebElement roomReservationsButton;

    @FindBy (xpath = "//*[.='Add Room Reservation ']")
    public WebElement addRoomReservationButton;

    @FindBy (id = "IDUser")
    public WebElement selectUserDropDown;

    @FindBy (id = "IDHotelRoom")
    public WebElement selectHotelRoomDropDown;

    @FindBy (id = "Price")
    public WebElement priceBox;

    @FindBy (id = "DateStart")
    public WebElement dateStartBox;

    @FindBy (id = "DateEnd")
    public WebElement dateEndBox;

    @FindBy (id = "AdultAmount")
    public WebElement adultAmountBox;

    @FindBy (id = "ChildrenAmount")
    public WebElement childrenAmountBox;

    @FindBy (id = "ContactNameSurname")
    public WebElement contactNameSurnameBox;

    @FindBy (id = "ContactPhone")
    public WebElement contactPhoneBox;

    @FindBy (id = "ContactEmail")
    public WebElement contactEmailBox;

    @FindBy (id = "Notes")
    public WebElement notesBox;

    @FindBy (id = "Approved")
    public WebElement approvedBox;

    @FindBy (id = "IsPaid")
    public WebElement isPaidBox;

    @FindBy (id = "btnSubmit")
    public WebElement saveButton;

    @FindBy (xpath = "//*[.='RoomReservation was inserted successfully']")
    public WebElement successMessage;

    @FindBy (xpath = "//button[@data-bb-handler='ok']")
    public WebElement okButton;

}
