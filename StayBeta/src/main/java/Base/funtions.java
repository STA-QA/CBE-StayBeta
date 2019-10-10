package Base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class funtions {

	public static String getTourLinkwhichHasDeposit(WebDriver driver) throws InterruptedException {
		String parentWindow = driver.getWindowHandle();

		List<WebElement> list = driver.findElements(By.xpath("//*[@ng-href]"));
		System.out.println("Total windows will be opened" + list.size());
		String tourwithdeposit = null;

		for (WebElement e : list) {
			String link = e.getAttribute("href");
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", e);

		}

		Set<String> winHandles = driver.getWindowHandles();
		for (String handle : winHandles) {

			driver.switchTo().window(handle);

			Thread.sleep(1000);
			if (driver.findElements(By.xpath("//img[@class='b-deposit ']")).size() > 0) {
				tourwithdeposit = driver.getCurrentUrl();
				System.out.println(driver.getCurrentUrl());

				break;
			}
		}
		return tourwithdeposit;

	}

	public static String screenshot(WebDriver driver, long ms) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\screenshot\\" + ms + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		System.out.println("ScreenShot Taken");

		return dest;

	}

	public void Dropdown(WebElement ele, String text) throws InterruptedException {
		ele.click();
		Thread.sleep(4000);
		Select dropdown = new Select(ele);
		dropdown.deselectByVisibleText(text);

	}

}
