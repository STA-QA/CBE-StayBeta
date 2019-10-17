package cucumberOptions;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TestCasesRecent/1-TestCase.feature",  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
