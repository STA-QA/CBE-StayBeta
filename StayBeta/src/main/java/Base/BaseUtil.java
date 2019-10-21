package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtil {

	public static WebDriver CBEDriver = null;

	public ExtentReports extent;

	public static ExtentTest scenarioDef;

	public static ExtentTest features;
	static String applicationURL = "http://staybeta.bluee.net/login?username=staycbegbcbg&password=cbeuser";
	//http://staybeta.bluee.net/login?username=STAYCBEDEDEU&password=cbeuser
	static String applicationURL_au = "http://staybeta.bluee.net/login?username=staycbeauauu&password=cbeuser";
	// public static String reportLocation = System.getProperty("user.dir") +
	// "//Reports//";

	@BeforeSuite
	public void Setup() {

	}




	// This method is used to Launch the application
		public void openUrl_au() {
			CBEDriver.navigate().to(applicationURL_au);
		}
	public void openUrl() {
		System.out.println("Launching app");
		CBEDriver.navigate().to(applicationURL);
	}

	@AfterSuite

	public void TeardownTest() {
		BaseUtil.CBEDriver.quit();
	}


	public static String screenshot(WebDriver driver, long ms) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) CBEDriver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\screenshot\\" + ms + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		System.out.println("ScreenShot Taken");

		return dest;

	}

	public void searchLoadingtime() {
		// TODO Auto-generated method stub

	}
}
