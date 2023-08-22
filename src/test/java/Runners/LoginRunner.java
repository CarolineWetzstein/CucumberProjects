package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_02_Login.feature",
        glue = "StepDefinitions",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)
public class LoginRunner extends AbstractTestNGCucumberTests {

}