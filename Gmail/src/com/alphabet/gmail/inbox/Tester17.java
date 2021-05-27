package com.alphabet.gmail.inbox;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Always select current day in the calendar widget
//Always Tommorrow's Date
public class Tester17 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		int day=ldt.getDayOfMonth();
		String month = ldt.getMonth().name();
		month = month.substring(0,1) + month.substring(1).toLowerCase();
		int year=ldt.getYear();
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("DepartDate")).click();
		
		
		for(int i=1;i<=12;i++) {
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		}
		
		
		driver.findElement(By.xpath("//span[text()='"+year+"']/preceding-sibling::span[text()='"+month+"']/ancestor::div[contains(@class,'monthBlock')]//a[text()='"+day+"']")).click();

	}

}
