package cucumberOptions;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/TestCasesRecent/Transfers.feature", 
glue = "stepDefinitions",  plugin = {"pretty","json:target/cucumber-report/cucumber.json"}, monochrome = true)


public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
