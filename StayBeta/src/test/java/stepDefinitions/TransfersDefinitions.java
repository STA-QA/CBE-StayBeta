package stepDefinitions;

import CBE.StayBeta.HomePageImpl;
import cucumber.api.java.en.Given;

public class TransfersDefinitions {
	
	HomePageImpl Home = new HomePageImpl();

	@Given("^User is in the Transfers Page$")
    public void user_is_in_the_transfers_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Activities & Day Trips"); 
    }
	
}
