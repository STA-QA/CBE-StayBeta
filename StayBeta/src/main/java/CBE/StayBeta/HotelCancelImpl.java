package CBE.StayBeta;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.By;
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
		
		System.out.println("The deleted related text is :" +text);
		
	}

	@Override
	public void ProductDeleteVerification() {
String ShoppingCartCount = "	//div/span[contains(@class,'items')]";
		
		String text = CBEDriver.findElement(By.xpath(ShoppingCartCount)).getText();
		
		System.out.println("The deleted related text is :" +text);
		
		assertEquals("(0 itm)", text);
		
	}
	
	

}
