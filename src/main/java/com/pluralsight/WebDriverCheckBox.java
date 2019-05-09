package com.pluralsight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckBox {
	
	public static void main(String[] ars) throws InterruptedException{
		
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Ansley/Mavenjava1/src/main/webapp/CheckBox.html");
		WebElement checkBox = driver.findElement(By.id("lettuceCheckbox"));
		
		checkBox.click();
		Thread.sleep(300);
		checkBox.click();
		
		
	}

}
