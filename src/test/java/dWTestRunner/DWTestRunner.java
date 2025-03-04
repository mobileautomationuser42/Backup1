package dWTestRunner;
 
import org.testng.annotations.Listeners;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Android", 
					glue = { "dWStepDefinitions" },
					plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
					monochrome = false, 
					//dryRun = true, 
					tags = "@TRKDW-624")  

//@Listeners(ExtentITestListenerClassAdapter.class)
public class DWTestRunner extends AbstractTestNGCucumberTests {
	 
}