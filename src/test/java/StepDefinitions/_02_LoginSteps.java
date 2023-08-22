package StepDefinitions;

import Pages.ElementLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    ElementLocators el = new ElementLocators();
    @When("Enter {string} as username and {string} as password")
    public void enterAsUsernameAndAsPassword(String username, String password) throws InterruptedException {
        el.sendKeysMethod(el.username, "CGroup4");
        el.sendKeysMethod(el.password, "Qwerty+12");
    }

    @And("Click on Login button")
    public void clickOnLoginButton() throws InterruptedException {
        el.clickMethod(el.loginButton);
        Thread.sleep(1000);
    }

    @Then("Verify Login Status")
    public void verifyLoginStatus() throws InterruptedException{
        Thread.sleep(3000);
        el.assertTitle();
    }
}
