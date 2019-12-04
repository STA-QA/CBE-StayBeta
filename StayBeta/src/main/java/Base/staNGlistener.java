package Base;

import static Base.BaseUtil.features;
import static Base.BaseUtil.scenarioDef;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.gherkin.model.Feature;
import com.vimalselvam.cucumber.listener.Reporter;

import Base.ExtentReportUtil;
import gherkin.ast.ScenarioDefinition;

public class staNGlistener implements ITestListener {

    ExtentReportUtil extentReportUtil = new ExtentReportUtil();

   @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("On test start");
      
    }

  @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("On test Sucess");
    }

     @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("On test failure");

		/*
		 * try{ extentReportUtil.ExtentReportScreenshot(); }catch (IOException e){
		 * e.printStackTrace(); }
		 */
    }

   @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("On test skipped");
    }

 @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("On test percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("On start");
        extentReportUtil.ExtentReport();
        features = extentReportUtil.extent.createTest(Feature.class, "Registration Feature");
       
    }

   @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("On finish");
        extentReportUtil.FlushReport();
        
        
        
    }
}
