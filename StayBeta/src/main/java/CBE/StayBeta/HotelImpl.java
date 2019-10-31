package CBE.StayBeta;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.github.javafaker.Faker;
import com.google.common.io.Files;

import Base.BaseUtil;
import stayBetaInterfaces.Hotel;

public class HotelImpl extends BaseUtil implements Hotel {

	Faker faker = new Faker();
	Base.funtions functions = new Base.funtions();
	String CityTextBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx";
	String From = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx";
	String To = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckOuttbx";
	String NumberOfRooms = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRoomCount";
	String AdultId1 = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_";
	String AdultId2 = "_uscPassengers_ddlAdults";
	String ChildId1 = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_";
	String ChildId2 = "_uscPassengers_ddlChildren";
	String Children = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlChildren";
	String Infants = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_0_uscPassengers_ddlInfants";
	String ShowExtraSearchOptions = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_btnSearchOptionsExpander";
	String STAyCheckBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSources_cbxDataSource500003";
	String SelectAllCheckbox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscSources_cbxDataSource-1";
	String SearchButton = "m_c_C000_m_m_m_c_btnSearch";
	String ClearForm = "//span[contains(.,'Clear form')]";
	String ExcludeDormBeds = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_chkExcludeDormBeds";
	String SuccessMsgXpath = "//span[contains(.,'Success')]";
	String HotelNameSearchXpath = "//div[@id='dolphin-filters']/div[3]/div/div[2]/input";
	String OLBAddToCartXpath = "//*[contains(@class,'btn-add-to-cart')]";
	String BookRadioButton = "//div[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/input";
	String QuoteId = "m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess_rptAvailableProcesses_ctl01_rbnProcess";
	String CompleteBookingCSS = "#m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1 > .link-center";
	String AcceptTerms = "m_c_C000_m_c_cbxAcceptedConditions";
	String BookXpath = "//a[@id='m_c_C000_m_c_continueBtn']";
	public String Price = "//div[@id='m_c_C000_m_c_ctl14_ctl01_ctl01_bclBkCrits_0_bntItemDetails_0_uscItm_divTotalFare']";
	public String Bookingref = "//div/h4/span[@id='lblFoldNo']";
	String Title = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_namePrefixDdl";
	String FirstName = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_givenNameTbx";
	String LastName = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_surnameTbx";
	String DOBDay = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_birthDateBdbdays";
	String DOBMonth = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_birthDateBdbmonths";
	String DOBYear = "m_c_C000_m_c_paxItmsUsc_bclPax_0_paxItmUsc_birthDateBdbyears";
	String MyBookings = "//div[@id='m_cphHeader_T_CustToolbar_cbeNav_myAccount_divManageBooking']/div/a/div[2]/span";
	String BookingSearch = "//span[contains(.,'Booking search')]";
	String BSBranchCode = "m_c_C001_params_ddlBranchCode_ddVal";
	String BSCreateDateFrom = "m_c_C001_params_dtBookingCreateDateFromtbx";
	String BSCreateDateTo = "m_c_C001_params_dtBookingCreateDateTotbx";
	String BookingSelect = "//a[@id='m_c_C001_results_grdFolders_ctl02_lnkFolderSelect']/span";
	String BookingSearchButton = "//a[@id='m_c_C001_buttons_searchBtn']/span";
	String CompleteAmendBookingCSS = "#m_c_C000_uscItinSumm_btnContinue_btnContinue1 > .link-center";
	String SearchOptionInCart = "//div[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_pmlSearchOptions']/div/a/div[2]/span";
	String AmendThisItem = "//a[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_btnAmend']/span";
	String PopupOK = "//*[contains(@id,'confirm')]/div/div[2]/a[1]/span/span";
	String PopupCancel = "//*[contains(@id,'confirm')]/div/div[2]/a[2]/span/span";
	String detailsbutton = "//div[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_detailsUpd']";
	String priceFilterXpath = "//div[@class='filters--open']//div[@class='price-filter']";

	@Override
	public void SearchCountry(String SearchText, String Country) {
		CBEDriver.findElement(By.id(CityTextBox)).sendKeys(SearchText);
		String CXpath1 = "//span/div/div[@class='asmMenuItem' and contains(.,'";
		String CXpath2 = "')]";
		String CountryXpath = CXpath1 + Country + CXpath2;
		CBEDriver.findElement(By.xpath(CountryXpath)).click();
	}

