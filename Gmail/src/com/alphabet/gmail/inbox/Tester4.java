package com.alphabet.gmail.inbox;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester4 {
	public static void main(String[] args) throws IOException {
		String timeStamp = LocalDateTime.now().toString().replace(':','-');
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		File tempFile = driver.findElement(By.xpath("//img[@alt='Google']")).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./errorshots/logo"+timeStamp+".png");
		FileUtils.copyFile(tempFile,destFile);
		driver.quit();
	}
}
