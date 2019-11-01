package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeSuite;
import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Hotel - CostQuote.feature", tags= {"@AU"}, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class HotelCostQuoteAU extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("Reports/1SourceReleaseReport.html");
		
	}

}