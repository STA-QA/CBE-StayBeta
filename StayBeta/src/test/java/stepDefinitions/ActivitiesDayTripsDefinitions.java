package stepDefinitions;

import CBE.StayBeta.ActAndDayTripsSearchImpl;
import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utilities.TestBase;

public class ActivitiesDayTripsDefinitions extends TestBase {
	
	ActAndDayTripsSearchImpl DayTrip = new ActAndDayTripsSearchImpl();
	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel=new HotelImpl();
	
	
	@Given("^User is in the ActivitiesAndDayTrips Search Page$")
    public void user_is_in_the_activitiesanddaytrips_search_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Activities & Day Trips"); 
    }
	
	@And("^Select minimum (.+) and maximum (.+)$")
    public void select_minimum_and_maximum(int minstartdate, int maxstartdate) throws Throwable {
		Thread.sleep(2000);
        DayTrip.EnterStartDates(minstartdate, maxstartdate);
        Hotel.ExpandExtraSearch();
		Thread.sleep(2000);
		Hotel.DeselectAll();
		Hotel.SelectHotelDataSource("Viator");
        
    }
	
	@And("^Click Check availability for any Random record$")
    public void click_check_availability_for_any_random_record() throws Throwable {
		Thread.sleep(5000);
        DayTrip.ClickOnRandomCheckAvailability();
    }
	
}
