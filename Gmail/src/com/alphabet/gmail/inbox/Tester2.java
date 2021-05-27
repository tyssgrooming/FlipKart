package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//Step 1. Open the Browser and Go the App Url 
		driver.get("https://www.myntra.com/login/password");
		if(driver.findElement(By.xpath("//div[text()='Login to your account']")).isDisplayed()) {
			System.out.println("Login Page is Displayed");
		} else {
			System.out.println("Login Page is Not Displayed");
		}
		
		//Step 2. Enter Registered Mobile Number
		driver.findElement(By.id("mobileNumberPass")).sendKeys("9945886952");
		
		//Step 3. Enter Valid Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing@123");
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		//Step 4. Click on Login Button
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='amnHalfCard']")).getText());
		
		
		
		/*
		WebElement profileMenu=driver.findElement(By.xpath("//span[text()='Profile']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(profileMenu).perform();

		if(driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).isDisplayed()) {
			System.out.println("Logout link is displayed");
		} else {
			System.out.println("Logout link is Not displayed");
		}

		String expectedTitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("Home Page Title is Correct");
		} else {
			System.out.println("Home Page Title is InCorrect");
		}
		*/
	}

}
