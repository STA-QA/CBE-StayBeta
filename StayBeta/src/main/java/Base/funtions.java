package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.reporting.CucumberUsageReporting;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientOptions.Builder;
import com.mongodb.ServerAddress;
import com.vimalselvam.cucumber.listener.ExtentProperties;

public class funtions {

	String Automationdashboard = "No";

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

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile, new File("./Reports/Screenshots_Fail/" + ms + ".png"));

		File filepath = new File("Reports/Screenshots_Fail/" + ms + ".png");
		String dest1 = filepath.getAbsolutePath();
		String dest = "Screenshots_Fail/" + ms + ".png";
		File destination = new File(dest);

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

	public void reportfunction() {
		String timeStamp = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		if (Automationdashboard.contentEquals("Yes")) {
			/*
			 * ExtentProperties extentProperties = ExtentProperties.INSTANCE;
			 * 
			 * extentProperties.setKlovServerUrl("http://localhost");
			 * 
			 * extentProperties.setKlovProjectName("CBE-Automation-Dashboard");
			 * 
			 * extentProperties.setKlovReportName("Run    " + timeStamp);
			 * 
			 * extentProperties.setMongodbHost("localhost");
			 * extentProperties.setMongodbPort(27017);
			 * extentProperties.setMongodbDatabase("klov");
			 * extentProperties.setReportPath("Reports/1SourceReleaseReport.html");
			 */
		} else {

			/*
			 * ExtentProperties extentProperties = ExtentProperties.INSTANCE;
			 * extentProperties.setReportPath("Reports/1SourceReleaseReport.html");
			 */

		}

	
	}

	@Test
	public void checkmongoconnection() {
		Builder o = MongoClientOptions.builder().connectTimeout(3000);
		MongoClient mongo = new MongoClient(new ServerAddress("10.105.198.13", 27017), o.build());

		try {
			mongo.getAddress();

		} catch (Exception e) {
			System.out.println("Mongo is down");
			mongo.close();

		}

	}

}
