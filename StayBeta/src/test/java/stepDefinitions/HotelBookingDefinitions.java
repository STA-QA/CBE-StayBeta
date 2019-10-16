package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseUtil;
import CBE.StayBeta.RandomDataGenerationImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.Hotel;

@Test
public class HotelBookingDefinitions extends BaseUtil {

	// HomePageImpl Home = new HomePageImpl();
	// HotelImpl Hotel = new HotelImpl();
	// HotelSearchImpl HotelSearch = new HotelSearchImpl();
	// HotelSearchPageAssertions HSA = new HotelSearchPageAssertions();
	RandomDataGenerationImpl rd = new RandomDataGenerationImpl();
	// HotelCancelImpl HotelCancel = new HotelCancelImpl();
	HomePage Home = new HomePage(driver);
	Hotel Hotel = new Hotel(driver);

	String HotelName = "";

	@And("^Expand Show Extra options$")
	public void expand_show_extra_options() throws Throwable {
		Hotel.ExpandExtraSearch();
	}

	@Then("^(.+) should be displayed in the Data source list$")
	public void should_be_displayed_in_the_data_source_list(String datasource) throws Throwable {
		Hotel.DataSourceDisplayAssertion(datasource);
	}

	@And("^(.+) Should be selected by default$")
	public void should_be_selected_by_default(String datasourcevalue) throws Throwable {
		Hotel.DataSourceSelectedByDefault(datasourcevalue);
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
		Hotel.VerifySearchResultsOfDS(datasource);

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
		Hotel.AddRandomHotelToCartFromTSRes();
	}

	@And("^Check for Cancellation Condition (.+)$")
	public void check_for_cancellation_condition(String condition) throws Throwable {
		if (condition.equalsIgnoreCase("Outside")) {
			if (driver
					.findElements(
							By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
					.size() > 0) {
				Hotel.CancellationCondition_Outside();
			} else {
				System.out.println("Proper Hotel is selected in first go");
			}
		}

		if (condition.equalsIgnoreCase("Inside")) {
			if (driver
					.findElements(
							By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
					.size() < 1) {
				Hotel.CancellationCondition_Within();
			} else {
				System.out.println("Proper Hotel is selected in first go");
			}
		}

		if (condition.equalsIgnoreCase("Ignore")) {

		}

	}

	@And("^Click on Room Selection in LB$")
	public void click_on_room_selection_in_lb() throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectRoomSelectionTabFromLB();
		Thread.sleep(2000);
	}

	@And("^Provides the (.+) and (.+) Details$")
	public void provides_the_and_details(int guests, int children) throws Throwable {
		int total = guests + children;
		Hotel.EnterGuestDetails(total);

	}

	@Then("^Booking has been done successfully and Booking reference Text is stored in a file$")
	public void booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file() throws Throwable {
		rd.storeBookingDetails();
	}

	@And("^Click on Delete button$")
	public void click_on_delete_button() throws Throwable {
		Thread.sleep(2000);
		Hotel.DeleteProductFromShoppingCart();
	}

	@Then("^Product should be deleted from cart$")
	public void product_should_be_deleted_from_cart() throws Throwable {
		Thread.sleep(2000);
		Hotel.ProductDeleteVerification();
	}

	@And("^User enters (.+) with startdate (.+)$")
	public void User_enters_country(String country, String numdays) throws Throwable {
		Thread.sleep(2000);
		Hotel.selectCountry(country);
		Thread.sleep(2000);
		int nu = Integer.parseInt(numdays);
		Hotel.selectdays(nu);
	}

	@Then("^User add rooms to cart$")
	public void User_add_rooms_to_cart() throws InterruptedException {
		Hotel.addToCart_RebundableHotelRooms();
	}

	@And("^User clicks (.+) radio button$")

	public void User_clicks_radio_button(String process) throws InterruptedException, IOException {

		if (process.equalsIgnoreCase("Book")) {
			Hotel.bookprocessbooking();
		} else {
			Hotel.quotebooking();
		}

	}

	@Then("^User enters Adult details for(.+)$")
	public void User_enters_Adult_details_for_Guests(String Guests) throws InterruptedException, IOException {
		// int tottalguest = Integer.parseInt(Guests);
		Hotel.adultDetails(Guests);
	}

	@And("^User enters DOB details for (.+) and (.+)$")
	public void User_enters_DOB_details_for(String Guests, String Children) throws Throwable {

		String numberofguest = Guests.replaceAll("\\s+", "");

		String text = numberofguest.replaceAll("\\uFEFF", "");

		int tottalguest = Integer.parseInt(text);

		String Titledropdown = "//select[@id='m_c_C000_m_c_paxItmsUsc_bclPax_";
		String FirtsNamedropdown = "//div/input[@id='m_c_C000_m_c_paxItmsUsc_bclPax_";
		String LastNamedropdown = "//div/input[@id='m_c_C000_m_c_paxItmsUsc_bclPax_";
		String Day = "//div/select[@id='m_c_C000_m_c_paxItmsUsc_bclPax_";
		String month = "//div/select[@id='m_c_C000_m_c_paxItmsUsc_bclPax_";
		String year = "//div/select[@id='m_c_C000_m_c_paxItmsUsc_bclPax_";

		// int childcount = Integer.parseInt(Children);
		String numberofchildguest = Children.replaceAll("\\s+", "");

		String text1 = numberofchildguest.replaceAll("\\uFEFF", "");

		int tottalnumberchildren = Integer.parseInt(text1);

		int children = tottalguest + tottalnumberchildren;

		//2+2

		for (int i = tottalguest; i < children; i++) {
			// Enter Title
			String titledropdown = Titledropdown + i + "_paxItmUsc_namePrefixDdl']";
			System.out.println(titledropdown);
			WebElement FinalTitledropdown = driver.findElement(By.xpath(titledropdown));
			Hotel.Dropdown(FinalTitledropdown, "Mr");

			// Enter First Name
			String Firtsname = FirtsNamedropdown + i + "_paxItmUsc_givenNameTbx']";
			WebElement Finalfirstname = driver.findElement(By.xpath(Firtsname));
			Finalfirstname.sendKeys("Test Booking");

			// Enter Last Name
			String Lastname = LastNamedropdown + i + "_paxItmUsc_surnameTbx']";
			WebElement Finallastname = driver.findElement(By.xpath(Lastname));
			Finallastname.sendKeys("Test Booking");

			// Enter DOB
			String DobDay = Day + i + "_paxItmUsc_birthDateBdbdays']";
			WebElement FinalDobday = driver.findElement(By.xpath(DobDay));
			Hotel.Dropdown(FinalDobday, "14");

			String DobMonth = month + i + "_paxItmUsc_birthDateBdbmonths']";
			WebElement FinalDobMonth = driver.findElement(By.xpath(DobMonth));
			Hotel.Dropdown(FinalDobMonth, "Apr");

			String Dobyear = year + i + "_paxItmUsc_birthDateBdbyears']";
			WebElement FinalDobyear = driver.findElement(By.xpath(Dobyear));
			Hotel.Dropdown(FinalDobyear, "2013");
		}

		System.out.println("Child Details added to the Form");

	}
}