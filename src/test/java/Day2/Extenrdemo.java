package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extenrdemo {
	ExtentReports Extent;
	@BeforeTest
	public void config() {
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Web Automation");
		
		ExtentReports Extent = new ExtentReports();
		Extent.attachReporter(reporter);
		Extent.setSystemInfo("Senbiga", "tester");
	}
	@Test
	public void demo() {
		ExtentTest test= Extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		Extent.flush();
	}
	
}
