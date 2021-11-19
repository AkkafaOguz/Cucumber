package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.ReusableMethods;

import java.io.IOException;

public class ReusableStepDefinitions {


    @Then("take screenshot")
    public void takeScreenshot () throws IOException {

        ReusableMethods.getScreenshot("Screenshot of ");
    }
}
