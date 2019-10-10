package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;
import pages.Hotel;
import pages.Trips;


public class ActivitiesDayTripsDefinitions extends BaseUtil {

	Trips DayTrip = new Trips(driver);
	HomePage Home = new HomePage(driver);
	Hotel Hotel = new Hotel(driver);


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
