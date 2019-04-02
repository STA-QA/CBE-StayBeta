package utilities;

import org.openqa.selenium.By;

public class Login extends TestBase{

	String Username = "txtLoginUserID";
	String Password = "txtLoginPassword";
	//String LoginButton = "//a[@id='m_c_C000_buttons_btnLogin']/span";
	String LoginButton = "m_c_C000_buttons_btnLogin";
	
	public void login() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("gbzq1");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1srzq1");
		CBEDriver.findElement(By.id(LoginButton)).click();
	}
}
