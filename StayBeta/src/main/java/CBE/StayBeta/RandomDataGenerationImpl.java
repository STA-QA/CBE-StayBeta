package CBE.StayBeta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import Base.BaseUtil;
import Base.funtions;
import gherkin.deps.net.iharder.Base64;
import stayBetaInterfaces.RandomDataGeneration;


public class RandomDataGenerationImpl extends BaseUtil implements RandomDataGeneration{
	Base.funtions functions = new Base.funtions();
	public String Price = "//div[@id='m_c_C000_m_c_ctl14_ctl01_ctl01_bclBkCrits_0_bntItemDetails_0_uscItm_divTotalFare']";
	public String Bookingref = "//div/h4/span[@id='lblFoldNo']";
	funtions commonfunctions = new funtions();


	@Override
	public void storeBookingDetails() throws IOException {

		CBEDriver.findElement(By.xpath(Price)).click();
		String bookingrefnumber = CBEDriver.findElement(By.xpath(Bookingref)).getAttribute("innerHTML");

		Reporter.addStepLog(bookingrefnumber);
		String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);

        String bookingnumber = bookingrefnumber.replaceAll("\\D+","");
		functions.sendDatatoCSVfile(bookingnumber);

	}

	public void AddScreenshotToReport() throws IOException {

				String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
		        Reporter.addScreenCaptureFromPath(screenShotPath);

	}

	public static String getBase64Screenshot() throws IOException {

	    Date oDate = new Date();
	    SimpleDateFormat oSDF = new SimpleDateFormat("yyyyMMddHHmmss");
	    String sDate = oSDF.format(oDate);
	    String encodedBase64 = null;
	    FileInputStream fileInputStream = null;
	    TakesScreenshot screenshot = (TakesScreenshot) CBEDriver;
	    File source = screenshot.getScreenshotAs(OutputType.FILE);
	    String destination =System.getProperty("user.dir")+"\\Foldername\\target\\cucumber-reports\\"+"Screenshot_" + sDate + ".png";
	    File finalDestination = new File(destination);
	    FileUtils.copyFile(source, finalDestination);

	    try {
	        fileInputStream =new FileInputStream(finalDestination);
	        byte[] bytes =new byte[(int)finalDestination.length()];
	        fileInputStream.read(bytes);
	        encodedBase64 = new String(Base64.encodeBytes(bytes));

	    }catch (FileNotFoundException e){
	        e.printStackTrace();
	    }
	    return "data:image/png;base64,"+encodedBase64;
	}




}
