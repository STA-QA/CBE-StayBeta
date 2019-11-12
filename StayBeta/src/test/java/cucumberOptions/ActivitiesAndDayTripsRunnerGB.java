package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.BeforeSuite;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import Base.funtions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/RegressionSuite/BookActivitiesAndDayTrips.feature", tags = {
		"@GB" }, plugin = { "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:",
				"rerun:target/rerun.txt" }, glue = "stepDefinitions")

public class ActivitiesAndDayTripsRunnerGB extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public static void setup() {
		funtions commonfunctions = new funtions();
		commonfunctions.reportfunction();

	}

}
