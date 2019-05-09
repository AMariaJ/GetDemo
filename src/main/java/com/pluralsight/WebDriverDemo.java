package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverDemo {
	
	public static void main(String[] args ){
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		WebElement imagesLink = driver.findElement(By.linkText("Images"));
		imagesLink.click();
		
		
		//WebElement imageElement = driver.findElement(By.cssSelector("(a[class=rg_l])[0]"));
		WebElement imageElement = driver.findElement(By.xpath("//*[@id='rg_s']/div[1]/a[1]"));
		WebElement imageLink = imageElement.findElement(By.tagName("img"));
		imageLink.click();
		
	}

}
