package com.flipkart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps {
static WebDriver driver;
@Given("user launches flipkart application")
public void user_launches_flipkart_application() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("www.flipkart.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}
@And("user login into flipkart")
public void user_search_mobiles() {
	try {
		 WebElement closeIcon = driver.findElement(By.xpath("//button[text()='✕']"));
		 closeIcon.isDisplayed();
		 closeIcon.click();
		
	} catch (Exception e) {
		System.out.println("Login not required");

	}
	
   
}

@When("user search mobiles")
public void user_choose_mobiles() {
	
   
}

@And("user add mobile to add to cart and doing payment")
public void user_add_mobile_to_add_to_cart_and_doing_payment() {
  
}

}
