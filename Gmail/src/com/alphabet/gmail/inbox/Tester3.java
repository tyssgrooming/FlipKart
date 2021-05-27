package com.alphabet.gmail.inbox;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 {

	public static void main(String[] args) throws Exception {
		
		String timeStamp = LocalDateTime.now().toString().replace(':','-');
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./errorshots/searchPage"+timeStamp+".png");
		FileUtils.copyFile(tempFile,destFile);
		driver.quit();
	}

}
