package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class commonfunctions extends BaseUtil {

	public static String screenshot(WebDriver driver, long ms) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "\\screenshot\\" + ms + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		System.out.println("ScreenShot Taken");

		return dest;

	}

	@Test
	public void getDOB() throws Exception {

		String path = System.getProperty("user.dir");
		String testdatapath = path + "\\src\\Testdata\\user_details.csv";
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("Today : " + cal.getTime());
		cal.add(Calendar.YEAR, -7);
		String NewDate = format1.format(cal.getTime());
		String dateParts[] = NewDate.split("-");
		String day = dateParts[0];
		String month = dateParts[1];
		String year = dateParts[2];

		try (PrintWriter writer = new PrintWriter(new File(testdatapath))) {

			StringBuilder sb = new StringBuilder();
			/*
			 * sb.append("day,"); sb.append("month,"); sb.append("year"); sb.append('\n');
			 */

			sb.append(day);
			sb.append(',');
			sb.append(month);
			sb.append(',');
			sb.append(year);
			sb.append('\n');

			writer.write(sb.toString());

			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	//////////////////////////////////

	private static final char DEFAULT_SEPARATOR = ',';
	private static final char DEFAULT_QUOTE = '"';

	@Test
	public void readtestdat(int index) throws Exception {

		String path = System.getProperty("user.dir");
		String csvFile = path + "\\src\\Testdata\\user_details.csv";

		// String csvFile = "/Users/csv/country2.csv";

		Scanner scanner = new Scanner(new File(csvFile));
		while (scanner.hasNext()) {
			List<String> line = parseLine(scanner.nextLine());
			System.out.println(line.get(index));
			// System.out.println(line.get(1));
			// System.out.println(line.get(2));
		}
		scanner.close();

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

	@Test
	public void csvdata() throws Exception {
		String path = System.getProperty("user.dir");
		String testdatapath = path + "\\src\\Testdata\\user_details.xlsx";
		InputStream ExcelFileToRead = new FileInputStream(testdatapath);
		// XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new
		// File(testdatapath)));
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFWorkbook test = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		cell = wb.getSheetAt(0).getRow(1).getCell(1);

		System.out.println(wb.getSheetAt(0).getRow(1).getCell(0));
		System.out.println(wb.getSheetAt(0).getRow(1).getCell(1));

		System.out.println(wb.getSheetAt(0).getRow(0).getCell(0));
		System.out.println(wb.getSheetAt(0).getRow(0).getCell(1));

	}

	public void csvfile() {
	}
}
