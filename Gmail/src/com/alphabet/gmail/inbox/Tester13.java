package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate to a differnt url w/o using get() and navigate.to();
public class Tester13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String url=(String) jse.executeScript("return window.location.href;");
		System.out.println(url);
		
		jse.executeScript("window.location.href='https://www.facebook.com';");
	}

}
