package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.BeforeSuite;



import Base.funtions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Hotel - ValidateCostQuote.feature", plugin = {"pretty",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:","json:target/cucumber-reports/cucumber.json", "rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class InsuranceRunnerGB extends AbstractTestNGCucumberTests {


	public static String timeStamp = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	@BeforeSuite
	public static void setup(){
			
		funtions commonfunctions = new funtions();
		commonfunctions.reportfunction();
		
		
		}
	}



