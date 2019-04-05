package CBE.StayBeta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.javafaker.Faker;

import stayBetaInterfaces.Hotel;
import utilities.TestBase;

public class HotelImpl extends TestBase implements Hotel {
	
	Faker faker = new Faker();

	String CityTextBox = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_astLocation_astLocationtbx";
	String From = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckIntbx";
	String To = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ctDatesSelector_dateAndDurationSelector_dtbCheckOuttbx";
	String NumberOfRooms = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRoomCount";
	String AdultId1 = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_bclRooms_";
	String AdultId2 = "_uscPassengers_ddlAdults";
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
	String BookXpath = "//a[@id='m_c_C000_m_c_continueBtn']/span";
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
		String finalpath = a+NoOfRooms+b;		
		
		CBEDriver.findElement(By.xpath(finalpath)).click();
	}

	@Override
	public void SelectNumberOfAdults(String NoOfAdults, int RoomNumber) {
		String NoOfAdultsId = AdultId1 + (RoomNumber - 1) + AdultId2;
		CBEDriver.findElement(By.id(NoOfAdultsId)).sendKeys("0");
		CBEDriver.findElement(By.id(NoOfAdultsId)).sendKeys(NoOfAdults);
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
	}

	@Override
	public void SearchHotel(String SearchText, String HotelName) throws InterruptedException {
		Thread.sleep(8000);
		CBEDriver.findElement(By.xpath(HotelNameSearchXpath)).sendKeys(SearchText);
		CBEDriver.findElement(By.cssSelector(".radius-label > .floating-label")).click();
		Thread.sleep(2000);
		String h1 = "//*/a[contains(.,'";
		String h2 = "')]";
		String hotelxpath = h1+HotelName+h2;
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
		CBEDriver.findElement(By.xpath(OLBAddToCartXpath)).click();
	}

	@Override
	public void ClickOnCompleteBooking() throws InterruptedException {
		Thread.sleep(3000);
	//	CBEDriver.findElement(By.xpath("//*[@id='m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1']/span[2]")).click();
		//CBEDriver.findElement(By.xpath("//*/span[contains(.,'Complete booking')]")).click();
		WebElement element = CBEDriver.findElement(By.xpath("//a[@id='m_c_T000_uscItinSumm_btnContinue_btnContinue1']/span"));
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(element).click().perform();
		
		
	}

	@Override
	public void SelectBookRB() throws InterruptedException {
		Thread.sleep(5000);
		CBEDriver.findElement(By.xpath(BookRadioButton)).click();
		//CBEDriver.findElement(By.xpath("//*[@id='m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/label[1]")).click();
		//*[@id="m_c_T000_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess"]/label[1]
		//CBEDriver.findElement(By.xpath("//div[@id='m_c_C000_m_c_uscItinSumm_itinSummDetails_bclBkCrits_0_uscItm_dtsPendingProcess']/input")).click();

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
	public void ClickOnBook() {

		CBEDriver.findElement(By.xpath(BookXpath)).click();
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
		Thread.sleep(2000);
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
	public void EnterGuestDetails(int Guests) {
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
			CBEDriver.findElement(By.id(BirthYear)).sendKeys("1990");
		}

	}

	@Override
	public void SelectRandomHotel() throws InterruptedException {
		Thread.sleep(2000);
		String TestXpath = "//*/tr[contains(@id,'m_c_C000_m_m_m_c_c8_c8_uscResults_grvRes__')]/td[3]/a";
		/* int count = CBEDriver.findElements(By.xpath(TestXpath)).size();
		  System.out.println("The count is  " + count);*/
		java.util.List<WebElement> listings = CBEDriver.findElements(By.xpath(TestXpath));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size()); // Getting a random value that is between 0 and (list's size)-1
		listings.get(randomValue).click();

	}

	@Override
	public void ClickOnCancelItem() {
		CBEDriver.findElement(By.xpath("//label[contains(.,'Cancel item')]")).click();
	}

	@Override
	public void ClickUpdateButton() {
		String UpdateXpath = "//span[contains(.,'Update')]";
		WebElement element = CBEDriver.findElement(By.xpath(UpdateXpath));
		Actions actions = new Actions(CBEDriver);
		actions.moveToElement(element).click().perform();
	}

	@Override
	public void VerifyQuoteRBIsSelected() {
		boolean a = CBEDriver.findElement(By.id(QuoteId)).isSelected();
		if (a==true) {
			System.out.println("Quote is selected by default");
		}
		else {
			LogLog.error("Quote is not selected By default");
		}
	}

}
