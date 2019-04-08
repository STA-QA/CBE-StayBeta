package cucumberOptions;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testCaseResources", 
glue = "stepDefinitions",  plugin = {"pretty","json:target/cucumber-report/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
