package cucumberOptions;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testCaseResources", 
glue = "stepDefinitions", format = {"pretty", "html:test-output", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
