package CBE.StayBeta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseUtil;
import stayBetaInterfaces.ActAndDayTripsSearch;


public class ActAndDayTripsSearchImpl extends BaseUtil implements ActAndDayTripsSearch {

	@Override
	public void EnterStartDates(int MinStart, int MaxStart) {
		//CBEDriver.findElement(By.id("")).sendKeys("");
	//	CBEDriver.findElement(By.id("")).sendKeys("");
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, MinStart);
		String StartDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id("m_c_C000_m_m_m_c_c3_c3_uscSrchParms_datesAndLastingBetweenSelector_dttMinStartDatetbx")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);

		cal.add(Calendar.DATE, MaxStart);
		String EndDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id("m_c_C000_m_m_m_c_c3_c3_uscSrchParms_datesAndLastingBetweenSelector_dttMaxStartDatetbx")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);
				
	}

	@Override
	public void ClickOnRandomCheckAvailability() {
		//span[contains(.,'Check availability')]
		List<WebElement> AvailableOptions = CBEDriver.findElements(By.xpath("//span[contains(text(),'Check availability')]"));
		int size = AvailableOptions.size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(AvailableOptions.size());
		WebElement parent=AvailableOptions.get(randomValue).findElement(By.xpath("./../../../../.."));
		
		String id = parent.getAttribute("id");
		
		String newStr = id.substring(0, id.length()-1);	
		
		
		System.out.println("The id is : " + id);
		
		System.out.println("The new id is : " + newStr);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AvailableOptions.get(randomValue).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String Finalxpath= "//*[@id=\"" + newStr+"1_btnAdd\""+"]/div/span[1]";
		CBEDriver.findElement(By.xpath(Finalxpath)).click();
	
	}

	@Override
	public void SelectNoOfAdults() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ClickOnBookRadioButton() {
		
		CBEDriver.findElement(By.id("m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess_rptAvailableProcesses_ctl00_rbnProcess")).click();
	}

	@Override
	public void ClickOnBookButton() {
		CBEDriver.findElement(By.xpath("//span[text()='Book']")).click();
		
	}

	@Override
	public void CancellationConditionForDayTrips_Outside() throws Exception {
		Thread.sleep(2000);
		int b = 10;
		int i = 1;
		while (CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size() > 0 && b > 0) {

			System.out.println("In the loop for " + i + " time");

			String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";
			CBEDriver.findElement(By.id(DeleteButton)).click();
			Thread.sleep(2000);
			ClickOnRandomCheckAvailability();
			i++;
			b--;
		}
		if (CBEDriver
				.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
				.size() > 0) {
			LogLog.error("Couldn't find hotel outside cancellation period in 5 trials");
			CBEDriver.findElement(By.id("DeleteButton")).click();
		} else {
			System.out.println("Proper Hotel is selected in while loop");
		}

		
	}

	
	
}
