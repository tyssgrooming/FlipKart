package com.alphabet.gmail.inbox;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester21 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		Runtime.getRuntime().exec("D:\\Java Selenium\\TYSSGrooming\\AutoItPrograms\\FileUploadDemo.exe");
	}
}
