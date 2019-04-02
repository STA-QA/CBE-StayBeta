package cucumberOptions;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testResources/TestLogic.feature", 
glue = "stepDefinitions", format = {"pretty", "html:test-output", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
