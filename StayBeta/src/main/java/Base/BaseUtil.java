package Base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.KlovReporter;

public class BaseUtil {

	public static WebDriver CBEDriver = null;

	public ExtentReports extent;

	public static ExtentTest scenarioDef;

	public static ExtentTest features;
	
	public static Date d;
	public static ExtentHtmlReporter htmlReporter;
	KlovReporter klov = new KlovReporter();
	
	
	static String applicationURL = "http://staybeta.bluee.net/login?username=staycbegbcbg&password=cbeuser";
	
	static String applicationURL_de = "http://staybeta.bluee.net/login?username=STAYCBEDEDEU&password=cbeuser";
	
	static String applicationURL_au = "http://staybeta.bluee.net/login?username=staycbeauauu&password=cbeuser";

	static String applicationURL_us = "http://staybeta.bluee.net/login?username=staycbeususu&password=cbeuser";
	
	static String applicationURL_za = "http://staybeta.bluee.net/login?username=staycbezaza2&password=cbeuser";

	// This method is used to Launch the application
	public void openUrl_au() {
		CBEDriver.navigate().to(applicationURL_au);
	}
	
	public void openUrl_US() {
		CBEDriver.navigate().to(applicationURL_us);
	}

	public void openUrl() {
		System.out.println("Launching app");
		CBEDriver.navigate().to(applicationURL);
	}

	public void openUrl_DE() {
		CBEDriver.navigate().to(applicationURL_de);
	}
	
	public void openUrl_ZA() {
		CBEDriver.navigate().to(applicationURL_za);
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

	public void addToCart_RefundableHotelRooms() throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
