package com.alphabet.gmail.inbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester29 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayListBox=driver.findElement(By.id("day"));
		
		Select s = new Select(dayListBox);
//		s.selectByVisibleText("15");
//		s.selectByIndex(17);
		s.selectByValue("19");
	}
}
