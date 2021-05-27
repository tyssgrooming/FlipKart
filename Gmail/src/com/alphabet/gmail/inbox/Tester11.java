package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to print the webpage title w/o using getTitle() 
public class Tester11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String title = (String) jse.executeScript("return document.title;");
		System.out.println(title);
	}
}

