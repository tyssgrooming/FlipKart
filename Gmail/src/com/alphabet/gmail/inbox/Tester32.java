package com.alphabet.gmail.inbox;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester32 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.linkText("English (UK)")).click();
		
		WebElement monthListBox=driver.findElement(By.id("month"));
		
		Select s = new Select(monthListBox);
		
		List<WebElement> options=s.getOptions();
		
		for(int i=0;i<=options.size()-1;i+=2) {
			System.out.println(options.get(i).getText());
		}

	}

}
