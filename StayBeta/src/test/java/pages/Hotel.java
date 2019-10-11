package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;
import com.google.common.io.Files;

import Base.BaseUtil;

public class Hotel extends BaseUtil {

	public Hotel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	Faker faker = new Faker();
	public String RoomSelXpath = "//button[@id='Pivot3-Tab3']/div/span/span";
	public String DataSourceSelectAll = "";
	public String ParticularDataSource = "";
	public String DataSourceXpath1 = "//label[contains(.,'";
	public String DataSourceXpath2 = "')]";
	public String DSCheckBoxXpath1 = "//input[@value='";
	public String DSCheckBoxXpath2 = "']";
	public String Location = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx";
	public String FromDateTB = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx";
	public String CityTextBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx";
	public String From = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx";
	public String To = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckOuttbx";
	public String NumberOfRooms = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRoomCount";
	public String AdultId1 = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_";
	public String AdultId2 = "_uscPassengers_ddlAdults";
	public String Children = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlChildren";
	public String Infants = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlInfants";
	public String ShowExtraSearchOptions = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_btnSearchOptionsExpander";
	public String STAyCheckBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSources_cbxDataSource500003";
	public String SelectAllCheckbox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSources_cbxDataSource-1";
	public String SearchButton = "m_c_C000_m_m_m_c_btnSearch";
	public String ClearForm = "//span[contains(.,'Clear form')]";
	public String ExcludeDormBeds = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_chkExcludeDormBeds";
	public String SuccessMsgXpath = "//span[contains(.,'Success')]";
	public String HotelNameSearchXpath = "//div[@id='dolphin-filters']/div[3]/div/div[2]/input";
	public String OLBAddToCartXpath = "//*[contains(@class,'btn-add-to-cart')]";
	public String BookRadioButton = "//div[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/input";
	public String QuoteId = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess_rptAvailableProcesses_ctl01_rbnProcess";
	public String CompleteBookingCSS = "#m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1 > .link-center";
	public String AcceptTerms = "m_c_C000_m_c_cbxAcceptedConditions";
	public String BookXpath = "//a[@id='m_c_C000_m_c_continueBtn']/span";
	public String Title = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_namePrefixDdl";
	public String FirstName = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_givenNameTbx";
	public String LastName = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_surnameTbx";
	public String DOBDay = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_birthDateBdbdays";
	public String DOBMonth = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_birthDateBdbmonths";
	public String DOBYear = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_birthDateBdbyears";
	public String MyBookings = "//div[@id='m_cphHeader_T_CustToolbar_cbeNav_myAccount_divManageBooking']/div/a/div[2]/span";
	public String BookingSearch = "//span[contains(.,'Booking search')]";
	public String BSBranchCode = "m_c_C001_params_ddlBranchCode_ddVal";
	public String BSCreateDateFrom = "m_c_C001_params_dtBookingCreateDateFromtbx";
	public String BSCreateDateTo = "m_c_C001_params_dtBookingCreateDateTotbx";
	public String BookingSelect = "//a[@id='m_c_C001_results_grdFolders_ctl02_lnkFolderSelect']/span";
	public String BookingSearchButton = "//a[@id='m_c_C001_buttons_searchBtn']/span";
	public String CompleteAmendBookingCSS = "#m_c_C000_uscItinSumm_btnContinue_btnContinue1 > .link-center";
	public String SearchOptionInCart = "//div[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_pmlSearchOptions']/div/a/div[2]/span";
	public String AmendThisItem = "//a[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnAmend']/span";
	public String PopupOK = "//*[contains(@id,'confirm')]/div/div[2]/a[1]/span/span";
	public String PopupCancel = "//*[contains(@id,'confirm')]/div/div[2]/a[2]/span/span";
	String cancelationExpectedText = "This item is being booked within a cancellation charge period";

	@FindBy(how = How.XPATH, using = " //div[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_actionsUpd2']")
	public WebElement Removefromcart;
	@FindBy(how = How.XPATH, using = "//div[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning']")
	public WebElement CancelationTermsText;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx")
	public WebElement Country;
	@FindBy(how = How.XPATH, using = "//div[@class='asmMenuItem']")
	public List<WebElement> CountryName;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx")
	public WebElement Startdate;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckOuttbx")
	public WebElement Enddate;

	@FindBy(how = How.XPATH, using = "//select[@name='m$c$C000$m$m$m$c$c3$c3$uscSrchParms$ctDatesSelector$dateAndDurationSelector$ddlNights']")
	public WebElement Nights;

	@FindBy(how = How.XPATH, using = "//a[@class='primary-button cart-button']")
	public List<WebElement> Addtocart;

	@FindBy(how = How.XPATH, using = "//div[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_1_uscItm_lblCanxPeriodWarning']")
	public List<WebElement> cancellationChargePeriod;

	@FindBy(how = How.XPATH, using = "//a[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_1_uscItm_dtsItineraryItemCancellationCondtions_cancellationConditionsBtn']")
	public WebElement cancelConditionLink;

	public void SearchCountry(String SearchText, String Country) {
		driver.findElement(By.id(CityTextBox)).sendKeys(SearchText);
		String CXpath1 = "//span/div/div[@class='asmMenuItem' and contains(.,'";
		String CXpath2 = "')]";
		String CountryXpath = CXpath1 + Country + CXpath2;
		driver.findElement(By.xpath(CountryXpath)).click();
	}

