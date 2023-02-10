package com.sample;


import org.bass.BassClass;
import org.openqa.selenium.WebElement;

import com.lpojo.Loginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefiontion extends BassClass{
	  
	
	
	@Given("user have to enter facebook login thorugh chrome browser")
	public void user_have_to_enter_facebook_login_thorugh_chrome_browser() {
		lanchbrowser("chrome");
		lanchurl("https://www.facebook.com/");
         
            
		
		
	}

	@When("user have to enter valide email and invalide password")
	public void user_have_to_enter_valide_email_and_invalide_password() {
	   
		Loginpojo l = new Loginpojo();
		
		WebElement a = l.getUser();
		fillbox(a, "abc123@gamail.com");
		WebElement pas = l.getPass();
		fillbox(pas, "00000000000");
		
		
	}

	@When("user have to login button")
	public void user_have_to_login_button() {
		
	   Loginpojo l = new Loginpojo();
	   WebElement lo = l.getLog();
	   click(lo);
	  
	}

	@Then("user have to reach invalide credentails page")
	public void user_have_to_reach_invalide_credentails_page() {
		String url = dri.getCurrentUrl();
		
		if (url.contains("privacy_mutaion_token")) {
			System.out.println("user vaid login");
		}
		else {
			System.out.println("user not valid login");
		}
		
		
		
		
		
		
		
		
	}


}
