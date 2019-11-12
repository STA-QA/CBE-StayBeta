package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vimalselvam.cucumber.listener.Reporter;

import Base.BaseUtil;
import Base.funtions;
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


@Test
public class HotelBookingDefinitions extends BaseUtil {

	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel = new HotelImpl();
	HotelSearchImpl HotelSearch = new HotelSearchImpl();
	HotelSearchPageAssertions HSA = new HotelSearchPageAssertions();
	RandomDataGenerationImpl rd = new RandomDataGenerationImpl();
	HotelCancelImpl HotelCancel = new HotelCancelImpl();
    funtions commonfunctions=new funtions();
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
	@And("^Clicks on Add to cart on a hotel from search results for Expedia$")
	public void And_Clicks_on_Add_to_cart_on_a_hotel_from_search_results_for_Expedia() throws InterruptedException {


		Hotel.addToCart_RefundableHotelRooms();
	}


	@And("^User clicks (.+) radio button$")

	public void User_clicks_radio_button(String process) throws InterruptedException, IOException {

		if (process.equalsIgnoreCase("Book")) {
			Hotel.bookprocessbooking();
		} else if(process.equalsIgnoreCase("Quote")) {
			Hotel.quotebooking();
		}

		else {
			Reporter.addStepLog("This Test is executed :-  Search criteria for performance benchmarks only - Search only - no Booking");
		}

	}

	@Then("^User confirms Booking$")
	public void User_confirms_Booking() throws InterruptedException, IOException {
		Hotel.confirmBooking();
	}

	@And("^Check for Cancellation Condition (.+)$")
	public void check_for_cancellation_condition(String condition) throws Throwable {
		if (condition.equalsIgnoreCase("Outside")) {
			if(CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size()>0) {
			HotelSearch.CancellationCondition_Outside();
			}
			else {
				System.out.println("Proper Hotel is selected in first go" );
			}
		}

		if (condition.equalsIgnoreCase("Inside")) {
			if(CBEDriver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning")).size()<1) {
			HotelSearch.CancellationCondition_Within();
			}
			else {
				System.out.println("Proper Hotel is selected in first go" );
			}
		}

		if (condition.equalsIgnoreCase("Ignore")) {

		}

	}	

	@And("^Add the screenshot of the Hotel Cancellation Conditions to Report$")
	public void add_the_screenshot_of_the_hotel_cancellation_conditions_to_report()throws Throwable {
	CBEDriver.findElement(By.xpath("//a[@title='View product details']")).click();
	Thread.sleep(4000);
	CBEDriver.switchTo().frame(0);
	Thread.sleep(8000);
	CBEDriver.findElement(By.xpath("//*/span[contains(.,'Cancellations')]")).click();
	String screenShotPath = commonfunctions.screenshot(CBEDriver, System.currentTimeMillis());
	Reporter.addScreenCaptureFromPath(screenShotPath);
	CBEDriver.findElement(By.xpath("//a[@class='close']/i")).click();
	Thread.sleep(3000);

	}
	
	@And("^Click on Room Selection in LB$")
	public void click_on_room_selection_in_lb() throws Throwable {
		Thread.sleep(2000);
		HotelSearch.SelectRoomSelectionTabFromLB();
		Thread.sleep(2000);
	}

	@And("^Provides the (.+) and (.+) Details$")
	public void provides_the_and_details(int guests, int children) throws Throwable {
		int total = guests + children;
		Hotel.EnterGuestDetails(total);
	}

	@And("^Provides the Adults (.+) Details and (.+) details with (.+)$")
    public void provides_the_adults_details_and_details_with(List<Integer> adults, List<Integer> children, List<Integer> childrenage) throws Throwable {

		int index=0;
		int childageindex=0;
		int TotalChildren=0;
		for(int j=0; j<childrenage.size();j++)
		{
			 TotalChildren+=childrenage.get(j);
		}

        for(int top= 0; top<adults.size(); top++) {
     	   int k = adults.get(top);

     		for(int a=0; a<k ;a++){
     			 Hotel.EnterAdultDetails(index);
     			index=index+1;
     		}
     		if(TotalChildren>0) {
     			 int l = children.get(top);
     		for(int j=0; j<l ;j++){
     			System.out.println("j is :" +j);
     			Hotel.EnterChildrenDetails(index, childrenage.get(childageindex));
     			childageindex = childageindex+1;
     			index=index+1;
     		}
     		}
          }


    }





	@And("^Provied Amended Adults (.+) Details and (.+) details with (.+)")
    public void provides_Amended_adults_details_and_details_with(List<Integer> adults, List<Integer> children, List<Integer> childrenage) throws Throwable {
		Hotel.amenedAdultdetails();


    }





	@And("^Provides the Expedia Adults (.+) Details and (.+) details with (.+)$")
    public void provides_the_expedia_adults_details_and_details_with(List<Integer> adults, List<Integer> children, List<Integer> childrenage) throws Throwable {

		int index=0;
		int childageindex=0;
        for(int top= 0; top<adults.size(); top++) {
     	   int k = adults.get(top);
            int l = children.get(top);
     		for(int a=0; a<k ;a++){
     			 Hotel.EnterAdultDetailsForExpedia(index);
     			index=index+1;
     		}

     		for(int j=0; j<l ;j++){
     			System.out.println("j is :" +j);
     			Hotel.EnterChildrenDetailsForExpedia(index, childrenage.get(childageindex));
     			childageindex = childageindex+1;
     			index=index+1;
     		}
          }


    }

	@And("^User Enters Booking Refnumber$")
	public void User_Enters_Booking_Refnumber() throws Throwable {
		Hotel.eneterBookingref();
		Hotel.AcceptThePopup();
	}



	@Then("^Booking has been done successfully and Booking reference Text is stored in a file$")
	public void booking_has_been_done_successfully_and_booking_reference_text_is_stored_in_a_file() throws Throwable {
		rd.storeBookingDetails();
	}

	@And("^Click on Delete button$")
	public void click_on_delete_button() throws Throwable {
		Thread.sleep(2000);
		HotelCancel.DeleteProductFromShoppingCart();
	}

	@Then("^Product should be deleted from cart$")
	public void product_should_be_deleted_from_cart() throws Throwable {
		Thread.sleep(2000);
		HotelCancel.ProductDeleteVerification();
	}

	@Given("^User Clicks on Search Dropdown in Shopping cart$")
    public void user_clicks_on_search_dropdown_in_shopping_cart() throws Throwable {
		Thread.sleep(5000);
       Hotel.ClickOnSearchDropDownInCart();
    }

	@And("^Click On Search For Transfers from Dropdown$")
    public void click_on_search_for_transfers_from_dropdown() throws Throwable {

    }

}