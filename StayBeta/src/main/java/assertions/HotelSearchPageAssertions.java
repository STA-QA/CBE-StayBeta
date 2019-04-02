package assertions;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import utilities.TestBase;

public class HotelSearchPageAssertions extends TestBase {
	String DataSourceSelectAll = "";
	String ParticularDataSource = "";
	String DataSourceXpath1 = "//label[contains(.,'";
	String DataSourceXpath2 = "')]";
	String DSCheckBoxXpath1 ="//input[@value='";
	String DSCheckBoxXpath2 ="']";

	SoftAssert sa= new SoftAssert();
	
	public void DataSourceDisplayAssertion(String DataSource) {
		String DataSourceXpath = DataSourceXpath1 + DataSource + DataSourceXpath2;

		try {
			Assert.assertTrue(CBEDriver.findElement(By.xpath(DataSourceXpath)).isDisplayed(),
					DataSource + " is displayed in the Data Source list");
		} 
		catch (Exception e) {
			LogLog.error(DataSource + "is not displayed in the list");
		}
		
	}

	public void DataSourceSelectedByDefault(String DataSourceValue) throws AssertionError {
		String DSCheckboxXpath = DSCheckBoxXpath1+DataSourceValue+DSCheckBoxXpath2;
		try {			
			Assert.assertTrue(CBEDriver.findElement(By.xpath(DSCheckboxXpath)).isSelected(),
					DataSourceValue + " is not selected by Default");		
		}catch (AssertionError e) {
			LogLog.error(DataSourceValue + "A data Source checkbox Assertion Failed  " +  e);
		}
		catch(Throwable t) {
			LogLog.error(DataSourceValue + "A data Source checkbox Assertion Failed  " +  t);
		}
		
	}
	
	
	
}
