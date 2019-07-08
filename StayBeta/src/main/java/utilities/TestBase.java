package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static String applicationURL = "http://staybeta.bluee.net/login?username=staycbegbcbg&password=cbeuser";
	
	static String applicationURL_au = "http://staybeta.bluee.net/login?username=staycbeauauu&password=cbeuser";

	public static WebDriver CBEDriver = null;

	// This method is used to initialise the Chrome Browser
	public static void main() {
		//File file = new File("WebDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
	//	options.addArguments("--headless");
		CBEDriver = new ChromeDriver(options);
		CBEDriver.manage().window().maximize();
		CBEDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// This method is used to Launch the application
	public void openUrl() {
		CBEDriver.navigate().to(applicationURL);
	}
	
	
	// This method is used to Launch the application
		public void openUrl_au() {
			CBEDriver.navigate().to(applicationURL_au);
		}

	// This method is used to close the driver
	public void quitDriver() {
		CBEDriver.quit();
	}

}
