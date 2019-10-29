package CBE.StayBeta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Base.BaseUtil;

public class TransfersImpl extends BaseUtil {

	String AdultT1 = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSelectedPassengers_ddlAdults";

	public void EnterStartDates(int minStartDate, int maxStartDate) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, minStartDate);
		String StartDate = format1.format(cal.getTime());

		CBEDriver
				.findElement(
						By.id("m_c_C000_m_m_m_c_c3_c3_uscSrchParms_datesAndLastingBetweenSelector_dttMinStartDatetbx"))
				.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);
	}

	public void ClickOnRandomCheckAvailability() {
		// span[contains(.,'Check availability')]
		List<WebElement> AvailableOptions = CBEDriver
				.findElements(By.xpath("//span[contains(text(),'Check availability')]"));
		int size = AvailableOptions.size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(AvailableOptions.size());
		WebElement parent = AvailableOptions.get(randomValue).findElement(By.xpath("./../../../../.."));

		String id = parent.getAttribute("id");

		String newStr = id.substring(0, id.length() - 1);

		System.out.println("The id is : " + id);

		System.out.println("The new id is : " + newStr);

		AvailableOptions.get(randomValue).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String Finalxpath = "//*[@id=\"" + newStr + "1_btnAdd\"" + "]/div/span[1]";
		CBEDriver.findElement(By.xpath(Finalxpath)).click();

	}

	public void SelectNumberOfPax(String NoOfAdults) throws InterruptedException {
		String NoOfAdultsId = AdultT1;
		CBEDriver.findElement(By.id(NoOfAdultsId)).sendKeys("0");
		Thread.sleep(2000);
		CBEDriver.findElement(By.id(NoOfAdultsId)).sendKeys(NoOfAdults);
	}
	
	public void AddAdditionalDetails() throws InterruptedException{
		
		List<WebElement> elementList = CBEDriver.findElements(By.xpath("//*[contains(@id,'m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_ctlFolSt_uscExpDet_bntDet_0_oth_vU_bo_')]"));
		

		for (WebElement we : elementList) {
			we.sendKeys("Test Automation");
		}
		CBEDriver.findElement(By.id("m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_ctlFolSt_uscExpDet_bntDet_0_oth_uscDateDuration_dttStartDatettbtextbox")).sendKeys("1200");
		
		CBEDriver.findElement(By.id("m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_saveBtn")).click();
		
	}
	
	public void ClickBookRB() {
		CBEDriver.findElement(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess_rptAvailableProcesses_ctl00_rbnProcess")).click();
	}
}
