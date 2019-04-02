package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import utilities.TestBase;
import utilities.Login;

public class LoginDefinitions extends TestBase{

	Login login = new Login();
	
	@Given("^User launches the application")
	public void User_launches_the_application() throws Throwable{
		main();
		openUrl();		
	}
		
	@And("^User login with valid credentials")
	public void User_login_with_valid_credentials() throws Throwable{
		login.login();
		CBEDriver.navigate().refresh();
	}
	
}
