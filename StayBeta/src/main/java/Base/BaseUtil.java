package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtil {

	public static WebDriver driver = null;

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


	@AfterSuite
	public void TeardownTest() {
		//BaseUtil.driver.quit();
	}
}
