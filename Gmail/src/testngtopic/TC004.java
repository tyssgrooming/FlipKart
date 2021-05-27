package testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC004 {
	
	@DataProvider(name="data", parallel=true)
	public String[][] getData() {
		String[][] credentials = {{"rashmi@dell.com", "123456"},
								  {"hemanth@abc.com","abc1234"},
								  {"shahis@xyz.com", "xyz1234"}};
		return credentials;
	}
	
	
	@Test(dataProvider="data")
	public void testValidLogin(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://106.51.137.79:7777/crm/HomePage.do");
		
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("passWord")).sendKeys(password);
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
	}
}
