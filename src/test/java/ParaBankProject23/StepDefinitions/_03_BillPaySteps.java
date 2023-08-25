package ParaBankProject23.StepDefinitions;

import ParaBankProject23.Pages.ElementLocators;
import ParaBankProject23.Utilities.ParameterDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class _03_BillPaySteps {

    ElementLocators el = new ElementLocators();
    @Given("Navigate to ParaBank Website")
    public void navigateToParaBankWebsite() {
        ParameterDriver.getDriver().get(" https://parabank.parasoft.com/parabank/index.htm");

    }

    @And("Click on Log in button")
    public void clickOnLogInButton() {
        el.clickMethod(el.loginButton);
    }

    @Then("Verify success Login")
    public void verifySuccessLogin() {
        el.assertTitle();
    }

    @And("Click on Bill Pay Link")
    public void clickOnBillPayLink() {
        el.clickMethod(el.billPayLink);
    }

    private static int index = 0;
    @And("Fill form information")
    public void fillFormInformation(DataTable formInfo) {
       // List<Map<String,String>> rows = formInfo.asMaps(String.class, String.class);
        List<List<String>> formList = formInfo.asLists(String.class);

//        for (Map<String, String> row: rows){
//            String field = row.get("Field");
//            String value = row.get("Value");
//
//           el.sendKeysMethod(el.payeeName, row.get("Payee Name"));
//            el.sendKeysMethod(el.addressInput, row.get("Address"));
//            el.sendKeysMethod(el.cityInput, row.get("City"));
//            el.sendKeysMethod(el.stateInput, row.get("State"));
//            el.sendKeysMethod(el.zipCodeInput, row.get("Zip Code"));
//            el.sendKeysMethod(el.phoneNumber, row.get("Phone Number"));
//            el.sendKeysMethod(el.accountNumber, row.get("Account Number"));
//            el.sendKeysMethod(el.verifyAccount, row.get("Verify Account"));
//            el.sendKeysMethod(el.amount, row.get("Amount"));
//        }

        el.sendKeysMethod(el.payeeName, formList.get(0).get(index));
        el.sendKeysMethod(el.addressInput, formList.get(1).get(index));
        el.sendKeysMethod(el.cityInput, formList.get(2).get(index));
        el.sendKeysMethod(el.stateInput, formList.get(3).get(index));
        el.sendKeysMethod(el.zipCodeInput, formList.get(4).get(index));
        el.sendKeysMethod(el.phoneNumber, formList.get(5).get(index));
        el.sendKeysMethod(el.accountNumber, formList.get(6).get(index));
        el.sendKeysMethod(el.verifyAccount, formList.get(7).get(index));
        el.sendKeysMethod(el.amount, formList.get(8).get(index));

        index++;
    }

    @And("Click on Send Payment")
    public void clickOnSendPayment() {
        el.clickMethod(el.sendPayment);
    }


    @And("Enter {string} and  and {string}")
    public void enterAndAnd(String payeeName, String amount) {
        el.sendKeysMethod(el.payeeName, payeeName);
        el.sendKeysMethod(el.amount, amount);
    }

    @And("Click on send payment button")
    public void clickOnSendPaymentButton() {
        el.clickMethod(el.sendPayment);
    }

    @Then("Verify successful payment")
    public void verifySuccessfulPayment() {

        Assert.assertTrue(ParameterDriver.getDriver().getTitle().contains("Bill Payment Complete"));
    }
}
