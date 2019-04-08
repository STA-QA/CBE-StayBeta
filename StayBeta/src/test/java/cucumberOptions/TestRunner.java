package cucumberOptions;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testCaseResources/DeleteShoppingCart.feature", 
glue = "stepDefinitions",  plugin = {"pretty","json:test-output/cucumber-report/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
