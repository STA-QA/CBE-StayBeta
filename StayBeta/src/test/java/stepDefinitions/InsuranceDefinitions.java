package stepDefinitions;

import java.util.List;

import Base.BaseUtil;
import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import CBE.StayBeta.InsuranceImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class InsuranceDefinitions extends BaseUtil {
	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel = new HotelImpl();
	InsuranceImpl Insurance = new InsuranceImpl(CBEDriver);

	@Given("^User is in the Insurance Page$")
	public void user_is_in_the_insurance_page() throws Throwable {
		Home.ClickOnHome();
		Home.ClickOnMenuItem("Insurance");
	}

	@And("^Selects the Region$")
	public void selects_the_region() throws Throwable {
		Insurance.SelectRegion("Worldwide excl USA");
	}

	@And("^Enter Number Of (.+) for Insurance$")
	public void enter_number_of_for_insurance(String passengers) throws Throwable {
		Insurance.selectNumberOfPassengers(passengers);
		Thread.sleep(5000);
	}

	@And("^From Date and To Date for Insurance (.+) and (.+)$")
	public void from_date_and_to_date_for_insurance_and(int startday, int NoOfDays) throws Throwable {
		Insurance.SelectTheDates(startday, NoOfDays);
	}

	@And("^Enter the Date Of Birth for Insurance (.+) for (.+)$")
	public void enter_the_date_of_birth_for_insurance_for(List<Integer> age, int passengers) throws Throwable {

		for (int i = 0; i < passengers; i++) {
			Insurance.selectTheDOB(i, age.get(i));
		}
	}

	@And("^Select the Insurance Type (.+)$")
	public void select_the_insurance_type(String insurancetype) throws Throwable {
		Insurance.SelectInsuranceType(insurancetype);
	}

	@And("^Enter the Date Of Birth for Insurance$")
	public void enter_the_date_of_birth_for_insurance() throws Throwable {
		Insurance.selectTheDOB();

	}

	@And("^Click On Insurance Search$")
	public void click_on_insurance_search() throws Throwable {
		Insurance.ClickInsuranceSearch();
		Thread.sleep(5000);
	}

	@And("^Select Any Random Insurance and Add to cart$")
	public void select_any_random_insurance_and_add_to_cart() throws Throwable {
		Insurance.AddInsuranceToCart();
	}

	@And("^Click On Complete Booking For Insurance$")
	public void click_on_complete_booking_for_insurance() throws Throwable {
		Insurance.CompleteInsuranceBooking();
	}

	@And("^Select Book Radio Button for Insurance$")
	public void select_book_radio_button_for_insurance() throws Throwable {
		Insurance.SelectBookRB();
	}

	@And("^Adds the Passenger (.+) Details for Insurance with their (.+)$")
	public void adds_the_passenger_details_for_insurance_with_their(int passengers, List<Integer> age)
			throws Throwable {
		Thread.sleep(2000);
		for (int i = 0; i < passengers; i++) {
			Hotel.EnterChildrenDetails(i, age.get(i));
		}
	}

	@And("^Click On Insurance Details$")
	public void click_on_insurance_details() throws Throwable {
		Thread.sleep(5000);
		Insurance.ClickOnDetailIcon();
	}

	@And("^Add additional Details for Insurance$")
	public void add_additional_details_for_insurance() throws Throwable {
		Insurance.AddAdditionalDetailsForInsurance();
	}

}
