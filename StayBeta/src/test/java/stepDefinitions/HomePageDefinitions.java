package stepDefinitions;

import CBE.StayBeta.HomePageImpl;
import assertions.HomePageAssertions;
import cucumber.api.java.en.And;
import utilities.TestBase;

public class HomePageDefinitions extends TestBase {
	HomePageAssertions HomeAssert = new HomePageAssertions();
	HomePageImpl Home = new HomePageImpl();

	@And("^Click on Hotel Menu")
	public void Click_on_Hotel_Menu() throws Throwable {
		Home.ClickOnMenuItem("Hotel");
	}

	@And("^Verify Home Page Assertions$")
	public void verify_home_page_assertions() throws Throwable {
		HomeAssert.verifyCountriesSortOrder();
		HomeAssert.UserRelatedAssertions();
		HomeAssert.HomePageMainTabsAssertions();
	}
}
