package CBE.StayBeta;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.log4j.helpers.LogLog;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	    
		/*
		 * if(CBEDriver.findElements(By.id("pnlSearchResultsPagination")).size()>0) {
		 * System.out.println("In Pagination"); List<WebElement> Pages =
		 * CBEDriver.findElements(By.xpath("//*[@id=\"m_c_C000_m_m_m_c_ul\"]/li"));
		 * Random r = new Random(); System.out.println("The total page numbers is : " +
		 * Pages.size()); int rValue = r.nextInt(Pages.size());
		 * System.out.println("The page number is : " + rValue);
		 * Pages.get(rValue).click(); Thread.sleep(2000); }
		 */
	    
	    
	    
		String AddToCartXpath = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[12]/div/a";
		
		
		List<WebElement> listings = CBEDriver.findElements(By.xpath(AddToCartXpath));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size()); 
		
		WebElement parent=listings.get(randomValue).findElement(By.xpath("./../../.."));
	
		String id = parent.getAttribute("id");
		
      	String HotelNamepath = "//*[@id='"+id+"']/td[3]";
		String HotelName = CBEDriver.findElement(By.xpath(HotelNamepath)).getText();
		
		String ExpandXpath = "//*[@id='"+id+"']/td[11]//div/div/a/span[@title='Expand price breakdown']";
		CBEDriver.findElement(By.xpath(ExpandXpath)).click();
		Thread.sleep(1000);
		String SplComm = CBEDriver.findElement(By.xpath(
				"//*[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes')]/td/table/tbody/tr[2]/td[3]")).getText();
		System.out.println("Special Commission is: " +SplComm);
		String intValue = SplComm.replaceAll("[^0-9]", "");
		float f = Float.parseFloat(intValue);
		
		try {
			Assert.assertTrue(f>0);
		}catch(AssertionError E) {
			LogLog.error("Split Commission is not displayed properly for : " + HotelName);
		}
		catch(Exception E) {
			LogLog.error("Split Commission is not displayed properly for : " + HotelName);
		}
		
		String CollapseXpath = "//*[@id='"+id+"']/td[11]//div/div/a/span[@title='Collapse price breakdown']";
		
		System.out.println("The Hotel Name is:  "+HotelName);
		
	//	String RoomTypeXpath1 = "//*[@id='"+id+"']/td[6]/span";
		
		
		//String RoomType1 = CBEDriver.findElement(By.xpath(RoomTypeXpath1)).getText();
		
	//	String RoomType2 = CBEDriver.findElement(By.xpath(RoomTypeXpath2)).getText();
		
	//	System.out.println("Room Type is:  " +RoomType1);
		
		//System.out.println("Room Type 2 is:  " +RoomType2);
		
		try {
			 FileWriter writer = new FileWriter("BookingDetails.docx", true);
	         BufferedWriter bufferedWriter = new BufferedWriter(writer);
	         bufferedWriter.newLine();            	
	         bufferedWriter.write("****************************************************************");
	         bufferedWriter.newLine();            	
	         bufferedWriter.write("The Booking Details through Automation are : ");
	         bufferedWriter.newLine();            	
	         bufferedWriter.write("The Hotel Name is: " + HotelName);
			/*
			 * bufferedWriter.newLine(); bufferedWriter.write("Room Type 1 is:  "
			 * +RoomType1);
			 */
			/*
			 * bufferedWriter.newLine(); bufferedWriter.write("Room Type 2 is:  "
			 * +RoomType2);
			 */
	          bufferedWriter.newLine();
	          bufferedWriter.write("Split Commission is:  " +SplComm);
	          bufferedWriter.close();
	      } 
		 catch (IOException e) {
	          e.printStackTrace();
	      }
			
		
		
		Thread.sleep(2000);
		CBEDriver.findElement(By.xpath(CollapseXpath)).click();
		Thread.sleep(5000);
		List<WebElement> listing = CBEDriver.findElements(By.xpath(AddToCartXpath));
		 WebDriverWait wait = new WebDriverWait(CBEDriver, 50);
         wait.until(ExpectedConditions.elementToBeClickable(listing.get(randomValue)));
     	listing.get(randomValue).click();
     	
     	
     	
	}

	@Override
	public void VerifyReviewsForHotel() throws InterruptedException {
		Thread.sleep(4000);
		CBEDriver.findElement(By.name("m$c$C000$m$m$m$c$pagingControl$ddlNumResultsPerPage")).sendKeys("100");
		Thread.sleep(4000);
		String Pages = "//*[@id='m_c_C000_m_m_m_c_ul']/li";

		int pageCount = CBEDriver.findElements(By.xpath(Pages)).size();
		System.out.println(pageCount + "  is the page count");

		for (int i = 1; i <= pageCount; i++) {
			Thread.sleep(2000);
			String pageXpath = "//*[@id='m_c_C000_m_m_m_c_ul']/li[" + i + "]";

			WebDriverWait wait = new WebDriverWait(CBEDriver, 25);
			if (i > 1) {
				wait.until(ExpectedConditions.elementToBeClickable(CBEDriver.findElement(By.xpath(pageXpath))));
				CBEDriver.findElement(By.xpath(pageXpath)).click();
				Thread.sleep(6000);
			}
			String RXP = "external-user-review";
			String ReviewsXpath = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[contains(@class,'external-user-review')]";
			int count = CBEDriver.findElements(By.className(RXP)).size();
			System.out.println("The Reviews count is  " + count);

			List<WebElement> elementList = CBEDriver.findElements(By.xpath(ReviewsXpath));
			// List<WebElement> elementList = CBEDriver.findElements(By.className(RXP));

			for (WebElement we : elementList) {
				try {
					Thread.sleep(800);
					assertFalse(we.getText().isEmpty());
				} catch (AssertionError ae) {
					LogLog.error("Review is not present for the below Hotel");
					WebElement parent = we.findElement(By.xpath("./.."));
					String id = parent.getAttribute("id");
					String HotelName = "//*[@id='" + id + "']/td[3]";
					System.out.println(CBEDriver.findElement(By.xpath(HotelName)).getText());

					// System.out.println(we.getCssValue(propertyName));
				} catch (StaleElementReferenceException e) {

					System.out.println("Stale element error, trying ::  ");
				}

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
		WebDriverWait wait = new WebDriverWait(CBEDriver, 30);
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
		WebDriverWait wait = new WebDriverWait(CBEDriver, 30);
		List<WebElement> listings1 = CBEDriver.findElements(By.xpath(Room2Xpath));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Room2Xpath)));

		actions.moveToElement(listings1.get(randomValue1)).click().perform();

	}

	@Override
	public void VerifySuccessWithInfo() {
		String SWinfo = "//a[@id='m_c_C000_m_m_m_c_c5_SearchResultBriefSummaries_rptSearchResultBriefs_0_lnkBriefToggleMoreInformation']/span";
		CBEDriver.findElement(By.xpath(SWinfo)).click();
		String text = CBEDriver.findElement(By.xpath(
				"//div[@id='m_c_C000_m_m_m_c_c5_SearchResultBriefSummaries_rptSearchResultBriefs_0_rptSummaries_ctl01_Div1']/p"))
				.getText();
		Assert.assertTrue(text.contains("Search not possible:"));

	}

	

	@Override
	public void CancellationCondition_Within() throws InterruptedException{
		Thread.sleep(5000);
		int b=5;
				
		while(CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size()<1 && b>0) {
			int i=1;
			System.out.println("In the loop for " +i+ " time" );
			
     		String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";
    		CBEDriver.findElement(By.id(DeleteButton)).click();
       		Thread.sleep(2000);
     		 Random r1 = new Random();
    	     String AddToCartXpath1 = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[11]/div/a";
    	     List<WebElement> listing1 = CBEDriver.findElements(By.xpath(AddToCartXpath1));
    		WebDriverWait wait1 = new WebDriverWait(CBEDriver, 50);
    		int randomValue1 = r1.nextInt(listing1.size()); 
            wait1.until(ExpectedConditions.elementToBeClickable(listing1.get(randomValue1)));
         	listing1.get(randomValue1).click();
         	i++;
         	b--;
     	}
		
		if(CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size()<1) {
			LogLog.error("Couldn't find hotel withi cancellation period in 5 trials");
			CBEDriver.findElement(By.id("DeleteButton")).click();
		}
		else {
			System.out.println("Proper Hotel is selected while in loop" );
		}
	}

	@Override
	public void CancellationCondition_Outside() throws InterruptedException {
		Thread.sleep(2000);
		int b=5;
		int i=1;
		while(CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size()>0 && b>0) {
			
			System.out.println("In the loop for " +i+ " time" );
			
     		String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";
    		CBEDriver.findElement(By.id(DeleteButton)).click();
       		Thread.sleep(2000);
     		 Random r1 = new Random();
    	     String AddToCartXpath1 = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[12]/div/a";
    	     List<WebElement> listing1 = CBEDriver.findElements(By.xpath(AddToCartXpath1));
    		WebDriverWait wait1 = new WebDriverWait(CBEDriver, 50);
    		int randomValue1 = r1.nextInt(listing1.size()); 
            wait1.until(ExpectedConditions.elementToBeClickable(listing1.get(randomValue1)));
         	listing1.get(randomValue1).click();
         	i++;
         	b--;
		}
		if(CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size()>0) {
			LogLog.error("Couldn't find hotel outside cancellation period in 5 trials");
			CBEDriver.findElement(By.id("DeleteButton")).click();
		}
		else {
			System.out.println("Proper Hotel is selected in while loop" );
		}
		
		}
		
		
		
	}


