package stepDefinitions;

import org.testng.annotations.AfterSuite;

import com.vimalselvam.cucumber.listener.Reporter;

import Base.BaseUtil;
import CBE.StayBeta.RandomDataGenerationImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import utilities.Login;

public class LoginDefinitions extends BaseUtil {

	Login login = new Login();
	RandomDataGenerationImpl general = new RandomDataGenerationImpl();

	@Given("^User launches the application")
	public void User_launches_the_application() throws Throwable {
		 Reporter.addStepLog("User Launches Application");
		openUrl();
	}

	@Given("^User launches the au application$")
    public void user_launches_the_au_application() throws Throwable {
		openUrl_au();
    }
	
	@Given("^User launches the US application$")
    public void user_launches_the_us_application() throws Throwable {
        openUrl_US();
    }

	@Given("^User launches the DE application$")
    public void user_launches_the_de_application() throws Throwable {
        openUrl_DE();
    }
	
	 @Given("^User launches the ZA application$")
	    public void user_launches_the_za_application() throws Throwable {
		 openUrl_ZA();
		 
	    }

	    @And("^User enters Valid ZA Credentials$")
	    public void user_enters_valid_za_credentials() throws Throwable {
	       login.EnterZALoginCredentials();
	    }

    @And("^User enters Valid DE Credentials$")
    public void user_enters_valid_de_credentials() throws Throwable {
        login.EnterDELoginCredentials();
    }
    @And("^User enters Valid US Credentials$")
    public void user_enters_valid_us_credentials() throws Throwable {
        login.EnterUSLoginCredentials();
    }
	
	
	@And("^User enters Valid Credentials$")
    public void user_enters_valid_credentials() throws Throwable {
		 login.EnterLoginCredentials();
    }
	

    @Given("^User launches the prod au application$")
    public void user_launches_the_prod_au_application() throws Throwable {
       openProdUrl_AU();
    }

    @And("^User enters Valid prod AU Credentials$")
    public void user_enters_valid_prod_au_credentials() throws Throwable {
        login.EnterAUProdLoginCredentials();
    }
    
    @Given("^User launches the prod gb application$")
    public void user_launches_the_prod_gb_application() throws Throwable {
       openProdUrl_GB();
    }

    @And("^User enters Valid prod GB Credentials$")
    public void user_enters_valid_prod_gb_credentials() throws Throwable {
        login.EnterGBProdLoginCredentials();
    }

	
	
	   @And("^User enters Valid AU Credentials$")
	    public void user_enters_valid_au_credentials() throws Throwable {
	        login.EnterAULoginCredentials();
	    }
	
	@Then("^User logged into application$")
    public void user_logged_into_application() throws Throwable {
		Reporter.addStepLog("User Logs in into Application");
        login.ClickOnLogin();
    }
	
	@And("^Takes The Screenshot And Add to Report$")
    public void takes_the_screenshot_and_add_to_report() throws Throwable {
		Thread.sleep(10000);		
        general.AddScreenshotToReport();
    }

	@Given("^User clicks On Logout$")
    public void user_clicks_on_logout() throws Throwable {
		Thread.sleep(2000);
       login.ClickOnLogout();
    }

    @Then("^User should be logged out and driver is closed$")
    public void user_should_be_logged_out_and_driver_is_closed() throws Throwable {
       CBEDriver.close();
       
    }
    
    
	
}
