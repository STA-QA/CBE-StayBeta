package CBE.StayBeta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import stayBetaInterfaces.ActAndDayTripsSearch;
import utilities.TestBase;

public class ActAndDayTripsSearchImpl extends TestBase implements ActAndDayTripsSearch {

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
		List<WebElement> AvailableOptions = CBEDriver.findElements(By.xpath("span[contains(.,'Check availability')]"));
		int size = AvailableOptions.size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(AvailableOptions.size());
		AvailableOptions.get(randomValue).click();
	}

	
	
}
