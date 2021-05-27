package com.alphabet.gmail.inbox;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester28 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String parentWid=driver.getWindowHandle();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		for(String wid:allWindowIds) {
			driver.switchTo().window(wid);
			if(driver.getTitle().equals("Ice Mortgage")) {
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.tagName("img")).click();
		
		
		driver.switchTo().window(parentWid);
		
		driver.findElement(By.id("login_Layer")).click();

	}

}
