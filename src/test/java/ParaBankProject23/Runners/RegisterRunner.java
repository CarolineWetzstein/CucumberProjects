package ParaBankProject23.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/ParaBankProject23/FeatureFiles/_01_Register.feature",
        glue = "ParaBankProject23/StepDefinitions"
)

public class RegisterRunner  extends AbstractTestNGCucumberTests {
}
