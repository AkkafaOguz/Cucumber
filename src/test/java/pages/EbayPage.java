package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPage {

    public EbayPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "_nkw")
    public WebElement searchBox;

    @FindBy (className = "srp-controls__count-heading")
    public WebElement resultText;
}
