package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelCancelImpl;
import CBE.StayBeta.HotelImpl;
import CBE.StayBeta.HotelSearchImpl;
import CBE.StayBeta.RandomDataGenerationImpl;
import assertions.HotelSearchPageAssertions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

@Test
public class HotelBookingDefinitions extends TestBase {

	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel = new HotelImpl();
	HotelSearchImpl HotelSearch = new HotelSearchImpl();
	HotelSearchPageAssertions HSA = new HotelSearchPageAssertions();
	RandomDataGenerationImpl rd = new RandomDataGenerationImpl();
	HotelCancelImpl HotelCancel = new HotelCancelImpl();

	String HotelName = "";

	@And("^Expand Show Extra options$")
	public void expand_show_extra_options() throws Throwable {
		Hotel.ExpandExtraSearch();
	}

	@Then("^(.+) should be displayed in the Data source list$")
	public void should_be_displayed_in_the_data_source_list(String datasource) throws Throwable {
		HSA.DataSourceDisplayAssertion(datasource);
	}

	@And("^(.+) Should be selected by default$")
	public void should_be_selected_by_default(String datasourcevalue) throws Throwable {
		HSA.DataSourceSelectedByDefault(datasourcevalue);
	}

	@Given("^User Deselects SelectAll option$")
	public void user_deselects_selectall_option() throws Throwable {
		Thread.sleep(2000);
		Hotel.DeselectAll();
	}

	@And("^Select Particular (.+)$")
	public void select_particular(String datasource) throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectHotelDataSource(datasource);
	}

	@When("^User verify the Search Results of (.+)$")
	public void user_verify_the_search_results_of(String datasource) throws Throwable {
		Thread.sleep(2000);
		HotelSearch.VerifySearchResultsOfDS(datasource);

	}

	@Then("^Hotels Should be displayed for particular data source$")
	public void hotels_should_be_displayed_for_particular_data_source() throws Throwable {

	}

	@Given("^User is in the Hotel Search Page$")
	public void user_is_in_the_hotel_search_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Hotel");
	}

	@And("^Select a Random Hotel$")
	public void select_a_random_hotel() throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectRandomHotel();
		Thread.sleep(2000);
	}

	@And("^Verify if Quote is selected by default$")
	public void verify_if_quote_is_selected_by_default() throws Throwable {
		Thread.sleep(3000);
		Hotel.VerifyQuoteRBIsSelected();
	}

	@And("^Clicks on Add to cart on a hotel from search results$")
	public void clicks_on_add_to_cart_on_a_hotel_from_search_results() throws Throwable {
		Thread.sleep(3000);
		HotelSearch.AddRandomHotelToCartFromTSRes();
	}

	@And("^Click on Room Selection in LB$")
	public void click_on_room_selection_in_lb() throws Throwable {
		Thread.sleep(2000);
		HotelSearch.SelectRoomSelectionTabFromLB();
		Thread.sleep(2000);
	}

	@And("^Provides the (.+) Details$")
	public void provides_the_details(int guests) throws Throwable {
		Hotel.EnterGuestDetails(guests);
	}

	@Then("^Booking has been done successfully and Booking reference Text is stored in a file$")
	public void booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file() throws Throwable {
		rd.storeBookingDetails();
	}

	@And("^Click on Delete button$")
	public void click_on_delete_button() throws Throwable {
		HotelCancel.DeleteProductFromShoppingCart();
	}
	
	@Then("^Product should be deleted from cart$")
	public void product_should_be_deleted_from_cart() throws Throwable {
		Thread.sleep(2000);
		HotelCancel.ProductDeleteVerification();
	}

}