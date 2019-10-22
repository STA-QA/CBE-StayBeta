package stepDefinitions;

import java.util.List;

import Base.BaseUtil;
import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.InsuranceImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class InsuranceDefinitions extends  BaseUtil{
	HomePageImpl Home = new HomePageImpl();
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
	
	@And("^Enter the Date Of Birth for Insurance (.+) for (.+)$")
    public void enter_the_date_of_birth_for_insurance_for(List<Integer> age, int passengers) throws Throwable {
    //  int  index=0;
      for(int i=0; i<passengers; i++) {
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

	 
}
