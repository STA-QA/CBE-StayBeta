package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumber.listener.Reporter;

import Base.BaseUtil;
import Base.funtions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Result;

public class Hook extends BaseUtil {

	public BaseUtil base;

//Author Guru

	@Before
	public void InitializeTest(Scenario scenario) {

		//System.out.println("TEST");
	//	scenarioDef = base.features.createNode(scenario.getName());
	//	ExtentProperties extentProperties = ExtentProperties.INSTANCE;

		//extentProperties.setReportPath("Reports/STA-CBE-Automation.html");
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		  + "/WebDrivers/chromedriver.exe");


		  ChromeOptions options = new ChromeOptions();
		 // options.addArguments("enable-automation");
		  options.setExperimentalOption("useAutomationExtension", false);
		  options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 // options.addArguments("----headless");
		  CBEDriver = new ChromeDriver(options);

		  CBEDriver.manage().window().maximize();
		  CBEDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@After
	public void TearDownTest(Scenario scenario) throws IOException, InterruptedException {
		if (scenario.getStatus().equals(Result.FAILED)) {

			funtions commonfunctions = new funtions();
			String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
			Reporter.addScreenCaptureFromPath(screenShotPath);
			System.out.println(scenario.getName());

		}
		// Driver.quit();

	}

	public static void captureScreenshot(WebDriver driver, String screenshotName) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./screenshot/" + screenshotName + ".png"));

			System.out.println("Screenshot taken");

		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}

	}
}
