package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.KlovReporter;
<<<<<<< HEAD
import com.cucumber.listener.ExtentProperties;
=======
import com.vimalselvam.cucumber.listener.ExtentProperties;
>>>>>>> a52e80a788c9be39a93e5fae7feb3b2736f579c3

import Base.funtions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Insurance.feature", tags = {"@DE"}, plugin = {
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class InsuranceRunnerDE extends AbstractTestNGCucumberTests {



	public static String timeStamp = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	@BeforeSuite
	public static void setup() {

		funtions commonfunctions = new funtions();
		commonfunctions.reportfunction();
	}
}


