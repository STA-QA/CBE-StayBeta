package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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


	}


