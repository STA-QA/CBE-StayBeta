package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
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

	@Before
	public void InitializeTest(Scenario scenario) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/WebDrivers/chromedriver77.exe");

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("useAutomationExtension", false);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("start-maximized");
	//	options.addArguments("----headless");
		

		CBEDriver = new ChromeDriver(options);

		//CBEDriver.manage().window().maximize();

		CBEDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@After
	public void TearDownTest(Scenario scenario) throws IOException, InterruptedException {
		if (scenario.getStatus().equals(Result.FAILED)) {

			funtions commonfunctions = new funtions();
			String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
			Reporter.addScreenCaptureFromPath(screenShotPath);
			System.out.println(scenario.getName());

			CBEDriver.quit();



		}

		CBEDriver.quit();


	}


}
