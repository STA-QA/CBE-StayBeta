package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import pages.HomePage;

public class HomePageDefinitions extends BaseUtil {
	//HomePageAssertions HomeAssert = new HomePageAssertions();
	HomePage Home = new HomePage(driver);

	@And("^Click on Hotel Menu")
	public void Click_on_Hotel_Menu() throws Throwable {
		Home.ClickOnMenuItem("Hotel");
	}

	@And("^Verify Home Page Assertions$")
	public void verify_home_page_assertions() throws Throwable {
		Home.verifyCountriesSortOrder();
		Home.UserRelatedAssertions();
		Home.HomePageMainTabsAssertions();
	}
}
