package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	
		@Given("user is on Facebook website")
		public void user_is_on_Facebook_website() {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
		    
		}

		@When("user should enter user name and password")
		public void user_should_enter_user_name_and_password() {
			WebElement txtUser = driver.findElement(By.id("https://www.facebook.com/"));
			txtUser.sendKeys("arjundhev");
			WebElement txtPass = driver.findElement(By.id("pass"));
		    txtPass.sendKeys("sathvika");
		}

		@When("user should click login button")
		public void user_should_click_login_button() {
			WebElement lognBtn = driver.findElement(By.id("u_0_d_oY"));
			lognBtn.click();
		    }

		@Then("user should validate home page is present or not")
		public void user_should_validate_home_page_is_present_or_not() {
			System.out.println("invalid password");
		   
		}




}
