package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		
		driver.findElement(By.xpath("//span[text()='June']/ancestor::div[contains(@class,'monthBlock')]//a[text()='25']")).click();

	}

}
