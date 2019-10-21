package cucumberOptions;



import org.junit.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TestCasesRecent/BookActivitiesAndDayTrips.feature",  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class ActivitiesAndDayTripsRunner extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public void setup() {
	ExtentProperties extentProperties = ExtentProperties.INSTANCE;

	extentProperties.setReportPath("Reports/STA-CBE-Automation.html");
	}
	
}

