package ParaBankProject23.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/ParaBankProject23/FeatureFiles/_02_Login.feature",
        glue = "ParaBankProject23/StepDefinitions",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)
public class LoginRunner extends AbstractTestNGCucumberTests {

}