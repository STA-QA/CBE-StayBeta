package cucumberOptions;


import org.junit.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/TestCasesRecent/GB-HotelBooking.feature",  plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:" }, glue = "stepDefinitions")


public class GBHotelBookingRunner extends AbstractTestNGCucumberTests {
	
	@BeforeClass
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		extentProperties.setReportPath("Reports/STA-CBE-Automation.html");

	}
	

	
}
