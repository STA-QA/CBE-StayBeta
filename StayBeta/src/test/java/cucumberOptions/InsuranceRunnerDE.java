package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.KlovReporter;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import com.vimalselvam.cucumber.listener.ExtentProperties;

import Base.funtions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Insurance - Bookings.feature", tags = {"@DE"}, plugin = {
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt", "json:target/cucumber-reports/cucumber.json" }, glue = "stepDefinitions")
public class InsuranceRunnerDE extends AbstractTestNGCucumberTests {

	public static String timeStamp = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
	@BeforeSuite
	public static void setup() {

		funtions commonfunctions = new funtions();
		commonfunctions.reportfunction();
	}
	
	@AfterSuite(alwaysRun=true)
	public void setupp(){
		
	CucumberResultsOverview results = new CucumberResultsOverview();
	results.setOutputDirectory("target");
	results.setOutputName("cucumber-results");
	results.setSourceFile("target/cucumber-reports/cucumber.json");
	try {
		results.execute();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}

}