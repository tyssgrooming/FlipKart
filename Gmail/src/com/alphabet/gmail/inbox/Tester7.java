package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Earth Day 2021")).click();
				break;
			} catch(NoSuchElementException e) {
				
			}
			
			jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		}
		
		if(driver.getCurrentUrl().contains("earth-day-2021")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
	}	

}
