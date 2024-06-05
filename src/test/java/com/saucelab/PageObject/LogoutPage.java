package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	// create obj. of webdriver

	WebDriver driver;

	public LogoutPage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement openMenu;

	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutBtn;

	public void clickOnOpenMenuIcon(){

		openMenu.click();
	}

	public void clickOnlogoutBtn(){

		logoutBtn.click();
	}



}
