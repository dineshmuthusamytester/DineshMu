package com.flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchMobile {
	public static  WebDriver driver;
	private  static void searchmobile() {
		try {
			
			WebElement searchbar = driver.findElement(By.xpath("//input[@autocomplete='off']"));
			searchbar.sendKeys("samsung galaxy A33");
			WebElement searchbox = driver.findElement(By.xpath("//button[@type='submit']"));
			searchbox.click();
			
		
		} catch (Exception e) {
			System.out.println("searchbox is not valied");
			
		}
	  
	}


	}


