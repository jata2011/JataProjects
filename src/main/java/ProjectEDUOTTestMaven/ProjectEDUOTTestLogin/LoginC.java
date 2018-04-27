package ProjectEDUOTTestMaven.ProjectEDUOTTestLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginC {
static String driverPath = "F:/Selenium/SampleTestNG/lib/";
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		switch (browserType) {
		case "firefox":
			return	driver = new FirefoxDriver();
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			return	driver = new ChromeDriver();
		case "IE":
			System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			return	driver = new InternetExplorerDriver();
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			return driver = new FirefoxDriver();
		}
	}
}