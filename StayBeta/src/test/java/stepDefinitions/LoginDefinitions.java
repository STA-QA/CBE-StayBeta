package stepDefinitions;



import org.testng.annotations.Test;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Login;

public class LoginDefinitions extends BaseUtil {

	Login login = new Login(driver);

	@Given("^User launches the application")
	@Test
	public void User_launches_the_application() throws Throwable {

		driver.navigate().to(login.applicationURL);
		//openUrl();
	}

	@Given("^User launches the au application$")
    public void user_launches_the_au_application() throws Throwable {
		//main();
		//openUrl_au();
    }

	@And("^User login with valid credentials")
	public void User_login_with_valid_credentials() throws Throwable {

		//driver.navigate().refresh();
	}

	@And("^User enters Valid Credentials$")
    public void user_enters_valid_credentials() throws Throwable {
        login.EnterLoginCredentials();
    }

	   @And("^User enters Valid AU Credentials$")
	    public void user_enters_valid_au_credentials() throws Throwable {
	        login.EnterAULoginCredentials();
	    }

	@Then("^User logged into application$")
    public void user_logged_into_application() throws Throwable {
        login.ClickOnLogin();
    }

	@Given("^User clicks On Logout$")
    public void user_clicks_on_logout() throws Throwable {
		Thread.sleep(2000);
       login.ClickOnLogout();
    }

    @Then("^User should be logged out and driver is closed$")
    public void user_should_be_logged_out_and_driver_is_closed() throws Throwable {
       driver.close();

    }


}
