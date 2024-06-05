package com.saucelab.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucelab.PageObject.CartPage;
import com.saucelab.PageObject.CompletePage;
import com.saucelab.PageObject.InformationPage;
import com.saucelab.PageObject.LoginPage;
import com.saucelab.PageObject.LogoutPage;
import com.saucelab.PageObject.OverviewPage;
import com.saucelab.PageObject.ProductPage;

public class RegressionTestCases extends BaseClass{
	
	@Test
	public void verifyLoginPageFunctionality() throws IOException{
		
		driver.get(url);
		//logger.info("Url Opened Successfully");
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername();
		
		lp.enterPassword();
		
		lp.clickOnLoginBtn();
		
		String title = driver.getTitle();
		System.out.println("Login page title is : "+ title);
		
		if(title.equals("Swag Labs")){
			logger.info("Login title verification passed.");
			Assert.assertTrue(true);
			System.out.println("Login Page Test Cases Passed.");
		}
		else {
			captureScreenShot(driver,"verify Login title");
			Assert.assertTrue(false);		
		}
		
		// Product page functionality
		
		ProductPage prodPage = new ProductPage(driver);
		
		prodPage.clickOnProductLink();
		 
		prodPage.clickOnaddToCart();
		
		String productPageUrl = driver.getCurrentUrl();
		System.out.println("Product page product page URL is : "+ productPageUrl);
		
		if(productPageUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4")){
			Assert.assertTrue(true);
			System.out.println("Product Page Test Cases Passed.");
		}
		else {
			captureScreenShot(driver,"verify Product page URL");
			Assert.assertTrue(false);		
		}
		
		// Cart Page functionality
		
		CartPage cartPage = new CartPage(driver);
		
		cartPage.clickOnCartIcon();
		
		cartPage.clickOncheckOutBtn();
		
		String InfoPageUrl = driver.getCurrentUrl();
		System.out.println("Info page URL is : "+ InfoPageUrl);
		
		if(InfoPageUrl.equals("https://www.saucedemo.com/checkout-step-one.html")){
			Assert.assertTrue(true);
			System.out.println("Cart Page Test Cases Passed.");
		}
		else {
			captureScreenShot(driver,"verify Cart page URL");
			Assert.assertTrue(false);		
		}
		// information page functionality
		InformationPage infoPage = new InformationPage(driver);
		
		infoPage.enterFirstName();
		
		infoPage.enterLastName();
		
		infoPage.enterzipCode();
		
		infoPage.clickOnContinueBtn();
		
		String OverviewPageUrl = driver.getCurrentUrl();
		System.out.println("Overview page URL is : "+ OverviewPageUrl);
		
		if(OverviewPageUrl.equals("https://www.saucedemo.com/checkout-step-two.html")){
			Assert.assertTrue(true);
			System.out.println("Information Page Test Cases Passed.");
		}
		else {
			captureScreenShot(driver,"verify Information page URL");
			Assert.assertTrue(false);		
		}
		
		// Overview Page functionality
		
		OverviewPage overviewPage = new OverviewPage(driver);
		
		overviewPage.clickOnFinishBtn();
		
		String OrderCompletePageUrl = driver.getCurrentUrl();
		System.out.println("Complete page URL is : "+ OrderCompletePageUrl);
		
		if(OrderCompletePageUrl.equals("https://www.saucedemo.com/checkout-complete.html")){
			Assert.assertTrue(true);
			System.out.println("Overview Page Test Cases Passed.");
		}
		else {
			captureScreenShot(driver,"verify Overview page URL");
			Assert.assertTrue(false);		
		}
		
		// complete page functionality
		CompletePage completePage = new CompletePage(driver);
		
		completePage.getSuccessMessage();
		
		// Logout page functionality
		
		LogoutPage logoutPage = new LogoutPage(driver);
		
		logoutPage.clickOnOpenMenuIcon();
		
		logoutPage.clickOnlogoutBtn();
		
		String loginPageUrl = driver.getCurrentUrl();
		System.out.println("Login page URL is : "+ loginPageUrl);
		
		if(loginPageUrl.equals("https://www.saucedemo.com/")){
			Assert.assertTrue(true);
			System.out.println("Logout Page Test Cases Passed.");
		}
		else {
			captureScreenShot(driver,"verify Complete page URL");
			Assert.assertTrue(false);		
		}
		
	}

}
