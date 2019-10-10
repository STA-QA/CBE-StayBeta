package stepDefinitions;

import org.openqa.selenium.By;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import pages.HomePage;
import pages.Hotel;
import pages.Login;

public class TestClass extends BaseUtil {
	Login login = new Login(driver);
	HomePage Home = new HomePage(driver);
	Hotel Hotel = new Hotel(driver);

	//Login login = new Login();
	//HomePageImpl Home = new HomePageImpl();
	//HotelSearchImpl HotelSearch = new HotelSearchImpl();
	//HotelImpl Hotel = new HotelImpl();
	//HotelSearchPageAssertions HS = new HotelSearchPageAssertions();
	//HomePageAssertions Homepage = new HomePageAssertions();

	@And("^test purpose verify$")
	public void test_purpose_verify() throws Throwable {

		Thread.sleep(2000);
		Hotel.SelectRoomSelectionTabFromLB();
		Thread.sleep(2000);
		// HotelSearch.SelectRoomFromSelectionInLB();

		String ChangeIcon1 = "(//*[contains(@title,'Click to see other rooms')])";
		Boolean a = driver.findElement(By.xpath(ChangeIcon1)).isEnabled();
		System.out.println("Enabled Status:  " + a);
	}

	@And("^User enters Valid (.+) and (.+)$")
	public void user_enters_valid_and(String username, String password) throws Throwable {
		String Username = "txtLoginUserID";
		String Password = "txtLoginPassword";
		driver.findElement(By.id(Username)).clear();
		driver.findElement(By.id(Username)).sendKeys(username);
		driver.findElement(By.id(Password)).clear();
		driver.findElement(By.id(Password)).sendKeys(password);
	}

}
