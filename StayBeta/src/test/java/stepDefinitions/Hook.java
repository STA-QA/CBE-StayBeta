package stepDefinitions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.KlovReporter;
import  com.vimalselvam.cucumber.listener.Reporter;

import Base.BaseUtil;
import Base.funtions;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import gherkin.formatter.model.Result;

public class Hook extends BaseUtil {
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReporter;

	@Before
	public void InitializeTest(Scenario scenario) {
		

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/WebDrivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("useAutomationExtension", false);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("start-maximized");
		//options.addArguments("----headless");
		

		CBEDriver = new ChromeDriver(options);

		//CBEDriver.manage().window().maximize();

		CBEDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@After
	public void TearDownTest(Scenario scenario) throws IOException, InterruptedException {
		
		extentReports.flush();
		if (scenario.getStatus().equals(Result.FAILED)) {

			funtions commonfunctions = new funtions();
			String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
			Reporter.addScreenCaptureFromPath(screenShotPath);
			System.out.println(scenario.getName());

			CBEDriver.quit();



		}

		CBEDriver.quit();


	}
	@BeforeStep
	public void beforestep() {
		
		System.out.println("-----------in Beforestep");
		
	}
	
}
