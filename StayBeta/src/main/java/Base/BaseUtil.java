package Base;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtil {

	public static WebDriver CBEDriver = null;

	public ExtentReports extent;

	public static ExtentTest scenarioDef;

	public static ExtentTest features;
	
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




	
	public static String getScreenshot(WebDriver CBEDriver, String ScreenShotName) throws IOException
    {
        String dateName=new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date());
        TakesScreenshot ts=(TakesScreenshot)CBEDriver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String destination=System.getProperty("user.dir")+"/FailedScreenshots/"+ScreenShotName+dateName+".png";
        File finalDestination=new File(destination);
        FileUtils.copyFile(source, finalDestination);

        String Imagepath="file://Machinename/FailedScreenshots/"+ScreenShotName+dateName+".png";
        return Imagepath;
    }
	
	

	public void searchLoadingtime() {
		// TODO Auto-generated method stub

	}

	public void addToCart_RefundableHotelRooms() throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
