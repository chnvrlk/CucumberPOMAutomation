package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import com.cucumber.listener.Reporter;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags={"@SmokeTest"},
        features= {"src/test/java"},
        glue= {"tests"},
        plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"},
        dryRun= false
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/main/java/xmlfiles/extentReportSet.xml");

        Reporter.setSystemInfo("QA Tester : ", "Cihan VARLIK");
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}
