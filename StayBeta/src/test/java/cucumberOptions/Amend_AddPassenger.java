package cucumberOptions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Amend-AddPassenger.feature", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class Amend_AddPassenger extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("Reports/OtherDataSoucesAmendAndCancel.html");

	}

}
