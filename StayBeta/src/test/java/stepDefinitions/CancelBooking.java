package stepDefinitions;

import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelCancelImpl;
import CBE.StayBeta.HotelImpl;
import assertions.HotelAmendmentPageAssertions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Login;

public class CancelBooking {

	Login login = new Login();
	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel = new HotelImpl();
	HotelAmendmentPageAssertions AmendAssert = new HotelAmendmentPageAssertions();
	HotelCancelImpl HotelCancel = new HotelCancelImpl();

	@Given("^User Clicks on My Bookings$")
	public void user_clicks_on_my_bookings() throws Throwable {
		Thread.sleep(2000);
		Hotel.ClickMyBookings();
	}



	@And("^Clicks on Search Booking$")
	public void clicks_on_search_booking() throws Throwable {
		Hotel.SelectBookingSearch();
	}

	@And("^Enters the search parameter$")
	public void enters_the_search_parameter() throws Throwable {
		Hotel.EnterBookingSearchCriteria();
		Hotel.ClickBookingSearch();
	}

	@And("^Selects the Related Booking$")
	public void selects_the_related_booking() throws Throwable {
		Hotel.SelectBookingFromList();
	}

	@And("^Click on Continue Booking In Search$")
	public void click_on_continue_booking_in_search() throws Throwable {
		Thread.sleep(1000);
		Hotel.ClickOnAmendCompleteBooking();
		Thread.sleep(1000);
	}

	@And("^Select Amend this item Option$")
	public void select_amend_this_item_option() throws Throwable {
		Thread.sleep(1000);
		Hotel.SelectAmendThisItem();
		Thread.sleep(2000);
		Hotel.AcceptThePopup();
		AmendAssert.VerifyDisabledAssertions();
	}

	@And("^User selects cancel item$")
	public void user_selects_cancel_item() throws Throwable {
		Thread.sleep(2000);
		Hotel.ClickOnCancelItem();
		Thread.sleep(3000);
	}

	@And("^Click on Update button$")
	public void click_on_update_button() throws Throwable {
		Thread.sleep(1000);
		Hotel.ClickUpdateButton();


	}

	 @Then("^Get updated Booking Details$")
	    public void get_updated_booking_details() throws Throwable {
	        Hotel.getAmendedRefnumber();
	    }

	@And("^Clicks on Retrieve latest booking$")
	public void clicks_on_retrieve_latest_booking() throws Throwable {
		HotelCancel.ClickRetrieveLatestBooking();
		Hotel.AcceptThePopup();
	}





	@And("^Fetch the From date and move it few days further$")
	public void fetch_the_from_date_and_move_it_few_days_further() throws Throwable {
		Thread.sleep(4000);
		HotelCancel.ChangeFromDateForHotelAmend();
		Thread.sleep(2000);
	}


	@And("^Fetch the From date and Reduce by (.+) Nights$")
    public void fetch_the_from_date_and_reduce_by_nights(int noofnights) throws Throwable {
		Thread.sleep(4000);
		HotelCancel.ReduceFromDateForHotelAmend(noofnights);
		Thread.sleep(2000);
    }


	@And("^Click on Add to Cart$")
	public void click_on_add_to_cart() throws Throwable {
		Thread.sleep(2000);
		HotelCancel.AddToCartInAmend();
		Thread.sleep(2000);
	}

	@Then("^Booking is Cancelled$")
	public void booking_is_cancelled() throws Throwable {
		Thread.sleep(3000);
		HotelCancel.VerifyBookingCancellation();
	}

	@And("^Get the Cancellation Conditions from Shopping Cart Page$")
	public void get_the_cancellation_conditions_from_shopping_cart_page() throws Throwable {
		Thread.sleep(3000);
		HotelCancel.ClickOnCancellationConditionsLink();
		HotelCancel.GetTheCancellationChargesDetails();
	}

}
