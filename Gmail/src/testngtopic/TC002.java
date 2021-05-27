package testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC002 {
	
	@Parameters({"browserName"})
	@Test(description="Verify whether CEO Login is Working or not"/*, invocationCount=2 , threadPoolSize=2*/ )
	public void testValidLogin(String browserName) {
		WebDriver driver;
		switch(browserName) {
			case "chrome":System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
						  driver = new ChromeDriver();
						  break;
			
			case "firefox":System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
			  			   driver = new FirefoxDriver();
			  			   break;
				
			case "ie":System.setProperty("webdriver.ie.driver", "./drivers/ieDriverServer.exe");	
			          driver = new InternetExplorerDriver();
			          break;
			          
			default:throw new IllegalArgumentException("Browser Not Supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://106.51.137.79:7777/crm/HomePage.do");
		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.quit();
	}
}
