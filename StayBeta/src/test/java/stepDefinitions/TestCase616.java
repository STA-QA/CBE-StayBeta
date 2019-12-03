package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

import Base.BaseUtil;
import CBE.StayBeta.HomePageImpl;
import CBE.StayBeta.HotelImpl;
import CBE.StayBeta.RandomDataGenerationImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import utilities.Login;

@RunWith(Cucumber.class)
public class TestCase616 extends BaseUtil {
	Login login = new Login();
	HomePageImpl Home = new HomePageImpl();
	HotelImpl Hotel = new HotelImpl();
	RandomDataGenerationImpl rd = new RandomDataGenerationImpl();

	@Given("^User Selects any agency")
	public void User_Selects_any_agency() throws Throwable {
		Reporter.addStepLog("User Selects Agency");
		Home.UserSelectsAgency();
		// CBEDriver.navigate().refresh();
	}

	@And("^Search for a particular Country")
	public void Search_for_a_particular_Country() throws Throwable {
		Hotel.SearchCountry("BUE", "Buenos Aires (BUE), Argentina (AR)");
	}

	@And("^Search for a (.+) with particular (.+)$")
	public void search_for_a_with_particular(String country, String countrysearchstring) throws Throwable {
		Hotel.SearchCountry(countrysearchstring, country);
	}

	@And("^Select the (.+) and (.+)$")
	public void select_the_and(int startday, int durationofstay) throws Throwable {
		Hotel.SelectItinerary(startday, durationofstay);
	}

	@And("^Select the Duration Of Stay")
	public void Select_the_Duration_Of_Stay() throws Throwable {
		Hotel.SelectItinery(1);
	}

	@And("^Select Exclude dorm beds")
	public void Select_Exclude_dorm_beds() throws Throwable {
		Hotel.SelectExcludeDormBeds();
	}

	@And("^Select Rooms And Number of guests")
	public void Select_Rooms_And_Number_of_guests() throws Throwable {
		Hotel.SelectNumberOfRooms("0");
		Hotel.SelectNumberOfRooms("1");
		Thread.sleep(2000);
		Hotel.SelectNumberOfAdults("0", 1);
		Thread.sleep(1000);
		Hotel.SelectNumberOfAdults("1", 1);
		Thread.sleep(1000);

	}

	@And("^Select STAy Data Source")
	public void Select_STAy_Data_Source() throws Throwable {
		Hotel.ExpandExtraSearch();
		Hotel.DeselectAll();
		Hotel.SelectHotelDataSource("STAy");

	}

