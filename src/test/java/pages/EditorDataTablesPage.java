package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorDataTablesPage {


    public EditorDataTablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@class = 'dt-button buttons-create']")
    public WebElement newButton;

    @FindBy (id = "DTE_Field_first_name")
    public WebElement firstNameBox;

    @FindBy (id = "DTE_Field_last_name")
    public WebElement lastNameBox;

    @FindBy (id = "DTE_Field_position")
    public WebElement positionBox;

    @FindBy (id = "DTE_Field_office")
    public WebElement officeBox;

    @FindBy (id = "DTE_Field_extn")
    public WebElement extensionBox;

    @FindBy (id = "DTE_Field_start_date")
    public WebElement startDateBox;

    @FindBy (id = "DTE_Field_salary")
    public WebElement salaryBox;

    @FindBy (xpath = "//div[@class= 'DTE_Form_Buttons']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@type= 'search']")
    public WebElement searchBox;

    @FindBy (xpath = "//table//td[2]")
    public List<WebElement> namesOnTheTable;

}
