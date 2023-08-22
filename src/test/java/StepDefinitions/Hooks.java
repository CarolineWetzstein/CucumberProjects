package StepDefinitions;

import Utilities.ParameterDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario Run");

    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] byteImage = ((TakesScreenshot) ParameterDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());

        }
        //  ParameterDriver.quitDriver();

    }

    @AfterAll
    public static void quitWebDriver() {
        ParameterDriver.quitDriver();
    }
}