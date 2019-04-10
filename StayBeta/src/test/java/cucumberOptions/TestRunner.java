package cucumberOptions;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/testResources/TestLogic.feature", 
glue = "stepDefinitions",  plugin = {"pretty","json:target/cucumber-report/cucumber.json"})


public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
