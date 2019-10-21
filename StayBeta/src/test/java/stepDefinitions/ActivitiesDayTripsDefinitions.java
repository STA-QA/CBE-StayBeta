package stepDefinitions;

import Base.BaseUtil;
import CBE.StayBeta.ActAndDayTripsSearchImpl;
import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import CBE.StayBeta.TransfersImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class ActivitiesDayTripsDefinitions extends BaseUtil {

	ActAndDayTripsSearchImpl DayTrip = new ActAndDayTripsSearchImpl();
	HomePageImpl Home = new HomePageImpl();
	TransfersImpl Transfers = new TransfersImpl();
	HotelImpl Hotel = new HotelImpl();

	@Given("^User is in the ActivitiesAndDayTrips Search Page$")
	public void user_is_in_the_activitiesanddaytrips_search_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Activities & Day Trips");
	}

	@And("^Select minimum (.+) and maximum (.+)$")
	public void select_minimum_and_maximum(int minstartdate, int maxstartdate) throws Throwable {
		Thread.sleep(2000);
		DayTrip.EnterStartDates(minstartdate, maxstartdate);

	}

	@And("^Click Check availability for any Random record$")
	public void click_check_availability_for_any_random_record() throws Throwable {
		Thread.sleep(5000);
		DayTrip.ClickOnRandomCheckAvailability();
		Thread.sleep(5000);
	}

	@And("^Add Number of Adults (.+)$")
	public void add_number_of_adults(String adults) throws Throwable {
		Transfers.SelectNumberOfPax(adults);
	}

	@And("^Add the Details Of Guests (.+)$")
	public void add_the_details_of_guests(int adults) throws Throwable {
		//int index=0;
		for(int i=0; i<adults; i++) {
		Hotel.EnterAdultDetails(i);
		}
	}
	
	 @And("^Clicks On Book Radio Button for DayTrips$")
	    public void clicks_on_book_radio_button_for_daytrips() throws Throwable {
		 Thread.sleep(2000);
	        DayTrip.ClickOnBookRadioButton();
	        Thread.sleep(2000);
	    }
	 
	 @And("^Click On Book Button$")
	    public void click_on_book_button() throws Throwable {
	        DayTrip.ClickOnBookButton();
	    }

}
