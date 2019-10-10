package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.Hotel;


public class HotelSearchDefinitions extends BaseUtil {

	//HotelSearchImpl HotelSearch = new HotelSearchImpl();
	//HotelSearchPageAssertions SearchAssert = new HotelSearchPageAssertions();

	Hotel Hotel = new Hotel(driver);


	@Then("^Verify if Reviews are present for each hotel$")
	public void verify_if_reviews_are_present_for_each_hotel() throws Throwable {
		Thread.sleep(2000);
		Hotel.VerifyReviewsForHotel();
	}

	@And("^Verify if Ratings are present for each hotel$")
	public void verify_if_ratings_are_present_for_each_hotel() throws Throwable {

	}

	@And("^Select a Random room and add to cart$")
	public void select_a_random_room_and_add_to_cart() throws Throwable {
		Hotel.SelectRoomFromSelectionInLB();
		Thread.sleep(2000);
		Hotel.AddToCartFromLBWithoutSwitchingFrame();
	}

	@And("^Select multiple rooms with same room type and add to cart$")
	public void select_multiple_rooms_with_same_room_type_and_add_to_cart() throws Throwable {
		Hotel.SelectSameTypeRoomsFromListsInLB(2);
		Thread.sleep(2000);
		Hotel.AddToCartFromLBWithoutSwitchingFrame();
	}

	@And("^Select multiple rooms with different room type and add to cart$")
	public void select_multiple_rooms_with_different_room_type_and_add_to_cart() throws Throwable {
		Hotel.SelectSameTypeRoomsFromListsInLB(2);
		Thread.sleep(2000);
		Hotel.AddToCartFromLBWithoutSwitchingFrame();
	}

	@And("^Expand room list of any hotel$")
	public void expand_room_list_of_any_hotel() throws Throwable {
		Thread.sleep(2000);
		Hotel.ExpandRandomHotelRoomtypeOptionsInTable();

	}

	@And("^Select a room from the list and add to cart$")
	public void select_a_room_from_the_list_and_add_to_cart() throws Throwable {
		Hotel.SelectARoomFromListInSearchResults();
		Thread.sleep(2000);
		Hotel.ClickAddSelectionToCart();
	}

	@And("^Select multiple rooms with same room type from the list and add to cart$")
	public void select_multiple_rooms_with_same_room_type_from_the_list_and_add_to_cart() throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectMultipleRoomsSameTypeFromListInSearchResults();
		Thread.sleep(2000);
		Hotel.ClickAddSelectionToCart();
	}

	@And("^Select multiple rooms with different room type from the list and add to cart$")
	public void select_multiple_rooms_with_different_room_type_from_the_list_and_add_to_cart() throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectMultipleRoomsDifferentTypeFromListInSearchResults();
		Thread.sleep(2000);
		Hotel.ClickAddSelectionToCart();
	}

	@And("^Verify the Extra Search Options$")
    public void verify_the_extra_search_options() throws Throwable {
		Hotel.ExtraSearchOptionsAssertions();
    }

	 @Then("^Verify the SuccessWithInfo Message$")
	    public void verify_the_successwithinfo_message() throws Throwable {
	       Thread.sleep(3000);
	       Hotel.VerifySuccessWithInfo();
	    }


}
