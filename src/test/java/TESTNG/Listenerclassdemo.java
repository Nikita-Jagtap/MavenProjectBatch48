package TESTNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclassdemo  implements ITestListener{

	
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
		TakesScreenshot ts = (TakesScreenshot)Softassertdemo.driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectBatch48\\src\\screenshot\\utr.png");
		try {
			FileHandler.copy(src, loc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	
	public void onStart(ITestContext context) {
		System.out.println("on  start");
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

}
