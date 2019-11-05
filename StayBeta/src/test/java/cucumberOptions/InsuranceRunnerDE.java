package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.KlovReporter;
import com.cucumber.listener.ExtentProperties;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/RegressionSuite/Insurance.feature", tags = {"@DE"}, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:","rerun:target/rerun.txt" }, glue = "stepDefinitions")


public class InsuranceRunnerDE extends AbstractTestNGCucumberTests {

	public ExtentReports extent;
	public static Date d;
	@BeforeClass
	public static void setup() {

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		extentProperties.setReportPath("Reports/STA-Automation.html");

	}

	@BeforeSuite

	public void report() {
		KlovReporter klov = new KlovReporter();

	    extent = new ExtentReports();

	    klov.initMongoDbConnection("localhost", 27017);
	    klov.setProjectName("STAX-CD/CI-Report");
	    klov.setReportName("STAx" + d.toString());


	    extent.attachReporter( klov);

	}


}
