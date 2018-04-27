package ProjectEDUOTTestMaven.ProjectEDUOTTestLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginC {
	public WebDriver driver;
	
	@Test
	public void firstTestCase()
	{
		System.out.println("im in first test case from LoginC Class");
	}
	
	@BeforeMethod
	 
	  public void beforeMethod() {
			
		System.setProperty("webdriver.chrome.driver", "C://Users//Jshankar//Downloads//chromedriver.exe");
		
		  // Create a new instance of the Firefox driver
			
	      driver = new ChromeDriver();
	 
	      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      //Launch the Online Store Website
	 
	      driver.get("http://www.onlinestore.toolsqa.wpengine.com");
	 
	  }
	
	

	  @AfterMethod
	 
	  public void afterMethod() {
	 
		  // Close the driver
	 
	      driver.quit();
	 
	  }
}