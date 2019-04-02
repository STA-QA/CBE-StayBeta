package stepDefinitions;

import org.junit.runner.RunWith;

import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import utilities.Login;
import utilities.TestBase;


public class TestCase616 extends TestBase{
	Login login = new Login();
    HomePageImpl Home = new HomePageImpl();
    HotelImpl Hotel = new HotelImpl();     		
	
	
	@Given("^User Selects any agency")
	public void User_Selects_any_agency() throws Throwable{
		Home.UserSelectsAgency();
		CBEDriver.navigate().refresh();
	}
		
	@And("^Click on Hotel Menu")
	public void Click_on_Hotel_Menu() throws Throwable{
		//Home.SearchForHotel();
		Home.ClickOnMenuItem("Hotel");
	}
	
	@And("^Search for a particular Country")
	public void Search_for_a_particular_Country() throws Throwable{
		Hotel.SearchCountry("BUE", "Buenos Aires (BUE), Argentina (AR)");
	}
	
	
	@And("^Select the Duration Of Stay")
	public void Select_the_Duration_Of_Stay() throws Throwable{
		Hotel.SelectItinery(7);
	}
	
}
