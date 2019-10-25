package CBE.StayBeta;

import java.io.IOException;

import org.openqa.selenium.By;

import com.cucumber.listener.Reporter;

import Base.BaseUtil;
import stayBetaInterfaces.RandomDataGeneration;


public class RandomDataGenerationImpl extends BaseUtil implements RandomDataGeneration{
	Base.funtions functions = new Base.funtions();
	public String Price = "//div[@id='m_c_C000_m_c_ctl14_ctl01_ctl01_bclBkCrits_0_bntItemDetails_0_uscItm_divTotalFare']";
	public String Bookingref = "//div/h4/span[@id='lblFoldNo']";
	@Override
	public void storeBookingDetails() throws IOException {

		CBEDriver.findElement(By.xpath(Price)).click();
		String bookingrefnumber = CBEDriver.findElement(By.xpath(Bookingref)).getAttribute("innerHTML");

		Reporter.addStepLog(bookingrefnumber);
		String screenShotPath = BaseUtil.screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);
        String bookingnumber = bookingrefnumber.replaceAll("\\D+","");
		functions.sendDatatoCSVfile(bookingnumber);

	}

	public void AddScreenshotToReport() throws IOException {
		String screenShotPath = screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);
	}





}
