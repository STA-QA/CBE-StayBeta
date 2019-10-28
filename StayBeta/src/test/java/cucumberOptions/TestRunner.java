package cucumberOptions;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Cancel-AfterHotelBooking.feature", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		extentProperties.setReportPath("Reports/STA-CBE-Automation.html");

	}

}
