package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseUtil;

public class Insurance extends BaseUtil {

	public Insurance(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_ddlRegionCode")
	public WebElement RegionDropDown;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscPassengers_bclAdults_0_birthDateBdbdays")
	public WebElement Date_DOB;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscPassengers_bclAdults_0_birthDateBdbmonths")
	public WebElement Month_DOB;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_c3_c3_uscSrchParms_uscPassengers_bclAdults_0_birthDateBdbyears")
	public WebElement Year_DOB;

	@FindBy(how = How.ID, using = "m_c_C000_m_m_m_c_btnSearch")
	public WebElement Search;

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Add to cart')]")
	public List<WebElement> AddToCart;

	@FindBy(how = How.ID, using = "m_c_T000_uscItinSumm_itinSummDetails_btnContinue_btnContinue1")
	public WebElement CompleteBooking;

	public void SelectRegion(String Region) {
		RegionDropDown.sendKeys(Region);

	}

	public void selectTheDOB() {
		Date_DOB.sendKeys("7");
		Month_DOB.sendKeys("Aug");
		Year_DOB.sendKeys("1990");

	}

	public void SelectInsuranceType(String InsuranceType) {


	}

	public void ClickInsuranceSearch() {

		Search.click();

	}

	public void AddInsuranceToCart() {
		Random r = new Random();
		int randomValue = r.nextInt(AddToCart.size());

		AddToCart.get(randomValue).click();

	}

	public void CompleteInsuranceBooking() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(CompleteBooking));
		CompleteBooking.click();

	}

}