	@And("^Select Number of Rooms (.+)$")
	public void select_number_of_rooms(String rooms) throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectNumberOfRooms(rooms);
		Thread.sleep(2000);
	}

	@And("^Select Number of Adults (.+)$")
	public void select_number_of_adults(String Adults) throws Throwable {
		Thread.sleep(2000);
		Hotel.SelectNumberOfAdults(Adults, 1);
		Thread.sleep(2000);
	}

	@And("^Select Number of Adult Guests (.+) into (.+) in automatic order$")
	public void select_number_of_adult_guests_into_in_automatic_order(List<Integer> Adults, int rooms)
			throws Throwable {
		for (int j = 0; j < rooms; j++) {
			Hotel.SelectNumberOfAdults(Integer.toString(Adults.get(j)), j);
		}
	}

	@And("^Select Number of Child Guests (.+) into (.+) in automatic order$")
	public void select_number_of_child_guests_into_in_automatic_order(List<Integer> children, int rooms)
			throws Throwable {
		int TotalChildren = 0;
		for (int j = 0; j < children.size(); j++) {
			TotalChildren += children.get(j);
		}
		if (TotalChildren > 0) {
			for (int j = 0; j < rooms; j++) {
				Hotel.SelectNumberOfChildren(Integer.toString(children.get(j)), j);
				Thread.sleep(2000);
			}
		}
	}

	@And("^Enter the ChildrenAge (.+)$")
	public void enter_the_childrenage(List<Integer> childrenage) throws Throwable {
		int TotalChildren = 0;
		for (int j = 0; j < childrenage.size(); j++) {
			TotalChildren += childrenage.get(j);
		}
		if (TotalChildren > 0) {
			for (int j = 0; j < childrenage.size(); j++) {
				Hotel.EnterChildrenAge(childrenage.get(j), j);
				Thread.sleep(2000);
			}
		}

	}

	@And("^Select Number of Children (.+)$")
	public void select_number_of_children(String children) throws Throwable {
		Thread.sleep(2000);
		// Hotel.SelectNumberOfChildren(children);
		Thread.sleep(2000);

	}

	@And("^Deselect SelectAll DataSources$")
	public void deselect_selectall_datasources() throws Throwable {
		Hotel.ExpandExtraSearch();
		Hotel.DeselectAll();
		
	}

	@And("^Select DataSource (.+)$")
	public void select_datasource(String datasource) throws Throwable {		
		Hotel.SelectHotelDataSource(datasource);
	}

	 @And("^Through Home Search Deselect SelectAll DataSources$")
	    public void through_home_search_deselect_selectall_datasources() throws Throwable {
		 String text = CBEDriver.findElement(By.xpath("//*[@id=\"m_c_C000_m_m_m_c_u2\"]/h4")).getText();
		 while(text.equalsIgnoreCase("SEARCHING")) {
			 Thread.sleep(2000);
			 System.out.println(text);
			 text = CBEDriver.findElement(By.xpath("//*[@id=\"m_c_C000_m_m_m_c_u2\"]/h4")).getText();
		 }
		 	Thread.sleep(5000);
			Hotel.DeselectAll_new();
			Thread.sleep(5000);
	    }

	    @And("^Through Home Search Select DataSource (.+)$")
	    public void through_home_search_select_datasource(String datasource) throws Throwable {
	    	String text = CBEDriver.findElement(By.xpath("//*[@id=\"m_c_C000_m_m_m_c_u2\"]/h4")).getText();
			 while(!text.equalsIgnoreCase("Search Results")) {
				 System.out.println(text);
				 text = CBEDriver.findElement(By.xpath("//*[@id=\"m_c_C000_m_m_m_c_u2\"]/h4")).getText();
			 }
			Hotel.SelectHotelDataSource(datasource);
	    }

	
	
	
	@And("^Exclude On Request Rooms$")
	public void exclude_on_request_rooms() throws Throwable {
		Hotel.ExcludeOnRequestRooms();
	}

	@And("^Click Search Button")
	public void Click_Search_Button() throws Throwable {
		Hotel.ClickSearch();

		Thread.sleep(20000);
		System.out.println("Wait is Done!!");
	}

	@And("^User Click Search Button on Hotel Searchpage (.+)$")
	public void User_Click_Search_Button_on_Hotel_Searchpage(String DataSource) throws Throwable {

		CBEDriver.findElement(By.id(Hotel.SearchButton)).click();
		String currenttimeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		Reporter.addStepLog("User CLicks on Search button at time:   " + currenttimeStamp);
		long timerstart = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(CBEDriver, 60);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-results-table']")));
		long timerfinish = System.currentTimeMillis();
		String aftertimeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		Reporter.addStepLog("User Can see Search page at time:    " + aftertimeStamp);
		long totalTime = timerfinish - timerstart;
		int seconds = (int) ((totalTime / 1000) % 60);
		Reporter.addStepLog("Total Time in Seconds to display Search Results:   " + seconds);

		String path = System.getProperty("user.dir") + "\\Testdata\\perf.xlsx";

		FileInputStream inputStream = new FileInputStream(new File(path));
		Workbook workbook = WorkbookFactory.create(inputStream);

		Sheet sheet = workbook.getSheetAt(0);

		Object[][] bookData = { { DataSource, seconds },

		};

		int rowCount = sheet.getLastRowNum();

		for (Object[] aBook : bookData) {
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;

			Cell cell = row.createCell(columnCount);
			cell.setCellValue(rowCount);

			for (Object field : aBook) {
				cell = row.createCell(++columnCount);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}

		}

		inputStream.close();

		FileOutputStream outputStream = new FileOutputStream(path);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();

	}

	@And("^User Search For a Particular Hotel (.+)$")
	public void user_search_for_a_particular_hotel(String hotel) throws Throwable {
		Hotel.SearchHotel(hotel, hotel);
	}

	@When("^User Searches and Selects a particular Hotel")
	public void User_Searches_and_Selects_a_particular_Hotel() throws Throwable {
		// Hotel.SearchHotel("Regr", "Regression Hotel (Alloc+Supp)");
		Hotel.CountResultsWithoutAnyParticularHotelSearch();
	}

	@When("^User Searches with a (.+)and Selects a (.+)$")
	public void user_searches_with_a_and_selects_a(String hotelsearchstring, String hotel) throws Throwable {
		Hotel.SearchHotel(hotelsearchstring, hotel);
	}

	@And("^Clicks on Add to cart$")
	public void clicks_on_add_to_cart() throws Throwable {
		Hotel.ClickAddToCart();
	}

	@And("^Clicks on Complete Booking$")
	public void clicks_on_complete_booking() throws Throwable {
		Thread.sleep(15000);
		Hotel.ClickOnCompleteBooking();
	}

	@And("^Clicks On Book Radio Button$")
	public void clicks_on_book_radio_button() throws Throwable {
		Thread.sleep(5000);
		Hotel.SelectBookRB();
	}

	@And("^Provides the Person details$")
	public void provides_the_person_details() throws Throwable {
		Hotel.EnterPersonDetails();
	}

	@And("^Accepts the Terms and Conditions$")
	public void accepts_the_terms_and_conditions() throws Throwable {
		Thread.sleep(4000);
		Hotel.AcceptTermsAndConditions();
		Thread.sleep(4000);
	}

	@And("^Click on Book Button$")
	public void click_on_book_button() throws Throwable {
		Thread.sleep(8000);
		Hotel.ClickOnBook();
		Thread.sleep(2000);
	}

	@And("^Click On save in Additional info box$")
	public void click_on_save_in_additional_info_box() throws Throwable {
		Thread.sleep(4000);
		CBEDriver.findElement(By.id("m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_saveBtn")).click();
	}

	@Then("^Booking has been done successfully$")
	public void booking_has_been_done_successfully() throws Throwable {
		Hotel.bookingConfirmation();
	}

}
