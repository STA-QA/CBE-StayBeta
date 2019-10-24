package stayBetaInterfaces;

import java.util.List;
import java.util.Random;

import org.apache.log4j.helpers.LogLog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface ActAndDayTripsSearch {

	public void EnterStartDates(int StartBetween, int StartTill);
	
	public void ClickOnRandomCheckAvailability();
	
	public void SelectNoOfAdults();
	
	public void ClickOnBookRadioButton();
	
	public void ClickOnBookButton();
	
	public void CancellationConditionForDayTrips_Outside() throws Exception;
	

}
