package assertions;



import org.apache.log4j.helpers.LogLog;

import org.openqa.selenium.By;
//import org.seleniumhq.jetty9.util.log.Log;
import org.testng.asserts.Assertion;

import Base.BaseUtil;


public class HotelAmendmentPageAssertions extends BaseUtil{
	
	String SelectAllCheckBox = "";
	String Location = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx";
	String FromDateTB = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx";
	String NightsTB = "";
	String ToTB = "";
	String MinStarRating = "";
	String ExcludeDormBeds = "";
	String NumberOfRooms = "";
	String Adults = "";
	String Children = "";
	String Infants = "";
	String HotelName = "";
	String RateCode = "";
	String IncludeOnReqRooms = "";
	String BrochureCode = "";
	String ProductNumber = "";
	String MinRoomPrice = "";
	String MaxRoomPrice = "";
	String Style = "";
	
	
	public void VerifyDisabledAssertions() {
		
		Boolean a = CBEDriver.findElement(By.id(Location)).isEnabled();
		if (a == false) {
			//System.out.println("Location Change is disabled");
			//softAssert.assertTrue(CBEDriver.findElement(By.id("Just Testing")).isDisplayed());	
			try {
				CBEDriver.findElement(By.id("tst")).isEnabled();
				System.out.println("Errortry");
			} catch (Exception e) {
								
				System.out.println("ErrorCatch");	
				LogLog.error("Assertion Failed");
	
	
			}
			
		
					
		} else {
			System.out.println("Location Change is Enabled");
			//CBEDriver.findElement(By.id("SampleID")).isDisplayed();
		}

	}

}
