package cucumberOptions;



import org.junit.BeforeClass;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TestCasesRecent/GB-HotelBooking.feature",  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class TestRunner extends AbstractTestNGCucumberTests {
	
	

	
}