	@Override
	public void SelectItinery(int NumberOfDays) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, 5);
		String StartDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);

		cal.add(Calendar.DATE, NumberOfDays);
		String EndDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id(To)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);

	}

	@Override
	public void SelectItinerary(int StartDay, int NumberOfDays) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, StartDay);
		String StartDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id(From)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);

		cal.add(Calendar.DATE, NumberOfDays);
		String EndDate = format1.format(cal.getTime());

		CBEDriver.findElement(By.id(To)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);

	}

	@Override
	public void SelectExcludeDormBeds() {
		CBEDriver.findElement(By.id(ExcludeDormBeds)).click();
	}

	@Override
	public void SelectNumberOfRooms(String NoOfRooms) {
		String a = "//select[@id='m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRoomCount']/option[";
		String b = "]";
		String finalpath = a + NoOfRooms + b;

		CBEDriver.findElement(By.xpath(finalpath)).click();
	}

	@Override
	public void SelectNumberOfAdults(String NoOfAdults, int RoomNumber) throws InterruptedException {
		String NoOfAdultsId = AdultId1 + (RoomNumber) + AdultId2;
		Select dropdown = new Select(CBEDriver.findElement(By.id(NoOfAdultsId)));
		dropdown.selectByValue(NoOfAdults);
	}

	@Override
	public void SelectNumberOfChildren(String NoOfChildren, int RoomNumber) throws InterruptedException {
		String NoOfChildsId = ChildId1 + (RoomNumber) + ChildId2;
		WebDriverWait wait = new WebDriverWait(CBEDriver, 10);
		WebElement element = CBEDriver.findElement(By.id(NoOfChildsId));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select dropdown = new Select(element);
		dropdown.selectByValue(NoOfChildren);

	}

	@Override
	public void EnterChildrenAge(int age, int box) {
		List<WebElement> options = CBEDriver.findElements(By.xpath("//*[contains(@id,'_txtAge')]"));
		options.get(box).sendKeys(Integer.toString(age));
	}

	@Override
	public void ExpandExtraSearch() {
		CBEDriver.findElement(By.id(ShowExtraSearchOptions)).click();
	}

	@Override
	public void DeselectAll() {
		Boolean a = CBEDriver.findElement(By.xpath("//input[@value='SelectAll']")).isSelected();
		if (a == true) {
			CBEDriver.findElement(By.id(SelectAllCheckbox)).click();
		} else {
			System.out.println("Select all is already deselected");
		}
	}

	@Override
	public void ExcludeOnRequestRooms() {
		Boolean a = CBEDriver.findElement(By.id("m_c_C000_m_m_m_c_c3_c3_uscSrchParms_cbxIncludeOnRequest"))
				.isSelected();
		if (a == true) {
			CBEDriver.findElement(By.id("m_c_C000_m_m_m_c_c3_c3_uscSrchParms_cbxIncludeOnRequest")).click();
		} else {
			System.out.println("Select all is already deselected");
		}
	}

	@Override
	public void SelectHotelDataSource(String HotelProvider) {
		String HotelXpath1 = "//label[contains(.,'";
		String HotelXpath2 = "')]";
		String HotelXpath = HotelXpath1 + HotelProvider + HotelXpath2;
		Boolean a = CBEDriver.findElement(By.xpath("//input[@value='SelectAll']")).isSelected();
		if (a == true) {
			CBEDriver.findElement(By.id(SelectAllCheckbox)).click();
			CBEDriver.findElement(By.xpath(HotelXpath)).click();
		} else {
			CBEDriver.findElement(By.xpath(HotelXpath)).click();
		}
	}

	@Override
	public void ClickSearch() {
		CBEDriver.findElement(By.id(SearchButton)).click();
		long timerstart = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(CBEDriver, 60);
		WebElement element = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-results-table']")));
		long timerfinish = System.currentTimeMillis();
		long totalTime = timerfinish - timerstart;
		int seconds = (int) ((totalTime / 1000) % 60);
		System.out.println(("Total Time in Seconds to display Search Results:   " + seconds));
		Reporter.addStepLog("Total Time in Seconds to display Search Results:   " + seconds);

	}

	@Override
	public void searchLoadingtime() {
		long timerstart = System.currentTimeMillis();
		Assert.assertTrue(CBEDriver.findElement(By.xpath(priceFilterXpath)).isDisplayed());
		long timerfinish = System.currentTimeMillis();
		long totalTime = timerfinish - timerstart;
		int seconds = (int) ((totalTime / 1000) % 60);
		System.out.println(("Total Time in Seconds to display Search Results:   " + seconds));
		Reporter.addStepLog("Total Time in Seconds to display Search Results:   " + seconds);

	}

	@Override
	public void SearchHotel(String SearchText, String HotelName) throws InterruptedException {
		Thread.sleep(8000);
		
		/*
		 * CBEDriver.findElement(By.xpath(HotelNameSearchXpath)).sendKeys(SearchText);
		 * CBEDriver.findElement(By.cssSelector(".radius-label > .floating-label")).
		 * click();
		 */
		 
		Thread.sleep(2000);
		String h1 = "//td[3]/a[contains(.,'";
		String h2 = "')]";
		String hotelxpath = h1 + HotelName + h2;
		CBEDriver.findElement(By.xpath(hotelxpath)).click();

	}

	@Override
	public void CountResultsWithoutAnyParticularHotelSearch() {
		// Take the count from string which says x matches found
	}

	@Override
	public void CountResultsWithParticularHotelTextSearch(String SearchText) {
		// Take the count from string which says x matches found
	}

	@Override
	public void ClickAddToCart() throws InterruptedException {
		Thread.sleep(2000);
		CBEDriver.switchTo().frame(0);
		Thread.sleep(4000);
		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath("//*/span[contains(.,'Overview')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Overview Tab is not displayed");
		}

		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath("//*/span[contains(.,'Photos')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Photos Tab is not displayed");
		}

		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath("//*/span[contains(.,'Map')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Map Tab is not displayed");
		}

		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath("//*/span[contains(.,'Room selection')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Room selection Tab is not displayed");
		}

		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath("//*/span[contains(.,'Rate/Room info')]")).isDisplayed());
		} catch (AssertionError e) {
			LogLog.error("Rate/Room info Tab is not displayed");
		}

		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath("//*/span[contains(.,'Cancellations')]")).isDisplayed());
			CBEDriver.findElement(By.xpath("//*/span[contains(.,'Cancellations')]")).click();
			Thread.sleep(2000);
			File src = ((TakesScreenshot) CBEDriver).getScreenshotAs(OutputType.FILE);
			try {
				// now copy the screenshot to desired location using copyFile //method
				Files.copy(src, new File("C:\\CBE-Automation\\StayBeta\\Screenshots\\Cancellations.png"));
			}

			catch (IOException e) {
				System.out.println(e.getMessage());

			}
			CBEDriver.getPageSource().contains("split commission");
		} catch (AssertionError e) {
			LogLog.error("Error with Cancellation tab or the split commission in the tab");
		}

		CBEDriver.findElement(By.xpath(OLBAddToCartXpath)).click();
	}

	@Override
	public void ClickOnCompleteBooking() throws InterruptedException {
		Thread.sleep(3000);

		WebElement element = CBEDriver.findElement(By.xpath("//span[contains(text(),'Complete booking')]"));
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(element).click().perform();

	}

	@Override
	public void SelectBookRB() throws InterruptedException {
		Thread.sleep(5000);
		CBEDriver.findElement(By.xpath(BookRadioButton)).click();
		// CBEDriver.findElement(By.xpath("//*[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/label[1]")).click();
		// *[@id="m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess"]/label[1]
		// CBEDriver.findElement(By.xpath("//div[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/input")).click();

	}

	@Override
	public void EnterPersonDetails() {
		CBEDriver.findElement(By.id(Title)).sendKeys("Mr");
		CBEDriver.findElement(By.id(FirstName)).sendKeys("FirstTest");
		CBEDriver.findElement(By.id(LastName)).sendKeys("LastTest");
		CBEDriver.findElement(By.id(DOBDay)).sendKeys("29");
		CBEDriver.findElement(By.id(DOBMonth)).sendKeys("Mar");
		CBEDriver.findElement(By.id(DOBYear)).sendKeys("1990");
	}

	@Override
	public void AcceptTermsAndConditions() {
		WebElement element = CBEDriver.findElement(By.id(AcceptTerms));
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(element).click().perform();
	}

	@Override
	public void ClickOnBook() throws IOException {
		CBEDriver.findElement(By.xpath(BookXpath)).click();
	}

	@Override
	public void bookingConfirmation() throws IOException {
		CBEDriver.findElement(By.xpath(Price)).click();
		String bookingrefnumber = CBEDriver.findElement(By.xpath(Bookingref)).getAttribute("innerHTML");

		Reporter.addStepLog(bookingrefnumber);
		String screenShotPath = BaseUtil.screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);
	}

	@Override
	public void ClickMyBookings() {
		CBEDriver.findElement(By.xpath(MyBookings)).click();
	}

	@Override
	public void SelectBookingSearch() {
		CBEDriver.findElement(By.xpath(BookingSearch)).click();
	}

	@Override
	public void EnterBookingSearchCriteria() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("ddMMMyy");
		cal.add(Calendar.DATE, -1);
		String StartDate = format1.format(cal.getTime());
		CBEDriver.findElement(By.id(BSCreateDateFrom)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), StartDate);
		cal.add(Calendar.DATE, 1);
		String EndDate = format1.format(cal.getTime());
		CBEDriver.findElement(By.id(BSCreateDateTo)).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), EndDate);

	}

	@Override
	public void ClickBookingSearch() throws InterruptedException {
		CBEDriver.findElement(By.xpath(BookingSearchButton)).click();
		Thread.sleep(3000);
	}

	@Override
	public void SelectBookingFromList() {
		String Record = "//a[contains(@id,'m_c_C001_results_grdFolders_ct')]/span[contains(.,'Select')]";
		// int count = CBEDriver.findElements(By.xpath(Record)).size();
		// System.out.println("The count is " + count);
		java.util.List<WebElement> listins = CBEDriver.findElements(By.xpath(Record));
		Random r = new Random();
		int randomValue = r.nextInt(listins.size());
		System.out.println("listings: " + listins);
		System.out.println("random value is: " + randomValue);
		listins.get(randomValue).click();

	}

	@Override
	public void ClickOnAmendCompleteBooking() throws InterruptedException {
		Thread.sleep(2000);
		// CBEDriver.findElement(By.cssSelector(CompleteAmendBookingCSS)).click();
		CBEDriver.findElement(By.xpath("//span[contains(.,'Complete booking')]")).click();
	}

	@Override
	public void SearchOptionInCart() {
		CBEDriver.findElement(By.xpath(SearchOptionInCart)).click();
	}

	@Override
	public void SelectAmendThisItem() throws InterruptedException {
		Thread.sleep(4000);
		CBEDriver.findElement(By.xpath(SearchOptionInCart)).click();
		Thread.sleep(2000);
		CBEDriver.findElement(By.xpath(AmendThisItem)).click();
		Thread.sleep(3000);
	}

	@Override
	public void AcceptThePopup() throws InterruptedException {
		CBEDriver.switchTo().activeElement();
		Thread.sleep(2000);
		CBEDriver.findElement(By.xpath(PopupOK)).click();
		Thread.sleep(1000);

	}

	@Override
	public void EnterGuestDetails(int Guests) throws InterruptedException {
		// String Common = "";
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
			CBEDriver.findElement(By.id(Title)).sendKeys("M");
			CBEDriver.findElement(By.id(FNpath)).sendKeys(firstName);
			CBEDriver.findElement(By.id(LNpath)).sendKeys(lastName);
			java.util.List<WebElement> options = CBEDriver.findElements(By.id(BirthMonth));
			Random rand = new Random();
			int list = rand.nextInt(options.size());
			options.get(list).click();
			java.util.List<WebElement> options1 = CBEDriver.findElements(By.id(BirthDay));
			// Random rand = new Random();
			int list1 = rand.nextInt(options.size());
			options.get(list1).click();
			Thread.sleep(1000);
			CBEDriver.findElement(By.id(BirthDay)).sendKeys("10");
			Thread.sleep(1000);
			CBEDriver.findElement(By.id(BirthMonth)).sendKeys("MAR");
			Thread.sleep(1000);
			CBEDriver.findElement(By.id(BirthYear)).sendKeys("1990");

		}

	}

	@Override
	public void SelectRandomHotel() throws InterruptedException {
		Thread.sleep(2000);
		String TestXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[3]/a";
		java.util.List<WebElement> listings = CBEDriver.findElements(By.xpath(TestXpath));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size());

		listings.get(randomValue).click();

	}

	@Override
	public void ClickOnCancelItem() {
		CBEDriver.findElement(By.xpath("//label[contains(.,'Cancel item')]")).click();
	}

	@Override
	public void addToCart_RefundableHotelRooms() throws InterruptedException {
		Thread.sleep(4000);

		List<WebElement> roomNames = CBEDriver.findElements(By.xpath("//span[@title='Expand alternate room options']"));
		for (int i = 0; i < roomNames.size(); i++) {

			String names = roomNames.get(i).getAttribute("innerText");
			String NonrefundText = "Non Refundable";
			if (!names.contains(NonrefundText)) {
				List<WebElement> Addtocart = CBEDriver
						.findElements(By.xpath("//a[@class='primary-button cart-button']"));
				System.out.println("----" + roomNames.get(i) + names);
				JavascriptExecutor executor = (JavascriptExecutor) CBEDriver;
				executor.executeScript("arguments[0].click();", Addtocart.get(i));
				// clickbyJS(Addtocart.get(i));
				// Addtocart.get(i).click();
				break;
			}

		}

		WebElement hotelsummary = CBEDriver.findElement(By.xpath("//div[@class='summary-details']"));

		Thread.sleep(7000);
		System.out.println("Hotel added to cart is "
				+ CBEDriver.findElement(By.xpath("//span[@class='product-details-label']")).getText());
		List<WebElement> cancellationChargePeriod = CBEDriver.findElements(
				By.xpath("//*[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_lblCanxPeriodWarning']/p"));
		System.out.println(" " + cancellationChargePeriod.size());

		if (cancellationChargePeriod.size() <= 0) {
			// Actions actions = new Actions(driver);
			// actions.moveToElement(cancelConditionLink).click().build().perform();
			WebElement cancelConditionLink = CBEDriver
					.findElement(By.xpath("//div/a[@class='lightbox-link lightbox-new cboxElement']"));
			JavascriptExecutor executor = (JavascriptExecutor) CBEDriver;
			executor.executeScript("arguments[0].click();", cancelConditionLink);

			System.out.println("click on Cancellation Terms");
			WebDriverWait wait = new WebDriverWait(CBEDriver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.tagName("iframe"))));

			WebElement iFrame = CBEDriver.findElement(By.tagName("iframe"));
			CBEDriver.switchTo().frame(iFrame);

			WebElement cancellationCharges = CBEDriver
					.findElement(By.xpath("//div[@class='machine-readable']//ul/li[1]"));
			System.out.println(cancellationCharges.getText());
			String ActualCancellationCharges = cancellationCharges.getText();
			String ExpectedCallationCharges = "no charge";

			if (ActualCancellationCharges.toLowerCase().indexOf(ExpectedCallationCharges.toLowerCase()) != -1) {

				System.out.println("No Charge if cancelled displayed");

			} else {

				System.out.println("Hotel would charge if cancelled");

			}
			WebElement popupclose = CBEDriver.findElement(By.xpath("//div/a[@class='close']"));
			popupclose.click();

			CBEDriver.switchTo().defaultContent();
		}
	}

	public void confirmBooking() throws InterruptedException, IOException {
		WebElement TermsandconditionsBooking = CBEDriver
				.findElement(By.xpath("//div/input[@id='m_c_C000_m_c_cbxAcceptedConditions']"));
		waitandclick(TermsandconditionsBooking);
		WebElement Savebutton = CBEDriver.findElement(By.xpath("//div/a[@id='m_c_C000_m_c_continueBtn']"));
		waitandclick(Savebutton);
		// public String Price =
		// "//div[@id='m_c_C000_m_c_ctl14_ctl01_ctl01_bclBkCrits_0_bntItemDetails_0_uscItm_divTotalFare']";
		// public String Bookingref = "//div/h4/span[@id='lblFoldNo']";
		CBEDriver.findElement(By.xpath(Price)).click();
		String bookingrefnumber = CBEDriver.findElement(By.xpath(Bookingref)).getAttribute("innerHTML");

		Reporter.addStepLog(bookingrefnumber);
		String screenShotPath = BaseUtil.screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);

	}

	public void bookprocessbooking() throws InterruptedException, IOException {

		WebElement bookingprocessRadiobutton = CBEDriver.findElement(By.xpath(
				"//input[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess_rptAvailableProcesses_ctl00_rbnProcess']"));
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(bookingprocessRadiobutton).click().build().perform();
		WebElement CompleteBookingButton = CBEDriver
				.findElement(By.xpath("//div/a[@id='m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1']"));
		waitandclick(CompleteBookingButton);
	}

	public void quotebooking() throws InterruptedException, IOException {
		WebElement CompleteBookingButton = CBEDriver
				.findElement(By.xpath("//div/a[@id='m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1']"));
		waitandclick(CompleteBookingButton);
		Thread.sleep(3000);

	}

	public void waitandclick(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) CBEDriver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		new WebDriverWait(CBEDriver, 60).until(ExpectedConditions.visibilityOf(element));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		js.executeScript("arguments[0].click();", element);

	}

	@Override
	public void ClickUpdateButton() {
		String UpdateXpath = "//span[contains(.,'Update')]";
		WebElement element = CBEDriver.findElement(By.xpath(UpdateXpath));
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(element).click().perform();

	}

	public void getAmendedRefnumber() throws InterruptedException, IOException {
		Thread.sleep(6000);
		waitForPageLoaded();
		WebElement updatedBookingRefnumber = CBEDriver.findElement(By.xpath("(//div/div/h4)[1]"));
		System.out.println(updatedBookingRefnumber.getText());
		Reporter.addStepLog(updatedBookingRefnumber.getText());
		String screenShotPath = BaseUtil.screenshot(CBEDriver, System.currentTimeMillis());
		Reporter.addScreenCaptureFromPath(screenShotPath);
		String verifySuccessmessage = updatedBookingRefnumber.getText();
		assertTrue(verifySuccessmessage.contains("UPDATE WAS SUCCESSFUL"));

	}


	public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    @Override
					public Boolean apply(WebDriver CBEDriver) {
                        return ((JavascriptExecutor) CBEDriver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(CBEDriver, 60);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

	@Override
	public void VerifyQuoteRBIsSelected() {
		boolean a = CBEDriver.findElement(By.id(QuoteId)).isSelected();
		if (a == true) {
			System.out.println("Quote is selected by default");
		} else {
			LogLog.error("Quote is not selected By default");
		}
	}

	@Override
	public void EnterAdultDetails(int Adults) throws InterruptedException {
		String Common = "m_c_C000_m_c_paxItmsUsc_bclPax_";
		String Title1 = "_paxItmUsc_namePrefixDdl";
		String idFN1 = "_paxItmUsc_givenNameTbx";
		String idLN1 = "_paxItmUsc_surnameTbx";
		String idBD1 = "_paxItmUsc_birthDateBdbdays";
		String idBM1 = "_paxItmUsc_birthDateBdbmonths";
		String idBY1 = "_paxItmUsc_birthDateBdbyears";
		int i = Adults;
		// for (int i = 0; i < Adults; i++) {
		String firstName = faker.name().firstName().replaceAll("[^a-zA-Z]+", "");
		String lastName = faker.name().lastName().replaceAll("[^a-zA-Z]+", "");
		String Title = Common + i + Title1;
		String FNpath = Common + i + idFN1;
		String LNpath = Common + i + idLN1;
		String BirthDay = Common + i + idBD1;
		String BirthMonth = Common + i + idBM1;
		String BirthYear = Common + i + idBY1;
		CBEDriver.findElement(By.id(Title)).sendKeys("M");
		CBEDriver.findElement(By.id(FNpath)).sendKeys(firstName);
		CBEDriver.findElement(By.id(LNpath)).sendKeys("TestAutomation");
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthDay)).sendKeys("10");
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthMonth)).sendKeys("MAR");
		Thread.sleep(1000);

		CBEDriver.findElement(By.id(BirthYear)).sendKeys("1990");

	}

	public void EnterAdultDetailsForExpedia(int Adults) throws InterruptedException {
		String Common = "m_c_C000_m_c_paxItmsUsc_bclPax_";
		String Title1 = "_paxItmUsc_namePrefixDdl";
		String idFN1 = "_paxItmUsc_givenNameTbx";
		String idLN1 = "_paxItmUsc_surnameTbx";
		String idBD1 = "_paxItmUsc_birthDateBdbdays";
		String idBM1 = "_paxItmUsc_birthDateBdbmonths";
		String idBY1 = "_paxItmUsc_birthDateBdbyears";
		int i = Adults;

		String Title = Common + i + Title1;
		String FNpath = Common + i + idFN1;
		String LNpath = Common + i + idLN1;
		String BirthDay = Common + i + idBD1;
		String BirthMonth = Common + i + idBM1;
		String BirthYear = Common + i + idBY1;
		
		String Name[] = {"One","Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		CBEDriver.findElement(By.id(Title)).sendKeys("M");

		CBEDriver.findElement(By.id(FNpath)).sendKeys("Test Booking"+Name[i]);
		CBEDriver.findElement(By.id(LNpath)).sendKeys("Test Booking");
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthDay)).sendKeys("10");
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthMonth)).sendKeys("MAR");
		Thread.sleep(1000);

		CBEDriver.findElement(By.id(BirthYear)).sendKeys("1990");

	}

	// @Override
	public void EnterChildrenDetails(int index, int ChildrenAge) throws InterruptedException {
		String Common = "m_c_C000_m_c_paxItmsUsc_bclPax_";
		String Title1 = "_paxItmUsc_namePrefixDdl";
		String idFN1 = "_paxItmUsc_givenNameTbx";
		String idLN1 = "_paxItmUsc_surnameTbx";
		String idBD1 = "_paxItmUsc_birthDateBdbdays";
		String idBM1 = "_paxItmUsc_birthDateBdbmonths";
		String idBY1 = "_paxItmUsc_birthDateBdbyears";
	
		int j = 0;
		int i = index;
		// for (int i = children; i < total; i++) {
		String firstName = faker.name().firstName().replaceAll("[^a-zA-Z]+", "");
		String lastName = faker.name().lastName().replaceAll("[^a-zA-Z]+", "");
		String Title = Common + i + Title1;
		String FNpath = Common + i + idFN1;
		String LNpath = Common + i + idLN1;
		String BirthDay = Common + i + idBD1;
		String BirthMonth = Common + i + idBM1;
		String BirthYear = Common + i + idBY1;
		CBEDriver.findElement(By.id(Title)).sendKeys("M");
		CBEDriver.findElement(By.id(FNpath)).sendKeys(firstName);
		CBEDriver.findElement(By.id(LNpath)).sendKeys("TestAutomation");
		Thread.sleep(1000);

		LocalDate today = LocalDate.now();
		int year = today.getYear() - ChildrenAge;
		Month month = today.getMonth();
		String mon = month.toString().substring(0, 3);
		int day = today.getDayOfMonth();
		System.out.println(mon);
		System.out.println(day);
		System.out.println(year - 5);

		CBEDriver.findElement(By.id(BirthDay)).sendKeys(Integer.toString(day));
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthMonth)).sendKeys(mon);
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthYear)).sendKeys(Integer.toString(year));
		j++;

		// }

	}

	public void EnterChildrenDetailsForExpedia(int index, int ChildrenAge) throws InterruptedException {
		String Common = "m_c_C000_m_c_paxItmsUsc_bclPax_";
		String Title1 = "_paxItmUsc_namePrefixDdl";
		String idFN1 = "_paxItmUsc_givenNameTbx";
		String idLN1 = "_paxItmUsc_surnameTbx";
		String idBD1 = "_paxItmUsc_birthDateBdbdays";
		String idBM1 = "_paxItmUsc_birthDateBdbmonths";
		String idBY1 = "_paxItmUsc_birthDateBdbyears";

		int j = 0;
		int i = index;
		// for (int i = children; i < total; i++) {
		String Title = Common + i + Title1;
		String FNpath = Common + i + idFN1;
		String LNpath = Common + i + idLN1;
		String BirthDay = Common + i + idBD1;
		String BirthMonth = Common + i + idBM1;
		String BirthYear = Common + i + idBY1;
		String Name[] = {"One","Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		CBEDriver.findElement(By.id(Title)).sendKeys("M");
		CBEDriver.findElement(By.id(FNpath)).sendKeys("TestBooking"+Name[i]);
		CBEDriver.findElement(By.id(LNpath)).sendKeys("Test Booking");
		Thread.sleep(1000);

		LocalDate today = LocalDate.now();
		int year = today.getYear() - ChildrenAge;
		Month month = today.getMonth();
		String mon = month.toString().substring(0, 3);
		int day = today.getDayOfMonth();
		System.out.println(mon);
		System.out.println(day);
		System.out.println(year - 5);

		CBEDriver.findElement(By.id(BirthDay)).sendKeys(Integer.toString(day));
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthMonth)).sendKeys(mon);
		Thread.sleep(1000);
		CBEDriver.findElement(By.id(BirthYear)).sendKeys(Integer.toString(year));
		j++;

		// }

	}

	@Test
	public void eneterBookingref() throws Exception {
		WebElement Bookingrefxpath = CBEDriver.findElement(
				By.xpath("//div/input[@name='m$cphHeader$T_CustToolbar$cbeNav$myAccount$txtBookingNumber']"));
		List<String> getnumber = functions.readCSVdata(0);
		String number = String.join("", getnumber);
		Bookingrefxpath.sendKeys(number);
		// String number = listString.replaceAll("\\D+","");
		System.out.println("Booking Ref entred is : " + number);
		WebElement okayButton = CBEDriver.findElement(
				By.xpath("//*[@id='m_cphHeader_T_CustToolbar_cbeNav_myAccount_btnRetrieveBooking']/span[1]"));
		okayButton.click();
	}

	

	@Override
	public void ClickOnSearchDropDownInCart() throws Exception {
		CBEDriver.findElement(By.xpath(SearchOptionInCart)).click();
		Thread.sleep(4000);
		CBEDriver.findElement(By.xpath("//*/span[contains(.,'Search for Transfers...')]")).click();
		Thread.sleep(4000);
	}

	public void amenedAdultdetails() {

		List<WebElement> newTextfield = CBEDriver
				.findElements(By.xpath("//div/input[(@class='text') and not (@disabled='disabled')]"));

		if (newTextfield.size() > 1) {
			WebElement passengerdetailsForms = CBEDriver
					.findElement(By.xpath("//div[@class='passenger-list input-panel']"));
			passengerdetailsForms
					.findElement(By.xpath("//div/select[(@class='auto') and not (@disabled='disabled')]/option[3]"))
					.click();
			// Select Title from dropdown
			List<WebElement> title = passengerdetailsForms
					.findElements(By.xpath("//div/select[(@class='auto') and not (@disabled='disabled')]"));

			for (int i = 0; i < title.size(); i++) {
				try {
					title.get(i).click();
					passengerdetailsForms
							.findElement(
									By.xpath("//div/select[(@class='auto') and not (@disabled='disabled')]/option[3]"))
							.click();
				} catch (Exception e) {
					System.out.println("Title Dropdown" + e);
				}

			}
			// Enter Firstname and Lastname
			List<WebElement> firstname = passengerdetailsForms
					.findElements(By.xpath("//div/input[(@class='text') and not (@disabled='disabled')]"));
			try {
				for (int i = 1; i < firstname.size(); i++) {
					System.out.println("Entered Passenger Names: ");
					firstname.get(i).sendKeys("Test Booking");
				}
			} catch (Exception e) {
				System.out.println("Names TextFeild" + e);
			}

			// Select Day from DOB DropDrown
			List<WebElement> day = passengerdetailsForms
					.findElements(By.xpath("(//div/select[(@class='dob') and not (@disabled='disabled')])[1]"));
			try {
				for (int i = 0; i < day.size(); i++) {

					passengerdetailsForms
							.findElement(By.xpath(
									"(//div/select[(@class='dob') and not (@disabled='disabled')])[1]/option[13]"))
							.click();

				}
			} catch (Exception e) {
				System.out.println("Day Dropdown" + e);
			}

			// Select Month from DOB DropDrown
			List<WebElement> month = passengerdetailsForms
					.findElements(By.xpath("(//div/select[(@class='dob') and not (@disabled='disabled')])[2]"));
			try {
				for (int i = 0; i < month.size(); i++) {
					passengerdetailsForms
							.findElement(By.xpath(
									"(//div/select[(@class='dob') and not (@disabled='disabled')])[2]/option[4]"))
							.click();

				}
			} catch (Exception e) {
				System.out.println("Month Dropdown" + e);
			}

			// Select Year from DOB DropDrown
			List<WebElement> year = passengerdetailsForms
					.findElements(By.xpath("//div/select[(@class='dob year') and not (@disabled='disabled')]"));
			try {
				for (int i = 0; i < year.size(); i++) {
					passengerdetailsForms
							.findElement(
									By.xpath("//div/select[(@class='year') and not (@disabled='disabled')]/option[15]"))
							.click();

				}
			} catch (Exception e) {
				System.out.println("Title Dropdown" + e);
			}
		} else {
			Reporter.addStepLog("No New Passenger row displayed hence skipping this Step");
		}
	}

}
