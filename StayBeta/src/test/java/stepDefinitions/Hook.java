package stepDefinitions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vimalselvam.cucumber.listener.Reporter;

import Base.BaseUtil;
import Base.funtions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Result;

public class Hook extends BaseUtil {
	public static ExtentReports extentReports;
	public static ExtentHtmlReporter htmlReporter;
	public static ITestResult iTestResult;

	String Dockerexecution="yes";



	@Before


	public void InitializeTest(Scenario scenario) throws MalformedURLException {

		if (Dockerexecution.equalsIgnoreCase("yes")) {

			Capabilities chromeCapabilities = DesiredCapabilities.chrome();
			RemoteWebDriver CBEDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);

		}
		else {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/WebDrivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("start-maximized");
		//options.addArguments("----headless");
		CBEDriver = new ChromeDriver(options);
		CBEDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// Reporter.log("After Method: " + iTestResult.getMethod().getMethodName());
		}
	}

	@After
	public void TearDownTest(Scenario scenario) throws IOException, InterruptedException {

		if (scenario.getStatus().equals(Result.FAILED)) {

			funtions commonfunctions = new funtions();
			String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
			Reporter.addScreenCaptureFromPath(screenShotPath);
			System.out.println(scenario.getName());

		}



		CBEDriver.quit();

	}

}
