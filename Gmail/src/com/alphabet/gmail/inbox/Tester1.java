package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://www.naukri.com/");
		
		//Step 1. Open the Browser and Go the App Url 
		String actualTitle=driver.getTitle();
		if(actualTitle.contains("Employment -Job Vacancies")) {
			System.out.println("Dashboard Page is Displayed");
		} else {
			System.out.println("Dashboard Page is Not Displayed");
		}
		
		
		
		//Step 2. Click on Login button and verify Login Panel is Displayed
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(6000);
		if(driver.findElement(By.name("login-form")).isDisplayed()) {
			System.out.println("Login Panel is Displayed");
		} else {
			System.out.println("Login Panel is Not Displayed");
		}
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID')]")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'password')]")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//Explicit wait
		String expectedUrl="https://www.naukri.com/mnjuser/homepage";
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
		
		//Step 3. Click on Login button and verify Home Page uRl is Correct, Title is correct, logout Link is diplaayed
		
		if(driver.getCurrentUrl().equals(expectedUrl)) {
			System.out.println("Home Page Url is Correct");
		} else {
			System.out.println("Home Page Url is Incorrect");
		}
		
		if(driver.getTitle().equals("Home | Mynaukri")) {
			System.out.println("Home Page Title is Correct");
		} else {
			System.out.println("Home Page Title is Incorrect");
		}
		
		WebElement myNaukriMenu=driver.findElement(By.linkText("MY NAUKRI"));
		Actions actions = new Actions(driver);
		actions.moveToElement(myNaukriMenu).perform();
		
		if(driver.findElement(By.linkText("Logout")).isDisplayed()) {
			System.out.println("Logout Link is Displayed");
		} else {
			System.out.println("Logout Link is Not Displayed");
		}
		
		driver.quit();
	}

}








