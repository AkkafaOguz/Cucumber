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
}
