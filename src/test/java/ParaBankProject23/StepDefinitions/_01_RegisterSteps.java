package ParaBankProject23.StepDefinitions;

import ParaBankProject23.Utilities.ParameterDriver;
import ParaBankProject23.Pages.ElementLocators;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _01_RegisterSteps {

    ElementLocators el = new ElementLocators();
    @Given("Navigate to ParaBank webpage")
    public void navigateToParaBankWebpage() {
        ParameterDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("Click on register link")
    public void clickOnRegisterLink() {
        el.clickMethod(el.registerLink);
    }

    @And("Fill form with valid data")
    public void fillFormWithValidData(DataTable formInfo) throws InterruptedException {
        List<String> rows = formInfo.asList(String.class);

        el.sendKeysMethod(el.firstName, rows.get(0));
        el.sendKeysMethod(el.lastName, rows.get(1));
        el.sendKeysMethod(el.addressLine, rows.get(2));
        el.sendKeysMethod(el.cityLine, rows.get(3));
        el.sendKeysMethod(el.stateLine, rows.get(4));
        el.sendKeysMethod(el.zipCodeLine, rows.get(5));
        el.sendKeysMethod(el.phoneLine, rows.get(6));
        el.sendKeysMethod(el.ssnLine, rows.get(7));
        el.sendKeysMethod(el.userName, rows.get(8));
        el.sendKeysMethod(el.passWord, rows.get(9));
        el.sendKeysMethod(el.passwordConfirm, rows.get(10));

    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        el.clickMethod(el.registerButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        el.waitUntilClickable(el.successMessage1);
        el.assertText(el.successMessage1, "created");
    }
}
