package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	static String applicationURL = "http://staybeta.bluee.net/login?username=staycbegbcbg&password=cbeuser";
	
	//static String applicationURL = "http://staydelta.bluee.net/login?username=staycbegbcbg&password=cbeuser";
	
	public static WebDriver CBEDriver = null;

	// This method is used to initialise the Chrome Browser
	public static void main() {
		File file = new File("C:\\Automation\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		CBEDriver = new ChromeDriver();
		CBEDriver.manage().window().maximize();
		CBEDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// This method is used to Launch the application
	public void openUrl() {
		CBEDriver.navigate().to(applicationURL);
	}

	// This method is used to close the driver
	public void quitDriver() {
		CBEDriver.quit();
	}

}
