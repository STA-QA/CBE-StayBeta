package cucumberOptions;







import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/RegressionSuite/Insurance.feature", tags = {"@GB"},  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class InsuranceRunner extends AbstractTestNGCucumberTests {
	
	

	
}

