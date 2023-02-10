package com.lpojo;

import org.bass.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends BassClass{
	public Loginpojo() {
	      PageFactory.initElements(dri, this);
		
		}
		@CacheLookup
		@FindAll
		({
			@FindBy(id="email"),
			@FindBy(xpath="//input[@nam='email'])")
		})
		private WebElement user;
		
		@FindBy(name="pass")
		private WebElement pass;

		@FindBy(name="login")
		private WebElement log;

		public WebElement getUser() {
			return user;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLog() {
			return log;
		}
			
}
