package assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseUtil;


public class HomePageAssertions extends BaseUtil {

	String LogoutId = "m_cphHeader_T_CustToolbar_cbeNav_liLogOut";
	String HomeTabLT = "Home";
	String DestinationsTabLT = "Destinations";
	String AboutUsTabLT = "AboutUs";
	String OffersTabLT = "Offers";
	String LoggedUserDetailsId = "m_cphHeader_T_CustToolbar_cbeNav_liLoggedInAs";
	String LocationsList = "//div[@id='m_c_C003_LocationsList']/div/ul";

	public void UserRelatedAssertions() {
		try {
			Assert.assertTrue(CBEDriver.findElement(By.id(LogoutId)).isDisplayed(), "Verifying Logout link Presence");
			Assert.assertTrue(CBEDriver.findElement(By.id(LoggedUserDetailsId)).isDisplayed(),
					"Verifying User details Presence");
		} catch (AssertionError e) {
			LogLog.error("Assertions in Home Page Failed " + e);
		} catch (Throwable t) {
			LogLog.error("Assertions in Home Page Failed " + t);
		}
	}

	public void HomePageMainTabsAssertions() {
		try {

			Assert.assertTrue(CBEDriver.findElement(By.linkText(HomeTabLT)).isDisplayed(),
					"Verifying Home tab Presence");
			Assert.assertTrue(CBEDriver.findElement(By.linkText(DestinationsTabLT)).isDisplayed(),
					"Verifying Destination tab Presence");
			Assert.assertTrue(CBEDriver.findElement(By.linkText(AboutUsTabLT)).isDisplayed(),
					"Verifying AboutUs tab Presence");
			Assert.assertTrue(CBEDriver.findElement(By.linkText(OffersTabLT)).isDisplayed(),
					"Verifying Offers tab Presence");
		} catch (AssertionError e) {
			LogLog.error("Assertions in Home Page Failed " + e);
		} catch (Throwable t) {
			LogLog.error("Assertions in Home Page Failed " + t);
		}
	}
	
	public void verifyCountriesSortOrder() {
		ArrayList<String> obtainedList = new ArrayList<>(); 
		List<WebElement> elementList= CBEDriver.findElements(By.xpath(LocationsList));
		for(WebElement we:elementList){
		   obtainedList.add(we.getText());
		   System.out.println(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<>();   
		for(String s:obtainedList){
		sortedList.add(s);
		}
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
	}	

}
