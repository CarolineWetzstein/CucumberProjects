package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_01_Register.feature",
        glue = "StepDefinitions"
)

public class RegisterRunner  extends AbstractTestNGCucumberTests {
}
