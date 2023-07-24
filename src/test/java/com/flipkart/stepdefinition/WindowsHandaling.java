package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WindowsHandaling  extends SearchMobile{
	public static WebDriver driver;
	public static void user_choose_the_mobile_and_doing_payment() {
	
try {
			
			WebElement choosemobile = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
			choosemobile.click();
	
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for (String v : child) {
				if(!v.equals(parent)) {
					driver.switchTo().window(parent);
					System.out.println("window switched");
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("choose mobile is not properly located");
			
		}

	}

}
