package cucumberOptions;



import org.junit.BeforeClass;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TestCasesRecent/Insurance.feature",  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class InsuranceRunner extends AbstractTestNGCucumberTests {
	
	

	
}

