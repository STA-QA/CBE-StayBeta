package CBE.StayBeta;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import stayBetaInterfaces.HotelCancel;
import utilities.TestBase;

public class HotelCancelImpl extends TestBase implements HotelCancel {

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
	public void AddToCartInAmend() {
		String AddToCartXpath = "//span[contains(text(),'Add to cart')]";
		CBEDriver.findElement(By.xpath(AddToCartXpath)).click();
		
	}

}
