package cucumberOptions;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;

@CucumberOptions(
	    monochrome = true,
	    features = "@target/rerun.txt",
	    format = {"pretty", "html:target/site/cucumber-pretty",
	            "json:target/cucumber.json"},
	    plugin = {
	    		"com.cucumber.listener.ExtentCucumberFormatter:"}
	  )
	public class FailedScenarios {

	@BeforeClass
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		extentProperties.setReportPath("Reports/STA-CBE-Automation.html");

	}


	}