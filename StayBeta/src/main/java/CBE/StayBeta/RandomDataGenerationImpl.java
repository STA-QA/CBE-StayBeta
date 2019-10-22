package CBE.StayBeta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.cucumber.listener.Reporter;

import Base.BaseUtil;
import stayBetaInterfaces.RandomDataGeneration;


public class RandomDataGenerationImpl extends BaseUtil implements RandomDataGeneration{
	public String Price = "//div[@id='m_c_C000_m_c_ctl14_ctl01_ctl01_bclBkCrits_0_bntItemDetails_0_uscItm_divTotalFare']";
	public String Bookingref = "//div/h4/span[@id='lblFoldNo']";
	@Override
	public void storeBookingDetails() throws IOException {
		
		CBEDriver.findElement(By.xpath(Price)).click();
		String bookingrefnumber = CBEDriver.findElement(By.xpath(Bookingref)).getAttribute("innerHTML");

		Reporter.addStepLog(bookingrefnumber);
		String screenShotPath = BaseUtil.screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);
		/*
		 * String bookingrefnumber =
		 * CBEDriver.findElement(By.xpath("//div[@id='m_c_C000_m_c_up']/div/div/h4")).
		 * getText(); Reporter.addStepLog(bookingrefnumber); String screenShotPath =
		 * screenshot(CBEDriver, System.currentTimeMillis());
		 * Reporter.addScreenCaptureFromPath(screenShotPath);
		 */
		
		/*
		 * try {
		 * 
		 * // FileWriter writer = new FileWriter("Booking-Details.txt", true);
		 * FileWriter writer = new FileWriter("BookingDetails.docx", true);
		 * BufferedWriter bufferedWriter = new BufferedWriter(writer);
		 * bufferedWriter.newLine();
		 * 
		 * Calendar cal = Calendar.getInstance(); SimpleDateFormat format1 = new
		 * SimpleDateFormat("dd-MMM-yy hh:mm"); String BookingDate =
		 * format1.format(cal.getTime());
		 * bufferedWriter.write("The Below booking done at : " + BookingDate);
		 * bufferedWriter.newLine(); bufferedWriter.write(text);
		 * bufferedWriter.newLine(); bufferedWriter.close(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 */
		
		
	}
	
	public void AddScreenshotToReport() throws IOException {
		String screenShotPath = screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);
	}
	
	

	

}
