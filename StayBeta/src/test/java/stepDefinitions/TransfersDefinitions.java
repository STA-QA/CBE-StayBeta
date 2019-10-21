package stepDefinitions;

import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.TransfersImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class TransfersDefinitions {
	
	HomePageImpl Home = new HomePageImpl();
	TransfersImpl Transfers = new TransfersImpl();

	@Given("^User is in the Transfers Page$")
    public void user_is_in_the_transfers_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Transfers"); 
    }
	
	@And("^Click Check availability for any Random record for Transfers$")
    public void click_check_availability_for_any_random_record_for_Transfers() throws Throwable {
        Transfers.ClickOnRandomCheckAvailability();
    }
	
	@And("^Select Number of Adult for Transfers (.+)$")
    public void select_number_of_adult_for_transfers(String adults) throws Throwable {
		Thread.sleep(1000);
		Transfers.SelectNumberOfPax(adults);
		Thread.sleep(1000);
		
 }

}