package com.qaautomation.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	
	
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.way2automation.com/"); 
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//i[@class='eicon-close']")).click();
		
		
	}

}
