package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import Base.funtions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/AU-Cancellations.feature", plugin = {
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class AU_CancellationsRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public static void setup() {

		funtions commonfunctions = new funtions();
		commonfunctions.reportfunction();
		
	}

}
