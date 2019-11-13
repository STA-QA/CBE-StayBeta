package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportUtil extends BaseUtil {

    String fileName = "extentreport.html";


    public void ExtentReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("1Source-Automation Report");
        htmlReporter.config().setEncoding("utf-8");

        htmlReporter.config().setReportName("CBE-StayBeta");

      

       // htmlReporter.config().enableTimeline(true);

        extent.attachReporter(htmlReporter);

    }

	/*
	 * public static void ExtentReportScreenshot() throws IOException {
	 *
	 * File scr = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	 * Files.copy(scr.toPath(), new File(reportLocation +
	 * "screenshot.png").toPath());
	 * scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation +
	 * "screenshot.png"); }
	 */


    public void FlushReport(){
        extent.flush();
    }




}
