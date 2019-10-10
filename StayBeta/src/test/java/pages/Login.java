package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.BaseUtil;

public class Login extends BaseUtil {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String Username = "txtLoginUserID";
	public String Password = "txtLoginPassword";
	public String LoginButton = "m_c_C000_buttons_btnLogin";
	public String LogOut = "//*[@id=\"m_cphHeader_T_CustToolbar_cbeNav_btnLogOut\"]";
	public String applicationURL = "http://staybeta.bluee.net/login?username=staycbegbcbg&password=cbeuser";


	public void EnterLoginCredentials() {
		driver.findElement(By.id(Username)).clear();
		driver.findElement(By.id(Username)).sendKeys("gbzq3");
		driver.findElement(By.id(Password)).clear();
		driver.findElement(By.id(Password)).sendKeys("1srzq3");
	}

	public void EnterAULoginCredentials() {
		driver.findElement(By.id(Username)).clear();
		driver.findElement(By.id(Username)).sendKeys("auzq3");
		driver.findElement(By.id(Password)).clear();
		driver.findElement(By.id(Password)).sendKeys("1srzq3");
	}

	public void ClickOnLogin() {
		driver.findElement(By.id(LoginButton)).click();
	}

	public void ClickOnLogout() throws InterruptedException {
		driver.findElement(By.xpath(LogOut)).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*/span[contains(.,'OK')]")).click();
		Thread.sleep(1000);
	}



}
