package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class TransfersDefinitions extends BaseUtil {

	HomePage Home = new HomePage(driver);

	//HomePageImpl Home = new HomePageImpl();

	@Given("^User is in the Transfers Page$")
    public void user_is_in_the_transfers_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Activities & Day Trips");
    }

}
