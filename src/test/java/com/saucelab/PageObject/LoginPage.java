package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// create obj. of webdriver

	WebDriver driver;

	public LoginPage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// define WebElements

	@FindBy(id ="user-name")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//input[@id='login-button']")
	WebElement lognBtn;


	public void enterUsername(){

		username.sendKeys("standard_user");	
	}
	
	public void enterPassword(){

		password.sendKeys("secret_sauce");	
	}
	
	public void clickOnLoginBtn(){

		lognBtn.click();	
	}
}

