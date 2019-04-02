package cucumberOptions;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testResources/TestLogic.feature", 
glue = "stepDefinitions", format = {"json:target/cucumber-report/cucumber.json"},
plugin = {"json:target/cucumber-report/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
