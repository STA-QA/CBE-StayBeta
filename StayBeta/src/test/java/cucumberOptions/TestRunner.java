package cucumberOptions;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/TestCasesRecent/Amend-ChangeNumberOfPassenger.feature", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		extentProperties.setReportPath("Reports/STA-CBE-Automation.html");

	}

}
