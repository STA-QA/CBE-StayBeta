package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/BookActivitiesAndDayTrips.feature", tags = {"@US"}, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String timeStamp = new SimpleDateFormat("dd-MMMHH:mm").format(new Date());
		String Path = "Reports/CBEREport.html";
		extentProperties.setReportPath(Path);
		
		
	

	}

}
