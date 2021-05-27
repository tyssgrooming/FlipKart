package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Print the Scroll Height of the Document
public class Tester12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		long height=(long) jse.executeScript(" return document.body.scrollHeight;");
		System.out.println(height);
	}

}
