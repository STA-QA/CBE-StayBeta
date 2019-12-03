package stepDefinitions;

import java.util.List;

import Base.BaseUtil;
import CBE.StayBeta.HomePageImpl;
import assertions.HomePageAssertions;
import cucumber.api.java.en.And;


public class HomePageDefinitions extends BaseUtil {
	HomePageAssertions HomeAssert = new HomePageAssertions();
	HomePageImpl Home = new HomePageImpl();

	@And("^Click on Hotel Menu")
	public void Click_on_Hotel_Menu() throws Throwable {
		Home.ClickOnMenuItem("Hotel");
	}

	@And("^Verify Home Page Assertions$")
	public void verify_home_page_assertions() throws Throwable {
		HomeAssert.verifyCountriesSortOrder();
		HomeAssert.UserRelatedAssertions();
		HomeAssert.HomePageMainTabsAssertions();
	}
	
	 @And("^In Home page user Search for a (.+) with particular (.+)$")
	    public void in_home_page_user_search_for_a_with_particular(String country, String searchstring) throws Throwable {
	        Home.SearchCountry(country, searchstring);
	    }

	    @And("^In Home page user Select the (.+) and (.+)$")
	    public void in_home_page_user_select_the_and(int startday, int durationofstay) throws Throwable {
	      Home.SelectItinerary(startday, durationofstay);  
	    }

	    @And("^In Home page user Select Number of Rooms(.+)$")
	    public void in_home_page_user_select_number_of_rooms(String rooms) throws Throwable {
	        Home.SelectNumberOfRooms(rooms);
	    }

	    @And("^In Home page user Select Number of Adult Guests (.+) into (.+) in automatic order$")
	    public void in_home_page_user_select_number_of_adult_guests_into_in_automatic_order(List<Integer> adults, int rooms) throws Throwable {
	    	for (int j = 0; j < rooms; j++) {
				Home.SelectNumberOfAdults(Integer.toString(adults.get(j)), j);
			}
	    }

	    @And("^In Home page user Select Number of Child Guests (.+) into (.+) in automatic order$")
	    public void in_home_page_user_select_number_of_child_guests_into_in_automatic_order(List<Integer> children, int rooms) throws Throwable {
	    	Thread.sleep(3000);
	    	
	    	int TotalChildren = 0;
			for (int j = 0; j < children.size(); j++) {
				TotalChildren += children.get(j);
			}
			if (TotalChildren > 0) {
				for (int j = 0; j < rooms; j++) {
					Home.SelectNumberOfChildren(Integer.toString(children.get(j)), j);
					Thread.sleep(2000);
				}
			}
	    }
	    
	    @And("^Click Search Button in Home Page$")
	    public void click_search_button_in_home_page() throws Throwable {
	        Thread.sleep(3000);
	        Home.ClickSearch();
	    }
	    
	    @And("^In Home page Click Search Button$")
	    public void in_home_page_click_search_button() throws Throwable {
	        Thread.sleep(3000);
	        Home.ClickSearch();
	        Thread.sleep(8000);
	    }

	    @And("^In Home page user Enter the ChildrenAge(.+)$")
	    public void in_home_page_user_enter_the_childrenage(List<Integer> childrenage) throws Throwable {
	    	System.out.println("Inside method");
	    	int TotalChildren = 0;
			for (int j = 0; j < childrenage.size(); j++) {
				TotalChildren += childrenage.get(j);
			}
			if (TotalChildren > 0) {
				for (int j = 0; j < childrenage.size(); j++) {
					Home.EnterChildrenAge(childrenage.get(j), j);
					Thread.sleep(2000);
				}
			}
			System.out.println("Outside method");
	    }
}
