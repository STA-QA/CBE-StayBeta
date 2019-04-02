package CBE.StayBeta;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import stayBetaInterfaces.Hotel;
import utilities.TestBase;

public class HotelImpl extends TestBase implements Hotel{

	String CityTextBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx";
	String From = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx";
	String To = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckOuttbx";
	String NumberOfRooms = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRoomCount";
	String Adults = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlAdults";
	String Children = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlChildren";
	String Infants = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlInfants";
	String ShowExtraSearchOptions = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_btnSearchOptionsExpander";
	String STAyCheckBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSources_cbxDataSource500003";
	String SelectAllCheckbox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSources_cbxDataSource-1";
	String SearchButton = "m_c_C000_m_m_m_c_btnSearch";
	String ClearForm = "//span[contains(.,'Clear form')]";
	String ExcludeDormBeds = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_chkExcludeDormBeds";
	
	
	@Override
	public void SearchCountry(String SearchText,String Country) {
		
		CBEDriver.findElement(By.id(CityTextBox)).sendKeys(SearchText);
		String CXpath1 = "//span/div/div[@class='asmMenuItem' and contains(.,'";
		String CXpath2 = "')]";
		String CountryXpath = CXpath1+Country+CXpath2;
		CBEDriver.findElement(By.xpath(CountryXpath)).click();		
	}

	@Override
	public void SelectItinery(int NumberOfDays) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
        cal.add(Calendar.DATE,5);
        String StartDate = format1.format(cal.getTime());       
	            
        CBEDriver.findElement(By.id(From)).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),StartDate);         
                
        cal.add(Calendar.DATE,NumberOfDays);
	    String EndDate = format1.format(cal.getTime());
	    
        CBEDriver.findElement(By.id(To)).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),EndDate);    
        
     }

}
