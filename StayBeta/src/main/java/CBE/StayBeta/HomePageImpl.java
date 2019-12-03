package CBE.StayBeta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseUtil;
import stayBetaInterfaces.HomePage;


public class HomePageImpl extends BaseUtil implements HomePage {

	String menu1 = "//span[contains(.,'";
	String menu2 = "')]";
	String Agency = "//td[2]/a/span";
	String CityTextBox= "m_c_C004_m_c_ctl02_HotelQuickSearchParams_astLocation_astLocationtbx";
	String From = "m_c_C004_m_c_ctl02_HotelQuickSearchParams_dateAndDurationSelector_dtbCheckIntbx";
	String To = "m_c_C004_m_c_ctl02_HotelQuickSearchParams_dateAndDurationSelector_dtbCheckOuttbx";

	@Override
	public void ClickOnMenuItem(String Option) {
		String MenuXpath = menu1 + Option + menu2;
		CBEDriver.findElement(By.xpath(MenuXpath)).click();
	}

	@Override
	public void UserSelectsAgency() {
		CBEDriver.findElement(By.xpath(Agency)).click();
	}

	@Override
	public void ClickOnHome() {
		CBEDriver.findElement(By.linkText("Home"));		
	}

	@Override
	public void SearchCountry(String SearchText, String Country) {
		//*[@id="m_c_C004_m_c_ctl02_HotelQuickSearchParams_astLocation_astLocationasm"]
		CBEDriver.findElement(By.id(CityTextBox)).sendKeys(SearchText);
		try {
		String CXpath1 = "//*/div[contains(@id,'m_c_C004_m_c_ctl02_HotelQuickSearchParams_astLocation_astLocationasm')]/div[contains(.,'";
		String CXpath2 = "')]";
		String CountryXpath = CXpath1 + Country + CXpath2;
		CBEDriver.findElement(By.xpath(CountryXpath)).click();
		}
		catch(Exception e) {
			
		}
		
	}

	@Override
	public void SelectItinery(int NumberOfDays) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelectItinerary(int StartDay, int NumberOfDays) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, StartDay);
		String StartDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);

		cal.add(Calendar.DATE, NumberOfDays);
		String EndDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id(To)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);
		
	}

	@Override
	public void SelectExcludeDormBeds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SelectNumberOfRooms(String NoOfRooms) {
		// TODO Auto-generated method stub
		String a = "//select[@id='m_c_C004_m_c_ctl02_HotelQuickSearchParams_dtsRoomCount_ddlRoomCount']/option[";
		String b = "]";
		String finalpath = a + NoOfRooms + b;

		CBEDriver.findElement(By.xpath(finalpath)).click();
		
	}

	@Override
	public void SelectNumberOfAdults(String NoOfAdults, int RoomNumber) throws InterruptedException {
		String AdultId1="m_c_C004_m_c_ctl02_HotelQuickSearchParams_bclRooms_";
		String AdultId2="_uscPassengers_ddlAdults";
		String NoOfAdultsId = AdultId1 + RoomNumber + AdultId2;
		Select dropdown = new Select(CBEDriver.findElement(By.id(NoOfAdultsId)));
		dropdown.selectByValue(NoOfAdults);
		
	}

	@Override
	public void SelectNumberOfChildren(String NoOfChildren, int RoomNumber) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Room number is : "+RoomNumber);
		String ChildId1="m_c_C004_m_c_ctl02_HotelQuickSearchParams_bclRooms_";
		String ChildId2="_uscPassengers_ddlChildren";
		//RoomNumber=RoomNumber-1;
		String NoOfChildsId = ChildId1 + RoomNumber+ ChildId2;
		WebDriverWait wait = new WebDriverWait(CBEDriver, 10);
		WebElement element = CBEDriver.findElement(By.id(NoOfChildsId));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select dropdown = new Select(element);
		dropdown.selectByValue(NoOfChildren);
	}

	@Override
	public void EnterChildrenAge(int age, int box) {
		// TODO Auto-generated method stub
		List<WebElement> options = CBEDriver.findElements(By.xpath("//*[contains(@id,'_txtAge')]"));
		options.get(box).sendKeys(Integer.toString(age));
		
	}

	@Override
	public void ClickSearch() {
		CBEDriver.findElement(By.xpath("//span[contains(.,'Search')]")).click();
		
	}
}
