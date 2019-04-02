package CBE.StayBeta;

import org.openqa.selenium.By;

import stayBetaInterfaces.HomePage;
import utilities.TestBase;

public class HomePageImpl extends TestBase implements HomePage {

	String Hotel = "//span[contains(.,'Hotel')]";
	String menu1 ="//span[contains(.,'";
	String menu2 ="')]";
	String Agency = "//td[2]/a/span";
	
	@Override
	public void SearchForHotel() {
	    CBEDriver.findElement(By.xpath(Hotel)).click();	
	}

	@Override
	public void ClickOnMenuItem(String Option) {
		String MenuXpath = menu1+Option+menu2;
		CBEDriver.findElement(By.xpath(MenuXpath)).click();		
	}

	@Override
	public void UserSelectsAgency() {
		CBEDriver.findElement(By.xpath(Agency)).click();		
	}

	

}
