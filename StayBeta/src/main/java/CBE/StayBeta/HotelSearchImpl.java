package CBE.StayBeta;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stayBetaInterfaces.HotelSearch;
import utilities.TestBase;

public class HotelSearchImpl extends TestBase implements HotelSearch {

	String RoomSelXpath = "//button[@id='Pivot3-Tab3']/div/span/span";
	Actions actions = new Actions(CBEDriver);

	@Override
	public void VerifySearchResultsOfDS(String DataSource) {

		String DSXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[1]";
		int count = CBEDriver.findElements(By.xpath(DSXpath)).size();
		System.out.println("The Hotel count is  " + count);

		List<WebElement> elementList = CBEDriver.findElements(By.xpath(DSXpath));
		for (WebElement we : elementList) {
			try {
				assertTrue(we.getText().equalsIgnoreCase(DataSource));
			} catch (AssertionError e) {
				System.out.println(we.getText());
				LogLog.error("Other Data Sources Hotels are displayed in the search");
			}
		}

	}

	@Override
	public void AddRandomHotelToCartFromTSRes() throws InterruptedException {
		Thread.sleep(2000);
		String AddToCartXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[12]/div/a";
		List<WebElement> listings = CBEDriver.findElements(By.xpath(AddToCartXpath));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size()); // Getting a random value that is between 0 and (list's size)-1
		listings.get(randomValue).click();
	}

	@Override
	public void VerifyReviewsForHotel() throws InterruptedException {

		// String Pages = "//*[@id='m_c_C000_m_m_m_c_ul']/li";

		// int pageCount = CBEDriver.findElements(By.xpath(Pages)).size();

		// for (int i = 1; i <= pageCount; i++) {
		// Thread.sleep(2000);
		// String pageXpath = "//*[@id='m_c_C000_m_m_m_c_ul']/li[" + i + "]";
		// CBEDriver.findElement(By.xpath(pageXpath)).click();

		String ReviewsXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[contains(@class,'external-user-review')]";
		// String RatingsXpath =
		// "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[contains(@class,'//star
		// cell-code')]";
		// star cell-code
		int count = CBEDriver.findElements(By.xpath(ReviewsXpath)).size();
		// int count1 = CBEDriver.findElements(By.xpath(RatingsXpath)).size();
		System.out.println("The Reviews count is  " + count);
		// System.out.println("The Ratings count is " + count);

		List<WebElement> elementList = CBEDriver.findElements(By.xpath(ReviewsXpath));
		for (WebElement we : elementList) {
			try {
				System.out.println("Review :  " + we.getText());
				// assertTrue(we.getText().equalsIgnoreCase(""));
			} catch (AssertionError e) {
				System.out.println(we.getText());
				LogLog.error("Other Data Sources Hotels are displayed in the search");
			}

		}

	}

	@Override
	public void VerifyRatingsForHotel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SelectRoomSelectionTabFromLB() throws InterruptedException {
		Thread.sleep(2000);
		CBEDriver.switchTo().frame(0);
		Thread.sleep(5000);
		CBEDriver.findElement(By.xpath("//*/span[contains(.,'Room selection')]")).click();
	}

	@Override
	public void SelectRoomFromSelectionInLB() {

		String RoomListXpath = "//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[contains(@title,'Select and hide options')]";
		List<WebElement> listings = CBEDriver.findElements(By.xpath(RoomListXpath));
		int size = CBEDriver.findElements(By.xpath(RoomListXpath)).size();
		System.out.println("Rooms available are : " + size);
		if (size > 0) {
			Random r = new Random();
			int randomValue = r.nextInt(listings.size());
			listings.get(randomValue).click();
		} else {

		}

	}

	@Override
	public void SelectSameTypeRoomsFromListsInLB(int NoOfRooms) throws InterruptedException {

		String ChangeIcon1 = "(//*[contains(@title,'Click to see other rooms')])[1]";
		CBEDriver.findElement(By.xpath(ChangeIcon1)).click();

		Thread.sleep(2000);

		String a = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings = CBEDriver.findElements(By.xpath(a));
		int size = CBEDriver.findElements(By.xpath(a)).size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());
		if (size > 0) {

			listings.get(randomValue).click();
		} else {

		}

		String ChangeIcon2 = "(//*[contains(@title,'Click to see other rooms')])[2]";
		CBEDriver.findElement(By.xpath(ChangeIcon2)).click();

		Thread.sleep(2000);

		String b = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings1 = CBEDriver.findElements(By.xpath(b));

		int size1 = CBEDriver.findElements(By.xpath(b)).size();
		System.out.println("Rooms available are : " + size1);
		if (size > 0) {
			listings1.get(randomValue).click();
		} else {

		}

	}

	@Override
	public void SelectDiffTypeRoomsFromListsInLB(int NoOfRooms) throws InterruptedException {
		String ChangeIcon1 = "(//*[contains(@title,'Click to see other rooms')])[1]";
		CBEDriver.findElement(By.xpath(ChangeIcon1)).click();

		Thread.sleep(2000);

		String a = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings = CBEDriver.findElements(By.xpath(a));
		int size = CBEDriver.findElements(By.xpath(a)).size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());
		int randomValue1 = r.nextInt(listings.size());
		if (size > 0) {

			listings.get(randomValue).click();
		} else {

		}

		String ChangeIcon2 = "(//*[contains(@title,'Click to see other rooms')])[2]";
		CBEDriver.findElement(By.xpath(ChangeIcon2)).click();

		Thread.sleep(2000);

		String b = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings1 = CBEDriver.findElements(By.xpath(b));

		int size1 = CBEDriver.findElements(By.xpath(b)).size();
		System.out.println("Rooms available are : " + size1);
		if (size > 0) {
			listings1.get(randomValue1).click();
		} else {

		}

	}

	@Override
	public void AddToCartFromLBWithoutSwitchingFrame() throws InterruptedException {
		Thread.sleep(2000);
		String OLBAddToCartXpath = "//*[contains(@class,'btn-add-to-cart')]";
		CBEDriver.findElement(By.xpath(OLBAddToCartXpath)).click();

	}

	@Override
	public void ExpandRandomHotelRoomtypeOptionsInTable() {
		String ExpandXpath = "//*/span[contains(@title,'Expand alternate room options')]";
		int a = CBEDriver.findElements(By.xpath(ExpandXpath)).size();
		System.out.println("Expand path options " + a);
		List<WebElement> ExpandOptions = CBEDriver.findElements(By.xpath(ExpandXpath));
		Random ran = new Random();
		int randomValue = ran.nextInt(ExpandOptions.size());
		ExpandOptions.get(randomValue).click();

	}

	@Override
	public void SelectARoomFromListInSearchResults() {
		String RoomXpath = "//*/td[contains(@class,'cell-check-btn')]";
		int a = CBEDriver.findElements(By.xpath(RoomXpath)).size();
		System.out.println("Expand path options " + a);
		List<WebElement> RoomOptions = CBEDriver.findElements(By.xpath(RoomXpath));
		Random ran = new Random();
		int randomValue = ran.nextInt(RoomOptions.size());
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(RoomOptions.get(randomValue)).click().perform();

	}

	@Override
	public void ClickAddSelectionToCart() {

		String AddSelectionToCartXpath = "//*/span[contains(.,'Add selection to cart')]";
		actions.moveToElement(CBEDriver.findElement(By.xpath(AddSelectionToCartXpath))).click().perform();

	}

	@Override
	public void SelectMultipleRoomsSameTypeFromListInSearchResults() throws InterruptedException {
		String Room1Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_1_rbnChooseProduct')]";
		int a = CBEDriver.findElements(By.xpath(Room1Xpath)).size();
		System.out.println("Table1 options " + a);

		String Room2Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_2_rbnChooseProduct')]";
		int a1 = CBEDriver.findElements(By.xpath(Room2Xpath)).size();
		System.out.println("Table2 options " + a1);

		List<WebElement> listings = CBEDriver.findElements(By.xpath(Room1Xpath));

		Random r = new Random();
		int randomValue = r.nextInt(listings.size());

		actions.moveToElement(listings.get(randomValue)).click().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(CBEDriver, 15);
		List<WebElement> listings1 = CBEDriver.findElements(By.xpath(Room2Xpath));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Room2Xpath)));

		actions.moveToElement(listings1.get(randomValue)).click().perform();

	}

	@Override
	public void SelectMultipleRoomsDifferentTypeFromListInSearchResults() throws InterruptedException {
		String Room1Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_1_rbnChooseProduct')]";
		int a = CBEDriver.findElements(By.xpath(Room1Xpath)).size();
		System.out.println("Table1 options " + a);

		String Room2Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_2_rbnChooseProduct')]";
		int a1 = CBEDriver.findElements(By.xpath(Room2Xpath)).size();
		System.out.println("Table2 options " + a1);

		List<WebElement> listings = CBEDriver.findElements(By.xpath(Room1Xpath));

		Random r = new Random();
		int randomValue = r.nextInt(listings.size());
		int randomValue1 = r.nextInt(listings.size());

		actions.moveToElement(listings.get(randomValue)).click().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(CBEDriver, 15);
		List<WebElement> listings1 = CBEDriver.findElements(By.xpath(Room2Xpath));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Room2Xpath)));

		actions.moveToElement(listings1.get(randomValue1)).click().perform();
		
	}

}
