package stepDefinitions;



import org.openqa.selenium.By;

import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import CBE.StayBeta.HotelSearchImpl;
import assertions.HomePageAssertions;
import assertions.HotelSearchPageAssertions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Login;
import utilities.TestBase;

public class TestClass extends TestBase {
	Login login = new Login();
	HomePageImpl Home = new HomePageImpl();
	HotelSearchImpl HotelSearch = new HotelSearchImpl();
	HotelImpl Hotel = new HotelImpl();
	HotelSearchPageAssertions HS = new HotelSearchPageAssertions();
	HomePageAssertions Homepage = new HomePageAssertions();
	
	//String a="";

	@And("^test purpose verify$")
    public void test_purpose_verify() throws Throwable {
		
		Thread.sleep(2000);
        HotelSearch.SelectRoomSelectionTabFromLB();
        Thread.sleep(2000);
       // HotelSearch.SelectRoomFromSelectionInLB();
		
		String ChangeIcon1 = "(//*[contains(@title,'Click to see other rooms')])";
		Boolean a =CBEDriver.findElement(By.xpath(ChangeIcon1)).isEnabled();
		System.out.println("Enabled Status:  "+ a);
    }
	 
	 @And("^User enters Valid (.+) and (.+)$")
	    public void user_enters_valid_and(String username, String password) throws Throwable {
		 String Username = "txtLoginUserID";
			String Password = "txtLoginPassword";
		 CBEDriver.findElement(By.id(Username)).clear();
			CBEDriver.findElement(By.id(Username)).sendKeys(username);
			CBEDriver.findElement(By.id(Password)).clear();
			CBEDriver.findElement(By.id(Password)).sendKeys(password);
	    }
	 
		 
	 
	    
	  
}
