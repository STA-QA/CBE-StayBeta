package stepDefinitions;

import org.junit.runner.RunWith;

import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import CBE.StayBeta.RandomDataGenerationImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import utilities.Login;
import utilities.TestBase;

@RunWith(Cucumber.class)
public class TestCase616 extends TestBase {
	Login login = new Login();
	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel = new HotelImpl();
	RandomDataGenerationImpl rd = new RandomDataGenerationImpl();

	@Given("^User Selects any agency")
	public void User_Selects_any_agency() throws Throwable {
		Home.UserSelectsAgency();
		CBEDriver.navigate().refresh();
	}

	@And("^Search for a particular Country")
	public void Search_for_a_particular_Country() throws Throwable {
		Hotel.SearchCountry("BUE", "Buenos Aires (BUE), Argentina (AR)");
	}

	@And("^Search for a (.+) with particular (.+)$")
	public void search_for_a_with_particular(String country, String countrysearchstring) throws Throwable {
		Hotel.SearchCountry(countrysearchstring, country);
	}

	@And("^Select the (.+) and (.+)$")
	public void select_the_and(int startday, int durationofstay) throws Throwable {
		Hotel.SelectItinerary(startday, durationofstay);
	}

	@And("^Select the Duration Of Stay")
	public void Select_the_Duration_Of_Stay() throws Throwable {
		Hotel.SelectItinery(1);
	}

	@And("^Select Exclude dorm beds")
	public void Select_Exclude_dorm_beds() throws Throwable {
		Hotel.SelectExcludeDormBeds();
	}

	@And("^Select Rooms And Number of guests")
	public void Select_Rooms_And_Number_of_guests() throws Throwable {
		Hotel.SelectNumberOfRooms("0");
		Hotel.SelectNumberOfRooms("1");
		Thread.sleep(2000);
		Hotel.SelectNumberOfAdults("0", 1);
		Thread.sleep(1000);
		Hotel.SelectNumberOfAdults("1", 1);
		Thread.sleep(1000);

	}

	@And("^Select STAy Data Source")
	public void Select_STAy_Data_Source() throws Throwable {
		Hotel.ExpandExtraSearch();
		Hotel.DeselectAll();
		Hotel.SelectHotelDataSource("STAy");

	}

	@And("^Select Number of Rooms (.+)$")
	public void select_number_of_rooms(String rooms) throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectNumberOfRooms(rooms);
		Thread.sleep(2000);
	}
	

    @And("^Select Number of Adults (.+)$")
    public void select_number_of_adults(String guests) throws Throwable {
    	Thread.sleep(2000);
		Hotel.SelectNumberOfAdults(guests, 1);
		Thread.sleep(2000);
    }

    @And("^Select Number of Children (.+)$")
    public void select_number_of_children(String children) throws Throwable {
    	Thread.sleep(2000);
		Hotel.SelectNumberOfChildren(children);
		Thread.sleep(2000);
		
    }
	

	@And("^Select Hotel (.+)$")
	public void select_hotel(String datasource) throws Throwable {
		Hotel.ExpandExtraSearch();
		Thread.sleep(2000);
		Hotel.DeselectAll();
		Hotel.SelectHotelDataSource(datasource);
	}

	@And("^Click Search Button")
	public void Click_Search_Button() throws Throwable {
		Hotel.ClickSearch();
		Thread.sleep(10000);
	}

	@When("^User Searches and Selects a particular Hotel")
	public void User_Searches_and_Selects_a_particular_Hotel() throws Throwable {
		// Hotel.SearchHotel("Regr", "Regression Hotel (Alloc+Supp)");
		Hotel.CountResultsWithoutAnyParticularHotelSearch();
	}

	@When("^User Searches with a (.+)and Selects a (.+)$")
	public void user_searches_with_a_and_selects_a(String hotelsearchstring, String hotel) throws Throwable {
		Hotel.SearchHotel(hotelsearchstring, hotel);
	}

	@And("^Clicks on Add to cart$")
	public void clicks_on_add_to_cart() throws Throwable {
		Hotel.ClickAddToCart();
	}

	@And("^Clicks on Complete Booking$")
	public void clicks_on_complete_booking() throws Throwable {
		Thread.sleep(2000);
		Hotel.ClickOnCompleteBooking();
	}

	@And("^Clicks On Book Radio Button$")
	public void clicks_on_book_radio_button() throws Throwable {
		Hotel.SelectBookRB();
	}

	@And("^Provides the Person details$")
	public void provides_the_person_details() throws Throwable {
		Hotel.EnterPersonDetails();
	}

	@And("^Accepts the Terms and Conditions$")
	public void accepts_the_terms_and_conditions() throws Throwable {
		Thread.sleep(3000);
		Hotel.AcceptTermsAndConditions();
	}

	@And("^Click on Book Button$")
	public void click_on_book_button() throws Throwable {
		Thread.sleep(2000);
		Hotel.ClickOnBook();
		Thread.sleep(2000);
	}

	@Then("^Booking has been done successfully$")
	public void booking_has_been_done_successfully() throws Throwable {
		// Add the assertions for different types of texts available after booking
	}

}
