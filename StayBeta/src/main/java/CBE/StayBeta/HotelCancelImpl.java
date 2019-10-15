package CBE.StayBeta;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import Base.BaseUtil;
import stayBetaInterfaces.HotelCancel;


public class HotelCancelImpl extends BaseUtil implements HotelCancel {

	@Override
	public void TakeSSofCancellationChargesFromLB() {
		File screenshotFile = ((TakesScreenshot) CBEDriver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(screenshotFile, new File("C:\\Users\\Kiranmai.adams\\Documents\\StayBeta\\Screenshots"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void DeleteProductFromShoppingCart() throws InterruptedException {
		Thread.sleep(2000);

		String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";

		CBEDriver.findElement(By.id(DeleteButton)).click();

		Thread.sleep(2000);

		String ShoppingCartCount = "	//div/span[contains(@class,'items')]";

		String text = CBEDriver.findElement(By.xpath(ShoppingCartCount)).getText();

		System.out.println("The deleted related text is :" + text);

	}

	@Override
	public void ProductDeleteVerification() {
		String ShoppingCartCount = "	//div/span[contains(@class,'items')]";

		String text = CBEDriver.findElement(By.xpath(ShoppingCartCount)).getText();

		System.out.println("The deleted related text is :" + text);

		assertEquals("(0 item)", text);

	}

	@Override
	public void ClickRetrieveLatestBooking() throws InterruptedException {
		String RLBXpath = "//span[contains(text(),'Retrieve latest booking')]";
		Thread.sleep(2000);
		CBEDriver.findElement(By.xpath(RLBXpath)).click();
		Thread.sleep(2000);
	}

	@Override
	public void VerifyBookingCancellation() {
		String CancelledTxt = "//td[contains(text(),'Cancelled')]";
		CBEDriver.findElement(By.xpath(CancelledTxt)).isDisplayed();

	}

	@Override
	public void ChangeFromDateForHotelAmend() {
		String From = "//*[@id='m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx']";
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		String CurrentFromDate =CBEDriver.findElement(By.xpath(From)).getAttribute("Value");

		System.out.println("the date fetched is " + CurrentFromDate);
		try {
			Date date = format1.parse(CurrentFromDate);
			cal.setTime(date);
			cal.add(Calendar.DATE, 4);
			String NewDate = format1.format(cal.getTime());
			CBEDriver.findElement(By.xpath(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), NewDate);

		}

		catch (ParseException e) {
			e.printStackTrace();
		}

	}
	
	
	@Override
	public void ReduceFromDateForHotelAmend(int NoOfNightsToReduce) throws ParseException {
	String From = "//*[@id='m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx']";
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		String CurrentFromDate =CBEDriver.findElement(By.xpath(From)).getAttribute("Value");

		System.out.println("the date fetched is " + CurrentFromDate);
		try {
			Date date = format1.parse(CurrentFromDate);
			cal.setTime(date);
			cal.add(Calendar.DATE, -NoOfNightsToReduce);
			String NewDate = format1.format(cal.getTime());
			CBEDriver.findElement(By.xpath(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), NewDate);

		}

		catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	

	@Override
	public void AddToCartInAmend() {
		String AddToCartXpath = "//span[contains(text(),'Add to cart')]";
		CBEDriver.findElement(By.xpath(AddToCartXpath)).click();
		
	}

	@Override
	public void ClickOnCancellationConditionsLink() {
		CBEDriver.findElement(By.xpath("//a[contains(.,'Cancellation conditions')]")).click();	
		try {
		 FileWriter writer = new FileWriter("BookingDetails.docx", true);
         BufferedWriter bufferedWriter = new BufferedWriter(writer);
         bufferedWriter.newLine();            	
         bufferedWriter.write( "The Cancellation Charges are: ");			  		
         bufferedWriter.close();
		} 
		 catch (IOException e) {
	          e.printStackTrace();
	      }
	}

	@Override
	public void GetTheCancellationChargesDetails() throws InterruptedException {
		Thread.sleep(2000);
		CBEDriver.switchTo().frame(0);
		Thread.sleep(4000);
		List<WebElement> listings = CBEDriver.findElements(By.xpath("//*[@id='CancellationsContainer']/div/div/div/div/ul/li"));
		      
		for (WebElement we : listings) {
			try {
				try {
					 FileWriter writer = new FileWriter("BookingDetails.docx", true);
			         BufferedWriter bufferedWriter = new BufferedWriter(writer);
			         bufferedWriter.newLine();            	
			         bufferedWriter.write( we.getText());			  		
			         bufferedWriter.close();
			      } 
				 catch (IOException e) {
			          e.printStackTrace();
			      }
								
			} catch (AssertionError e) {
				
				LogLog.error("Other Data Sources Hotels are displayed in the search");
			}
		}
		
		Thread.sleep(2000);
		CBEDriver.findElement(By.xpath("//*[@id=\"glbLightBoxDiv\"]/div[3]/div/a[2]/i")).click();		
		
		Thread.sleep(2000);
		//CBEDriver.switchTo().frame(1);
		Thread.sleep(2000);
	}


}
