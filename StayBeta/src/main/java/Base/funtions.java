package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

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
		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(),"PNG",new File("./Reports/Screenshots_Fail/" + ms + ".png"));


		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String dest = "Screenshots_Fail/" + ms + ".png";

		File destination = new File(dest);
		//FileUtils.copyFile(source, destination);
		System.out.println("ScreenShot Taken");

		return dest;

	}



	public void Dropdown(WebElement ele, String text) throws InterruptedException {
		ele.click();
		Thread.sleep(4000);
		Select dropdown = new Select(ele);
		dropdown.deselectByVisibleText(text);

	}


	public void sendDatatoCSVfile(String datatostore) {

		String path = System.getProperty("user.dir");
		String testdatapath = path + "\\src\\Testdata\\Bookingconfirmation.csv";

		try (PrintWriter writer = new PrintWriter(new File(testdatapath))) {
			StringBuilder sb = new StringBuilder();

			sb.append(datatostore);
			sb.append(',');
			sb.append('\n');

			writer.write(sb.toString());

			System.out.println("Refrence number stored in CSV file done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}



	private static final char DEFAULT_SEPARATOR = ',';
	private static final char DEFAULT_QUOTE = '"';

	public List<String> readCSVdata(int index) throws Exception {
		List<String> line = null;
		String path = System.getProperty("user.dir");
		String csvFile = path + "\\src\\Testdata\\Bookingconfirmation.csv";
		File file = new File(csvFile);
	    System.out.println(file.exists());
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			 line = parseLine(scanner.nextLine());
			System.out.println(line.get(index));
			// System.out.println(line.get(1));
			// System.out.println(line.get(2));
			break;
		}
		scanner.close();
        return line;
	}

	public static List<String> parseLine(String cvsLine) {
		return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
	}

	public static List<String> parseLine(String cvsLine, char separators) {
		return parseLine(cvsLine, separators, DEFAULT_QUOTE);
	}

	public static List<String> parseLine(String cvsLine, char separators, char customQuote) {

		List<String> result = new ArrayList<>();

		if (cvsLine == null && cvsLine.isEmpty()) {
			return result;
		}

		if (customQuote == ' ') {
			customQuote = DEFAULT_QUOTE;
		}

		if (separators == ' ') {
			separators = DEFAULT_SEPARATOR;
		}

		StringBuffer curVal = new StringBuffer();
		boolean inQuotes = false;
		boolean startCollectChar = false;
		boolean doubleQuotesInColumn = false;

		char[] chars = cvsLine.toCharArray();

		for (char ch : chars) {

			if (inQuotes) {
				startCollectChar = true;
				if (ch == customQuote) {
					inQuotes = false;
					doubleQuotesInColumn = false;
				} else {

					if (ch == '\"') {
						if (!doubleQuotesInColumn) {
							curVal.append(ch);
							doubleQuotesInColumn = true;
						}
					} else {
						curVal.append(ch);
					}

				}
			} else {
				if (ch == customQuote) {

					inQuotes = true;

					if (chars[0] != '"' && customQuote == '\"') {
						curVal.append('"');
					}

					if (startCollectChar) {
						curVal.append('"');
					}

				} else if (ch == separators) {

					result.add(curVal.toString());

					curVal = new StringBuffer();
					startCollectChar = false;

				} else if (ch == '\r') {

					continue;
				} else if (ch == '\n') {

					break;
				} else {
					curVal.append(ch);
				}
			}

		}

		result.add(curVal.toString());

		return result;
	}




}
