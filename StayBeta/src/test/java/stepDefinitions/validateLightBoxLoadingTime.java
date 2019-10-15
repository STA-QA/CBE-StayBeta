package stepDefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.Then;
import pages.Hotel;

public class validateLightBoxLoadingTime extends BaseUtil{

	Hotel Hotel = new Hotel(driver);

	@Then ("Enter (.+) of hotels to capture lightbox loading time$")
	public void Enter_of_hotels_to_capture_lightbox_loading_time (int number) throws InterruptedException {

		Hotel.verifyLightboxLoadingTime(number);
	}

}
