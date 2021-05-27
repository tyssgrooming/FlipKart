package com.alphabet.gmail.inbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester19 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://106.51.137.79:7777/crm/HomePage.do");
		
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		
		WebElement listBox=driver.findElement(By.name("property(Industry)"));
		
		Select s = new Select(listBox);
		List<WebElement> options=s.getOptions();
		
		s.selectByIndex(options.size()-1);
	}

}
