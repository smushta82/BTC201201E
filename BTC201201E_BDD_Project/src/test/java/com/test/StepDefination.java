package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	@Before
	public void start() {
		
	}
	@After
	public void end() {
		
	}
	@Before("@smoke")
	public void start1() {
		
	}
	@After("@smoke")
	public void end1() {
		
	}
	WebDriver dr;
	@Given("^open black browser$")
	public void open_black_browser() throws Throwable {
	  dr= new ChromeDriver();  
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	   dr.get("http://www.facebook.com"); 
	}

	@When("^user type userID in userText box$")
	public void user_type_userID_in_userText_box() throws Throwable {
	   dr.findElement(By.id("email")).sendKeys("");
	}

	@When("^user type password in passText box$")
	public void user_type_password_in_passText_box() throws Throwable {
	   dr.findElement(By.id("pass")).sendKeys("");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		dr.findElement(By.id("login button")).click();
	}
	   

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
	    if(dr.findElement(By.xpath("SignOut")).isDisplayed()) {
	    	System.out.println("I am in right page");
	    }
	}
	@When("^user type <\"([^\"]*)\"> in userText box$")
	public void user_type_in_userText_box(String arg1) throws Throwable {
	    
	}

	@When("^user type <\"([^\"]*)\"> in passText box$")
	public void user_type_in_passText_box(String arg1) throws Throwable {
	    
	}

}
