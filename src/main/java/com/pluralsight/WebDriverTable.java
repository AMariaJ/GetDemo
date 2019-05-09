package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTable {
	
	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ansley/Mavenjava1/src/main/webapp/Table.html");
		
		WebElement tbl = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		
		System.out.println(tbl.getText());
		
		
	}

}