	public void SelectItinery(int NumberOfDays) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, 5);
		String StartDate = format1.format(cal.getTime());

		driver.findElement(By.id(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);

		cal.add(Calendar.DATE, NumberOfDays);
		String EndDate = format1.format(cal.getTime());

		driver.findElement(By.id(To)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);

	}

	public void SelectItinerary(int StartDay, int NumberOfDays) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, StartDay);
		String StartDate = format1.format(cal.getTime());

		driver.findElement(By.id(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);

		cal.add(Calendar.DATE, NumberOfDays);
		String EndDate = format1.format(cal.getTime());

		driver.findElement(By.id(To)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);

	}

	public void SelectExcludeDormBeds() {
		driver.findElement(By.id(ExcludeDormBeds)).click();
	}

	public void SelectNumberOfRooms(String NoOfRooms) {
		String a = "//select[@id='m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRoomCount']/option[";
		String b = "]";
		String finalpath = a + NoOfRooms + b;

		driver.findElement(By.xpath(finalpath)).click();
	}

	public void SelectNumberOfAdults(String NoOfAdults, int RoomNumber) throws InterruptedException {
		String NoOfAdultsId = AdultId1 + (RoomNumber - 1) + AdultId2;
		driver.findElement(By.id(NoOfAdultsId)).sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.id(NoOfAdultsId)).sendKeys(NoOfAdults);
	}

	public void SelectNumberOfChildren(String NoOfChildren) throws InterruptedException {
		driver.findElement(By.id(Children)).sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.id(Children)).sendKeys(NoOfChildren);
		Thread.sleep(2000);
		int child = Integer.parseInt(NoOfChildren);
		if (child >= 2) {
			driver.findElement(By.xpath(
					"//*[@id=\"m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_bclChildren_0_AgePassengerItem2_txtAge\"]"))
					.sendKeys("3");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id=\"m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_bclChildren_1_AgePassengerItem2_txtAge\"]"))
					.sendKeys("5");
		}
	}

	public void ExpandExtraSearch() {
		driver.findElement(By.id(ShowExtraSearchOptions)).click();
	}

	public void DeselectAll() {
		Boolean a = driver.findElement(By.xpath("//input[@value='SelectAll']")).isSelected();
		if (a == true) {
			driver.findElement(By.id(SelectAllCheckbox)).click();
		} else {
			System.out.println("Select all is already deselected");
		}
	}

	public void SelectHotelDataSource(String HotelProvider) {
		String HotelXpath1 = "//label[contains(.,'";
		String HotelXpath2 = "')]";
		String HotelXpath = HotelXpath1 + HotelProvider + HotelXpath2;
		Boolean a = driver.findElement(By.xpath("//input[@value='SelectAll']")).isSelected();
		if (a == true) {
			driver.findElement(By.id(SelectAllCheckbox)).click();
			driver.findElement(By.xpath(HotelXpath)).click();
		} else {
			driver.findElement(By.xpath(HotelXpath)).click();
		}
	}

	public void ClickSearch() {
		driver.findElement(By.id(SearchButton)).click();
	}

	public void SearchHotel(String SearchText, String HotelName) throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath(HotelNameSearchXpath)).sendKeys(SearchText);
		driver.findElement(By.cssSelector(".radius-label > .floating-label")).click();
		Thread.sleep(2000);
		String h1 = "//*/a[contains(.,'";
		String h2 = "')]";
		String hotelxpath = h1 + HotelName + h2;
		driver.findElement(By.xpath(hotelxpath)).click();

	}

	public void CountResultsWithoutAnyParticularHotelSearch() {
		// Take the count from public String which says x matches found
	}

	public void CountResultsWithParticularHotelTextSearch(String SearchText) {
		// Take the count from public String which says x matches found
	}

	public void ClickAddToCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		try {
			Assert.assertTrue(driver.findElement(By.xpath("//*/span[contains(.,'Overview')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Overview Tab is not displayed");
		}

		try {
			Assert.assertTrue(driver.findElement(By.xpath("//*/span[contains(.,'Photos')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Photos Tab is not displayed");
		}

		try {
			Assert.assertTrue(driver.findElement(By.xpath("//*/span[contains(.,'Map')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Map Tab is not displayed");
		}

		try {
			Assert.assertTrue(driver.findElement(By.xpath("//*/span[contains(.,'Room selection')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Room selection Tab is not displayed");
		}

		try {
			Assert.assertTrue(driver.findElement(By.xpath("//*/span[contains(.,'Rate/Room info')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Rate/Room info Tab is not displayed");
		}

		try {
			Assert.assertTrue(driver.findElement(By.xpath("//*/span[contains(.,'Cancellations')]")).isDisplayed());
			driver.findElement(By.xpath("//*/span[contains(.,'Cancellations')]")).click();
			Thread.sleep(2000);
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				// now copy the screenshot to desired location using copyFile //method
				Files.copy(src, new File("C:\\CBE-Automation\\StayBeta\\Screenshots\\Cancellations.png"));
			}

			catch (IOException e) {
				System.out.println(e.getMessage());

			}
			driver.getPageSource().contains("split commission");
		} catch (AssertionError e) {
			LogLog.error("Error with Cancellation tab or the split commission in the tab");
		}

		driver.findElement(By.xpath(OLBAddToCartXpath)).click();
	}

	public void ClickOnCompleteBooking() throws InterruptedException {
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1']/span[2]")).click();
		// driver.findElement(By.xpath("//*/span[contains(.,'Complete
		// booking')]")).click();
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Complete booking')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();

	}

	public void SelectBookRB() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(BookRadioButton)).click();
		// driver.findElement(By.xpath("//*[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/label[1]")).click();
		// *[@id="m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess"]/label[1]
		// driver.findElement(By.xpath("//div[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/input")).click();

	}

	public void EnterPersonDetails() {
		driver.findElement(By.id(Title)).sendKeys("Mr");
		driver.findElement(By.id(FirstName)).sendKeys("FirstTest");
		driver.findElement(By.id(LastName)).sendKeys("LastTest");
		driver.findElement(By.id(DOBDay)).sendKeys("29");
		driver.findElement(By.id(DOBMonth)).sendKeys("Mar");
		driver.findElement(By.id(DOBYear)).sendKeys("1990");
	}

	public void AcceptTermsAndConditions() {
		WebElement element = driver.findElement(By.id(AcceptTerms));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	public void ClickOnBook() {

		driver.findElement(By.xpath(BookXpath)).click();
	}

	public void ClickMyBookings() {
		driver.findElement(By.xpath(MyBookings)).click();
	}

	public void SelectBookingSearch() {
		driver.findElement(By.xpath(BookingSearch)).click();
	}

	public void EnterBookingSearchCriteria() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, -1);
		String StartDate = format1.format(cal.getTime());
		driver.findElement(By.id(BSCreateDateFrom)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);
		cal.add(Calendar.DATE, 1);
		String EndDate = format1.format(cal.getTime());
		driver.findElement(By.id(BSCreateDateTo)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);

	}

	public void ClickBookingSearch() throws InterruptedException {
		driver.findElement(By.xpath(BookingSearchButton)).click();
		Thread.sleep(3000);
	}

	public void SelectBookingFromList() {
		String Record = "//a[contains(@id,'m_c_C001_results_grdFolders_ct')]/span[contains(.,'Select')]";
		// int count = driver.findElements(By.xpath(Record)).size();
		// System.out.println("The count is " + count);
		java.util.List<WebElement> listins = driver.findElements(By.xpath(Record));
		Random r = new Random();
		int randomValue = r.nextInt(listins.size());
		System.out.println("listings: " + listins);
		System.out.println("random value is: " + randomValue);
		listins.get(randomValue).click();

	}

	public void ClickOnAmendCompleteBooking() throws InterruptedException {
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector(CompleteAmendBookingCSS)).click();
		driver.findElement(By.xpath("//span[contains(.,'Complete booking')]")).click();
	}

	public void SearchOptionInCart() {
		driver.findElement(By.xpath(SearchOptionInCart)).click();
	}

	public void SelectAmendThisItem() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(SearchOptionInCart)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(AmendThisItem)).click();
		Thread.sleep(3000);
	}

	public void AcceptThePopup() throws InterruptedException {
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.xpath(PopupOK)).click();
		Thread.sleep(1000);

	}

	public void EnterGuestDetails(int Guests) throws InterruptedException {
		// public String Common = "";
		String Common = "m_c_C000_m_c_paxItmsUsc_bclPax_";
		String Title1 = "_paxItmUsc_namePrefixDdl";
		String idFN1 = "_paxItmUsc_givenNameTbx";
		String idLN1 = "_paxItmUsc_surnameTbx";
		String idBD1 = "_paxItmUsc_birthDateBdbdays";
		String idBM1 = "_paxItmUsc_birthDateBdbmonths";
		String idBY1 = "_paxItmUsc_birthDateBdbyears";

		for (int i = 0; i < Guests; i++) {
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();
			String Title = Common + i + Title1;
			String FNpath = Common + i + idFN1;
			String LNpath = Common + i + idLN1;
			String BirthDay = Common + i + idBD1;
			String BirthMonth = Common + i + idBM1;
			String BirthYear = Common + i + idBY1;
			driver.findElement(By.id(Title)).sendKeys("M");
			driver.findElement(By.id(FNpath)).sendKeys(firstName);
			driver.findElement(By.id(LNpath)).sendKeys(lastName);
			java.util.List<WebElement> options = driver.findElements(By.id(BirthMonth));
			Random rand = new Random();
			int list = rand.nextInt(options.size());
			options.get(list).click();
			java.util.List<WebElement> options1 = driver.findElements(By.id(BirthDay));
			// Random rand = new Random();
			int list1 = rand.nextInt(options.size());
			options.get(list1).click();
			Thread.sleep(1000);
			if (i == 2) {
				driver.findElement(By.id(BirthDay)).sendKeys("10");
				Thread.sleep(1000);
				driver.findElement(By.id(BirthMonth)).sendKeys("MAR");
				Thread.sleep(1000);
				driver.findElement(By.id(BirthYear)).sendKeys("2016");
			}

			if (i == 3) {
				driver.findElement(By.id(BirthDay)).sendKeys("10");
				Thread.sleep(1000);
				driver.findElement(By.id(BirthMonth)).sendKeys("MAR");
				Thread.sleep(1000);
				driver.findElement(By.id(BirthYear)).sendKeys("2014");
			}
			if (i < 2) {
				driver.findElement(By.id(BirthDay)).sendKeys("10");
				Thread.sleep(1000);
				driver.findElement(By.id(BirthMonth)).sendKeys("MAR");
				Thread.sleep(1000);
				driver.findElement(By.id(BirthYear)).sendKeys("1990");
			}
		}

	}

	public void SelectRandomHotel() throws InterruptedException {
		Thread.sleep(2000);
		String TestXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[3]/a";
		java.util.List<WebElement> listings = driver.findElements(By.xpath(TestXpath));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());

		listings.get(randomValue).click();

	}

	public void ClickOnCancelItem() {
		driver.findElement(By.xpath("//label[contains(.,'Cancel item')]")).click();
	}

	public void ClickUpdateButton() {
		String UpdateXpath = "//span[contains(.,'Update')]";
		WebElement element = driver.findElement(By.xpath(UpdateXpath));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	public void VerifyQuoteRBIsSelected() {
		boolean a = driver.findElement(By.id(QuoteId)).isSelected();
		if (a == true) {
			System.out.println("Quote is selected by default");
		} else {
			LogLog.error("Quote is not selected By default");
		}
	}

	public void VerifyDisabledAssertions() {

		Boolean a = driver.findElement(By.id(Location)).isEnabled();
		if (a == false) {
			// System.out.println("Location Change is disabled");
			// softAssert.assertTrue(driver.findElement(By.id("Just
			// Testing")).isDisplayed());
			try {
				driver.findElement(By.id("tst")).isEnabled();
				System.out.println("Errortry");
			} catch (Exception e) {

				System.out.println("ErrorCatch");
				LogLog.error("Assertion Failed");

			}

		} else {
			System.out.println("Location Change is Enabled");

		}

	}

	public void TakeSSofCancellationChargesFromLB() {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(screenshotFile, new File("C:\\Users\\Kiranmai.adams\\Documents\\StayBeta\\Screenshots"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void DeleteProductFromShoppingCart() throws InterruptedException {
		Thread.sleep(2000);

		String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";

		driver.findElement(By.id(DeleteButton)).click();

		Thread.sleep(2000);

		String ShoppingCartCount = "	//div/span[contains(@class,'items')]";

		String text = driver.findElement(By.xpath(ShoppingCartCount)).getText();

		System.out.println("The deleted related text is :" + text);

	}

	public void ProductDeleteVerification() {
		String ShoppingCartCount = "	//div/span[contains(@class,'items')]";

		String text = driver.findElement(By.xpath(ShoppingCartCount)).getText();

		System.out.println("The deleted related text is :" + text);

		assertEquals("(0 item)", text);

	}

	public void ClickRetrieveLatestBooking() throws InterruptedException {
		String RLBXpath = "//span[contains(text(),'Retrieve latest booking')]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(RLBXpath)).click();
		Thread.sleep(2000);
	}

	public void VerifyBookingCancellation() {
		String CancelledTxt = "//td[contains(text(),'Cancelled')]";
		driver.findElement(By.xpath(CancelledTxt)).isDisplayed();

	}

	public void ChangeFromDateForHotelAmend() {
		String From = "//*[@id='m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx']";

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		String CurrentFromDate = driver.findElement(By.xpath(From)).getAttribute("Value");

		System.out.println("the date fetched is " + CurrentFromDate);
		try {
			Date date = format1.parse(CurrentFromDate);
			cal.setTime(date);
			cal.add(Calendar.DATE, 4);
			String NewDate = format1.format(cal.getTime());
			driver.findElement(By.xpath(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), NewDate);

		}

		catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void ReduceFromDateForHotelAmend(int NoOfNightsToReduce) throws ParseException {
		String From = "//*[@id='m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx']";

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		String CurrentFromDate = driver.findElement(By.xpath(From)).getAttribute("Value");

		System.out.println("the date fetched is " + CurrentFromDate);
		try {
			Date date = format1.parse(CurrentFromDate);
			cal.setTime(date);
			cal.add(Calendar.DATE, -NoOfNightsToReduce);
			String NewDate = format1.format(cal.getTime());
			driver.findElement(By.xpath(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), NewDate);

		}

		catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public void AddToCartInAmend() {
		String AddToCartXpath = "//span[contains(text(),'Add to cart')]";
		driver.findElement(By.xpath(AddToCartXpath)).click();

	}

	public void ClickOnCancellationConditionsLink() {
		driver.findElement(By.xpath("//a[contains(.,'Cancellation conditions')]")).click();
		try {
			FileWriter writer = new FileWriter("BookingDetails.docx", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.newLine();
			bufferedWriter.write("The Cancellation Charges are: ");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void GetTheCancellationChargesDetails() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		List<WebElement> listings = driver
				.findElements(By.xpath("//*[@id='CancellationsContainer']/div/div/div/div/ul/li"));

		for (WebElement we : listings) {
			try {
				try {
					FileWriter writer = new FileWriter("BookingDetails.docx", true);
					BufferedWriter bufferedWriter = new BufferedWriter(writer);
					bufferedWriter.newLine();
					bufferedWriter.write(we.getText());
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (AssertionError e) {

				LogLog.error("Other Data Sources Hotels are displayed in the search");
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"glbLightBoxDiv\"]/div[3]/div/a[2]/i")).click();

		Thread.sleep(2000);
		// driver.switchTo().frame(1);
		Thread.sleep(2000);
	}

	public void DataSourceDisplayAssertion(String DataSource) {
		String DataSourceXpath = DataSourceXpath1 + DataSource + DataSourceXpath2;

		try {
			Assert.assertTrue(driver.findElement(By.xpath(DataSourceXpath)).isDisplayed(),
					DataSource + " is displayed in the Data Source list");
		} catch (Exception e) {
			LogLog.error(DataSource + "is not displayed in the list");
		}

	}

	public void DataSourceSelectedByDefault(String DataSourceValue) throws AssertionError {
		String DSCheckboxXpath = DSCheckBoxXpath1 + DataSourceValue + DSCheckBoxXpath2;
		try {
			Assert.assertTrue(driver.findElement(By.xpath(DSCheckboxXpath)).isSelected(),
					DataSourceValue + " is not selected by Default");
		} catch (AssertionError e) {
			LogLog.error(DataSourceValue + "A data Source checkbox Assertion Failed  " + e);
		} catch (Throwable t) {
			LogLog.error(DataSourceValue + "A data Source checkbox Assertion Failed  " + t);
		}

	}

	public void ExtraSearchOptionsAssertions() throws IOException {
		String DataSourcesXpath = "//*[contains(text(),'Data sources')]";
		String PreferecesXpath = "//h4[contains(text(),'Preferences')]";
		String FacilitiesXpath = "//h4[contains(text(),'Facilities / atributes')]";

		PrintWriter witer = new PrintWriter("AssertionErrors.txt");

		try {
			Assert.assertTrue(driver.findElement(By.xpath(DataSourcesXpath)).isDisplayed(),
					"Verifiying Data Sources availability on Expanding search options");

			Assert.assertTrue(driver.findElement(By.xpath(PreferecesXpath)).isDisplayed(),
					"Verifiying Preferences availability on Expanding search options");

			Assert.assertTrue(driver.findElement(By.xpath(FacilitiesXpath)).isDisplayed(),
					"Verifiying Facilities availability on Expanding search options");
		} catch (AssertionError e) {
			LogLog.error("Error finding Labels in Extra Search Options");
			witer.write("Error finding Labels in Extra Search Options");
			witer.close();

		} catch (Throwable t) {
			LogLog.error("Error finding Labels in Extra Search Options");
			witer.write("Error finding Labels in Extra Search Options");
			witer.close();

		}

	}

	Actions actions = new Actions(driver);

	public void VerifySearchResultsOfDS(String DataSource) {

		String DSXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[1]";
		int count = driver.findElements(By.xpath(DSXpath)).size();
		System.out.println("The Hotel count is  " + count);

		List<WebElement> elementList = driver.findElements(By.xpath(DSXpath));
		for (WebElement we : elementList) {
			try {
				assertTrue(we.getText().equalsIgnoreCase(DataSource));
			} catch (AssertionError e) {
				System.out.println(we.getText());
				LogLog.error("Other Data Sources Hotels are displayed in the search");
			}
		}

	}

	public void AddRandomHotelToCartFromTSRes() throws InterruptedException {
		Thread.sleep(20000);

		/*
		 * if(driver.findElements(By.id("pnlSearchResultsPagination")).size()>0) {
		 * System.out.println("In Pagination"); List<WebElement> Pages =
		 * driver.findElements(By.xpath("//*[@id=\"m_c_C000_m_m_m_c_ul\"]/li")); Random
		 * r = new Random(); System.out.println("The total page numbers is : " +
		 * Pages.size()); int rValue = r.nextInt(Pages.size());
		 * System.out.println("The page number is : " + rValue);
		 * Pages.get(rValue).click(); Thread.sleep(2000); }
		 */

		// String AddToCartXpath =
		// "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[12]/div/a";
		String AddToCartXpath = "//span[contains(.,'Add to cart')]";

		List<WebElement> listings = driver.findElements(By.xpath(AddToCartXpath));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());

		WebElement parent = listings.get(randomValue).findElement(By.xpath("./../../../.."));

		String id = parent.getAttribute("id");

		System.out.println(id);

		String HotelNamepath = "//*[@id='" + id + "']/td[3]";
		String HotelName = driver.findElement(By.xpath(HotelNamepath)).getText();

		String ExpandXpath = "//*[@id='" + id + "']/td[11]//div/div/a/span[@title='Expand price breakdown']";
		driver.findElement(By.xpath(ExpandXpath)).click();
		Thread.sleep(1000);
		String SplComm = driver
				.findElement(By.xpath(
						"//*[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes')]/td/table/tbody/tr[2]/td[3]"))
				.getText();
		System.out.println("Special Commission is: " + SplComm);
		String intValue = SplComm.replaceAll("[^0-9]", "");
		float f = Float.parseFloat(intValue);

		try {
			Assert.assertTrue(f > 0);
		} catch (AssertionError E) {
			LogLog.error("Split Commission is not displayed properly for : " + HotelName);
		} catch (Exception E) {
			LogLog.error("Split Commission is not displayed properly for : " + HotelName);
		}

		String CollapseXpath = "//*[@id='" + id + "']/td[11]//div/div/a/span[@title='Collapse price breakdown']";

		System.out.println("The Hotel Name is:  " + HotelName);

		/*
		 * String RoomTypeXpath1 = "//*[@id='"+id+"']/td[6]/span";
		 *
		 * String RoomTypeXpath2 = "//*[@id='"+id+"']/td[6]/span"; String RoomType1 =
		 * driver.findElement(By.xpath(RoomTypeXpath1)).getText();
		 *
		 * String RoomType2 = driver.findElement(By.xpath(RoomTypeXpath2)).getText();
		 */

		// System.out.println("Room Type is: " +RoomType1);

		// System.out.println("Room Type 2 is: " +RoomType2);

		try {
			FileWriter writer = new FileWriter("BookingDetails.docx", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.newLine();
			bufferedWriter.write("****************************************************************");
			bufferedWriter.newLine();
			bufferedWriter.write("The Booking Details through Automation are : ");
			bufferedWriter.newLine();
			bufferedWriter.write("The Hotel Name is: " + HotelName);

			/*
			 * bufferedWriter.newLine(); bufferedWriter.write("Room Type 1 is:  "
			 * +RoomType1);
			 *
			 *
			 * bufferedWriter.newLine(); bufferedWriter.write("Room Type 2 is:  "
			 * +RoomType2);
			 */

			bufferedWriter.newLine();
			bufferedWriter.write("Split Commission is:  " + SplComm);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath(CollapseXpath)).click();
		Thread.sleep(5000);

		List<WebElement> listing = driver.findElements(By.xpath(AddToCartXpath));
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listing.get(randomValue)));
		listing.get(randomValue).click();

	}

	public void VerifyReviewsForHotel() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.name("m$c$C000$m$m$m$c$pagingControl$ddlNumResultsPerPage")).sendKeys("100");
		Thread.sleep(4000);
		String Pages = "//*[@id='m_c_C000_m_m_m_c_ul']/li";

		int pageCount = driver.findElements(By.xpath(Pages)).size();
		System.out.println(pageCount + "  is the page count");

		for (int i = 1; i <= pageCount; i++) {
			Thread.sleep(2000);
			String pageXpath = "//*[@id='m_c_C000_m_m_m_c_ul']/li[" + i + "]";

			WebDriverWait wait = new WebDriverWait(driver, 25);
			if (i > 1) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(pageXpath))));
				driver.findElement(By.xpath(pageXpath)).click();
				Thread.sleep(6000);
			}
			String RXP = "external-user-review";
			String ReviewsXpath = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[contains(@class,'external-user-review')]";
			int count = driver.findElements(By.className(RXP)).size();
			System.out.println("The Reviews count is  " + count);

			List<WebElement> elementList = driver.findElements(By.xpath(ReviewsXpath));
			// List<WebElement> elementList = driver.findElements(By.className(RXP));

			for (WebElement we : elementList) {
				try {
					Thread.sleep(800);
					assertFalse(we.getText().isEmpty());
				} catch (AssertionError ae) {
					LogLog.error("Review is not present for the below Hotel");
					WebElement parent = we.findElement(By.xpath("./.."));
					String id = parent.getAttribute("id");
					String HotelName = "//*[@id='" + id + "']/td[3]";
					System.out.println(driver.findElement(By.xpath(HotelName)).getText());

					// System.out.println(we.getCssValue(propertyName));
				} catch (StaleElementReferenceException e) {

					System.out.println("Stale element error, trying ::  ");
				}

			}
		}

	}

	public void VerifyRatingsForHotel() {
		// TODO Auto-generated method stub

	}

	public void SelectRoomSelectionTabFromLB() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*/span[contains(.,'Room selection')]")).click();
	}

	public void SelectRoomFromSelectionInLB() {

		String RoomListXpath = "//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[contains(@title,'Select and hide options')]";
		List<WebElement> listings = driver.findElements(By.xpath(RoomListXpath));
		int size = driver.findElements(By.xpath(RoomListXpath)).size();
		System.out.println("Rooms available are : " + size);
		if (size > 0) {
			Random r = new Random();
			int randomValue = r.nextInt(listings.size());
			listings.get(randomValue).click();
		} else {

		}

	}

	public void SelectSameTypeRoomsFromListsInLB(int NoOfRooms) throws InterruptedException {

		String ChangeIcon1 = "(//*[contains(@title,'Click to see other rooms')])[1]";
		driver.findElement(By.xpath(ChangeIcon1)).click();

		Thread.sleep(2000);

		String a = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings = driver.findElements(By.xpath(a));
		int size = driver.findElements(By.xpath(a)).size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());
		if (size > 0) {

			listings.get(randomValue).click();
		} else {

		}

		String ChangeIcon2 = "(//*[contains(@title,'Click to see other rooms')])[2]";
		driver.findElement(By.xpath(ChangeIcon2)).click();

		Thread.sleep(2000);

		String b = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings1 = driver.findElements(By.xpath(b));

		int size1 = driver.findElements(By.xpath(b)).size();
		System.out.println("Rooms available are : " + size1);
		if (size > 0) {
			listings1.get(randomValue).click();
		} else {

		}

	}

	public void SelectDiffTypeRoomsFromListsInLB(int NoOfRooms) throws InterruptedException {
		String ChangeIcon1 = "(//*[contains(@title,'Click to see other rooms')])[1]";
		driver.findElement(By.xpath(ChangeIcon1)).click();

		Thread.sleep(2000);

		String a = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings = driver.findElements(By.xpath(a));
		int size = driver.findElements(By.xpath(a)).size();
		System.out.println("Rooms available are : " + size);
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());
		int randomValue1 = r.nextInt(listings.size());
		if (size > 0) {

			listings.get(randomValue).click();
		} else {

		}

		String ChangeIcon2 = "(//*[contains(@title,'Click to see other rooms')])[2]";
		driver.findElement(By.xpath(ChangeIcon2)).click();

		Thread.sleep(2000);

		String b = "(//*[@id=\"glbLightBoxDiv\"]/div[4]/div[1]/div/div[2]/div/div/div[2]/div/div/div[2]/table/tbody/tr/td[contains(@title,'Select and hide options')])";

		List<WebElement> listings1 = driver.findElements(By.xpath(b));

		int size1 = driver.findElements(By.xpath(b)).size();
		System.out.println("Rooms available are : " + size1);
		if (size > 0) {
			listings1.get(randomValue1).click();
		} else {

		}

	}

	public void AddToCartFromLBWithoutSwitchingFrame() throws InterruptedException {
		Thread.sleep(2000);
		String OLBAddToCartXpath = "//*[contains(@class,'btn-add-to-cart')]";
		driver.findElement(By.xpath(OLBAddToCartXpath)).click();

	}

	public void ExpandRandomHotelRoomtypeOptionsInTable() {
		String ExpandXpath = "//*/span[contains(@title,'Expand alternate room options')]";
		int a = driver.findElements(By.xpath(ExpandXpath)).size();
		System.out.println("Expand path options " + a);
		List<WebElement> ExpandOptions = driver.findElements(By.xpath(ExpandXpath));
		Random ran = new Random();
		int randomValue = ran.nextInt(ExpandOptions.size());
		ExpandOptions.get(randomValue).click();

	}

	public void SelectARoomFromListInSearchResults() {
		String RoomXpath = "//*/td[contains(@class,'cell-check-btn')]";
		int a = driver.findElements(By.xpath(RoomXpath)).size();
		System.out.println("Expand path options " + a);
		List<WebElement> RoomOptions = driver.findElements(By.xpath(RoomXpath));
		Random ran = new Random();
		int randomValue = ran.nextInt(RoomOptions.size());
		Actions actions = new Actions(driver);

		actions.moveToElement(RoomOptions.get(randomValue)).click().perform();

	}

	public void ClickAddSelectionToCart() {

		String AddSelectionToCartXpath = "//*/span[contains(.,'Add selection to cart')]";
		actions.moveToElement(driver.findElement(By.xpath(AddSelectionToCartXpath))).click().perform();

	}

	public void SelectMultipleRoomsSameTypeFromListInSearchResults() throws InterruptedException {
		String Room1Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_1_rbnChooseProduct')]";
		int a = driver.findElements(By.xpath(Room1Xpath)).size();
		System.out.println("Table1 options " + a);

		String Room2Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_2_rbnChooseProduct')]";
		int a1 = driver.findElements(By.xpath(Room2Xpath)).size();
		System.out.println("Table2 options " + a1);

		List<WebElement> listings = driver.findElements(By.xpath(Room1Xpath));

		Random r = new Random();
		int randomValue = r.nextInt(listings.size());

		actions.moveToElement(listings.get(randomValue)).click().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> listings1 = driver.findElements(By.xpath(Room2Xpath));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Room2Xpath)));
		actions.moveToElement(listings1.get(randomValue)).click().perform();

	}

	public void SelectMultipleRoomsDifferentTypeFromListInSearchResults() throws InterruptedException {
		String Room1Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_1_rbnChooseProduct')]";
		int a = driver.findElements(By.xpath(Room1Xpath)).size();
		System.out.println("Table1 options " + a);

		String Room2Xpath = "//*/td[contains(@class,'cell-check-btn')]/*[contains(@id,'_2_rbnChooseProduct')]";
		int a1 = driver.findElements(By.xpath(Room2Xpath)).size();
		System.out.println("Table2 options " + a1);

		List<WebElement> listings = driver.findElements(By.xpath(Room1Xpath));

		Random r = new Random();
		int randomValue = r.nextInt(listings.size());
		int randomValue1 = r.nextInt(listings.size());

		actions.moveToElement(listings.get(randomValue)).click().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		List<WebElement> listings1 = driver.findElements(By.xpath(Room2Xpath));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Room2Xpath)));

		actions.moveToElement(listings1.get(randomValue1)).click().perform();

	}

	public void VerifySuccessWithInfo() {
		String SWinfo = "//a[@id='m_c_C000_m_m_m_c_c5_SearchResultBriefSummaries_rptSearchResultBriefs_0_lnkBriefToggleMoreInformation']/span";
		driver.findElement(By.xpath(SWinfo)).click();
		String text = driver.findElement(By.xpath(
				"//div[@id='m_c_C000_m_m_m_c_c5_SearchResultBriefSummaries_rptSearchResultBriefs_0_rptSummaries_ctl01_Div1']/p"))
				.getText();
		Assert.assertTrue(text.contains("Search not possible:"));

	}

	public void CancellationCondition_Within() throws InterruptedException {
		Thread.sleep(5000);
		int b = 5;

		while (driver
				.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
				.size() < 1 && b > 0) {
			int i = 1;
			System.out.println("In the loop for " + i + " time");

			String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";
			driver.findElement(By.id(DeleteButton)).click();
			Thread.sleep(2000);
			Random r1 = new Random();
			String AddToCartXpath1 = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[11]/div/a";
			List<WebElement> listing1 = driver.findElements(By.xpath(AddToCartXpath1));
			WebDriverWait wait1 = new WebDriverWait(driver, 50);
			int randomValue1 = r1.nextInt(listing1.size());
			wait1.until(ExpectedConditions.elementToBeClickable(listing1.get(randomValue1)));
			listing1.get(randomValue1).click();
			i++;
			b--;
		}

		if (driver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
				.size() < 1) {
			LogLog.error("Couldn't find hotel withi cancellation period in 5 trials");
			driver.findElement(By.id("DeleteButton")).click();
		} else {
			System.out.println("Proper Hotel is selected while in loop");
		}
	}

	public void CancellationCondition_Outside() throws InterruptedException {
		Thread.sleep(2000);
		int b = 5;
		int i = 1;
		while (driver
				.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
				.size() > 0 && b > 0) {

			System.out.println("In the loop for " + i + " time");

			String DeleteButton = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnRemove";
			driver.findElement(By.id(DeleteButton)).click();
			Thread.sleep(2000);
			Random r1 = new Random();
			String AddToCartXpath1 = "//tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[12]/div/a";
			List<WebElement> listing1 = driver.findElements(By.xpath(AddToCartXpath1));
			WebDriverWait wait1 = new WebDriverWait(driver, 50);
			int randomValue1 = r1.nextInt(listing1.size());
			wait1.until(ExpectedConditions.elementToBeClickable(listing1.get(randomValue1)));
			listing1.get(randomValue1).click();
			i++;
			b--;
		}
		if (driver.findElements(By.id("m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning"))
				.size() > 0) {
			LogLog.error("Couldn't find hotel outside cancellation period in 5 trials");
			driver.findElement(By.id("DeleteButton")).click();
		} else {
			System.out.println("Proper Hotel is selected in while loop");
		}

	}

	public void selectCountry(String cn) throws InterruptedException {
		String countryname = cn;
		Country.sendKeys(countryname);
		String capscountry = countryname.toUpperCase();
		List<WebElement> contrydropdownbox = driver.findElements(By.xpath("//div[@class='asmMenuItem']"));
		for (WebElement e : contrydropdownbox) {
			if (e.getAttribute("innerHTML").contains(capscountry)) {
				e.click();
				System.out.println("Clicked element is- " + e.getAttribute("innerHTML") + "|" + e);
				Thread.sleep(3000);
				break;
			}

		}
	}

	// Start date and End date
	public void selectdays(int numberofday) throws InterruptedException {

		LocalDate futureDate = LocalDate.now().plusDays(numberofday);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy");
		String formattedString = futureDate.format(formatter);
		Startdate.sendKeys(Keys.chord(Keys.CONTROL, "a"), formattedString);

		Thread.sleep(3000);
		LocalDate futureEndDate = LocalDate.now().plusDays(numberofday + 1);

		DateTimeFormatter fort = DateTimeFormatter.ofPattern("ddMMMyyyy");
		String formattedString1 = futureDate.format(fort);

		Enddate.sendKeys(Keys.chord(Keys.CONTROL, "a"), formattedString1);

	}
// Below method would add to cart and validate Cancellation charges

	public void addToCart_RebundableHotelRooms() throws InterruptedException {

		List<WebElement> roomNames = driver.findElements(By.xpath("//span[@title='Expand alternate room options']"));
		for (int i = 0; i < roomNames.size(); i++) {
			String names = roomNames.get(i).getAttribute("innerText");
			Matcher m = Pattern.compile("(?m)^(?!.*\\bNon\\b).*").matcher(names);

			while (m.find()) {

				System.out.println(i);
				System.out.println(m.group());
				try {
					Addtocart.get(i).click();
				} catch (Exception e) {

				}
			}

		}

		if (cancellationChargePeriod.size() > 1) {
			Actions actions = new Actions(driver);
			actions.moveToElement(cancelConditionLink).click().build().perform();
			System.out.println("click on Cancellation Terms");
			Thread.sleep(7000);
			WebElement iFrame = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(iFrame);
			WebElement cancellationCharges = driver.findElement(By.xpath("//div[@class='machine-readable']//ul/li[1]"));
			System.out.println(cancellationCharges.getText());

		}

	}

}
