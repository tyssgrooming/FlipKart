package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebElement targetFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://ogs.google.com/widget/app')]"));
		driver.switchTo().frame(targetFrame);
		
		
		driver.findElement(By.linkText("YouTube")).click();	

	}

}
