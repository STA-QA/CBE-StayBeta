package utilities;

import org.openqa.selenium.By;

import com.vimalselvam.cucumber.listener.Reporter;

import Base.BaseUtil;

public class Login extends BaseUtil {

	String Username = "txtLoginUserID";
	String Password = "txtLoginPassword";
	String LoginButton = "m_c_C000_buttons_btnLogin";
	String LogOut = "//*[@id=\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\"]";

	public void EnterLoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("gbzq5");
		 Reporter.addStepLog("User Name gbzq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1srzq5");
		Reporter.addStepLog("User Password 1srzq5");
	}


	public void EnterUSLoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("uszq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1srzq5");
	}

	public void EnterAULoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("auzq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1srzq5");
	}


	public void EnterDELoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("dezq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1srzq5");
	}

	public void EnterZALoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("zazq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1srzq5");
	}

	public void ClickOnLogin() {
		CBEDriver.findElement(By.id(LoginButton)).click();
	}

	public void ClickOnLogout() throws InterruptedException {
		CBEDriver.findElement(By.xpath(LogOut)).click();
		Thread.sleep(2000);
		CBEDriver.switchTo().activeElement();
		Thread.sleep(3000);
		CBEDriver.findElement(By.xpath("//*/span[contains(.,'OK')]")).click();
		Thread.sleep(1000);
	}
	
	
	public void EnterGBProdLoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("GBAUT");
		 Reporter.addStepLog("User Name gbzq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1sraut");
		Reporter.addStepLog("User Password 1srzq5");
	}

	public void EnterAUProdLoginCredentials() {
		CBEDriver.findElement(By.id(Username)).clear();
		CBEDriver.findElement(By.id(Username)).sendKeys("AUAUT");
		 Reporter.addStepLog("User Name gbzq5");
		CBEDriver.findElement(By.id(Password)).clear();
		CBEDriver.findElement(By.id(Password)).sendKeys("1sraut");
		Reporter.addStepLog("User Password 1srzq5");
	}

}
