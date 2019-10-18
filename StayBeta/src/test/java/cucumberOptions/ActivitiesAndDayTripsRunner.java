package cucumberOptions;



import org.junit.BeforeClass;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TestCasesRecent/BookActivitiesAndDayTrips.feature",  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class ActivitiesAndDayTripsRunner extends AbstractTestNGCucumberTests {
	
	

	
}

