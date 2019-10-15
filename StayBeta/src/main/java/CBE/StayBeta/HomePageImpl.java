package CBE.StayBeta;

import org.openqa.selenium.By;

import Base.BaseUtil;
import stayBetaInterfaces.HomePage;


public class HomePageImpl extends BaseUtil implements HomePage {

	String menu1 = "//span[contains(.,'";
	String menu2 = "')]";
	String Agency = "//td[2]/a/span";

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
}
