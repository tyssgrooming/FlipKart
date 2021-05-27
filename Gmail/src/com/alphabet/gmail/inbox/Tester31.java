package com.alphabet.gmail.inbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester31 {

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
		
		List<String> optionsText = new ArrayList<String>();
		
		for(WebElement ele:options) {
			optionsText.add(ele.getText());
		}
		
		Collections.sort(optionsText);
		Collections.reverse(optionsText);
		
		for(String text:optionsText) {
			System.out.println(text);
		}
		
		

	}

}
