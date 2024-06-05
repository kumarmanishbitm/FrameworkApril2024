package com.saucelab.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

	// create obj. of webdriver

	WebDriver driver;

	public OverviewPage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id="finish")
	WebElement finishBtn;

	
	public void clickOnFinishBtn(){

		finishBtn.click();
	}



}
