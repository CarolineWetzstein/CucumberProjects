package ParaBankProject23.Runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = "src/test/java/ParaBankProject23/FeatureFiles/_03_BillPay.feature",
        glue = "ParaBankProject23/StepDefinitions",
        plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = true //checks if all required step definitions for the feature exist

)
public class BillPayRunner extends AbstractTestNGCucumberTests {

    @AfterClass
            public static  void  writeOnExtentReport(){

        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Tester Name","Caroline");
        ExtentService.getInstance().setSystemInfo("Application Name","ParaBank");
        ExtentService.getInstance().setSystemInfo("Operating System",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");
    }



}
