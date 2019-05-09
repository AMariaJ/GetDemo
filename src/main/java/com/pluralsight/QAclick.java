package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class QAclick {
	
public static void main(String[] ars) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
	
		driver.get("http://qaclickacademy.com");
		Thread.sleep(4000);
		driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[6]/div/div/button")).click();
		
	}


}
