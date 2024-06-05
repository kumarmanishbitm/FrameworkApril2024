package com.saucelab.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucelab.PageObject.LoginPage;


public class EndToEndTesting extends BaseClass{
	
	@Test
	public void verifyLogin() throws IOException{
		
		driver.get(url);
		logger.info("Url Opened Successfully");
		
		LoginPage lp = new LoginPage(driver);
		logger.info("Login page execution started");
		lp.enterUsername();
		logger.info("Username Entered Successfully");
		lp.enterPassword();
		logger.info("Password Entered Successfully");
		lp.clickOnLoginBtn();
		logger.info("Clicked on Login button Successfully");
		
		String title = driver.getTitle();
		System.out.println("Login page title is : "+ title);
//		
//		if(title.equals("Swag Labs")){
//		//	logger.info("Login title verification passed.");
//			Assert.assertTrue(true);
//		}
//		else {
////			logger.info("Login title verification failed.");
////			captureScreenShot(driver,"verify Login title");
////			Assert.assertTrue(false);
//		}
		// code for Product page
		
//		ProductPage pg = new ProductPage(driver);
//		logger.info("Product page execution started");
//		pg.clickOnProductLink();
//		pg.clickOnAddToCartButton();
//		
//		String ProductPageUrl = driver.getCurrentUrl();
//		System.out.println("Login page title is : "+ ProductPageUrl);
//		
//		if(ProductPageUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4")){
//			logger.info("Product page URL verification passed.");
//			Assert.assertTrue(true);
//		}
//		else {
//			logger.info("Product page URL verification failed.");
//			captureScreenShot(driver,"verify Product page URL");
//			Assert.assertTrue(false);
//		}
//		
//		// Code for Cart Page
//		
//		CartPage cp = new CartPage(driver);
//		logger.info("Cart page execution started");
//		cp.clickOnCartIcon();
//		cp.clickOnCartCheckoutButton();
//		
//		String cartPageUrl = driver.getCurrentUrl();
//		System.out.println("Cart page title is : "+ cartPageUrl);
//		
//		if(cartPageUrl.equals("https://www.saucedemo.com/checkout-step-one.html")){
//			logger.info("Cart page URL verification passed.");
//			Assert.assertTrue(true);
//		}
//		else {
//			logger.info("Cart page URL verification failed.");
//			captureScreenShot(driver,"verify Cart page URL");
//			Assert.assertTrue(false);
//		}
//		 // Infor page code
//		
//		InformationPage ip = new InformationPage(driver);
//		
//		ip.enterFirstName();
//		ip.enterLastName();
//		ip.enterPostalCode();
//		ip.clickOnContinueBtn();
//		
//		String overviewPageUrl = driver.getCurrentUrl();
//		System.out.println("Overview page title is : "+ overviewPageUrl);
//		
//		if(overviewPageUrl.equals("https://www.saucedemo.com/checkout-step-two.html")){
//			logger.info("Overview page URL verification passed.");
//			Assert.assertTrue(true);
//		}
//		else {
//			logger.info("Overview page URL verification failed.");
//			captureScreenShot(driver,"verify Overview page URL");
//			Assert.assertTrue(false);
//		}
//		
//		// Overview page code
//		
//		OverviewPage op = new OverviewPage(driver);
//		
//		op.clickOnFinishButton();
//		
//		String completePageUrl = driver.getCurrentUrl();
//		System.out.println("Complete page title is : "+ completePageUrl);
//		
//		if(completePageUrl.equals("https://www.saucedemo.com/checkout-complete.html")){
//			logger.info("Complete page URL verification passed.");
//			Assert.assertTrue(true);
//		}
//		else {
//			logger.info("Complete page URL verification failed.");
//			captureScreenShot(driver,"verify Complete page URL");
//			Assert.assertTrue(false);
//		}
//		
//		// Complete page text
//		
//		CompletePage completePage = new CompletePage(driver);
//		
//		completePage.getSuccessMessage();
//		logger.info("Complete page URL verification passed.");
//		
//		// Logout page code
//		
//		LogoutPage lo= new LogoutPage(driver);
//		
//		lo.clickOnBurgerIcon();
//		lo.clickOnLogoutBtn();
//		
//		String loginPageUrl = driver.getCurrentUrl();
//		System.out.println("Login page title is : "+ loginPageUrl);
//		
//		if(loginPageUrl.equals("https://www.saucedemo.com/")){
//			logger.info("Login page URL verification passed.");
//			Assert.assertTrue(true);
//		}
//		else {
//			logger.info("Login page URL verification failed.");
//			captureScreenShot(driver,"verify Login page URL");
//			Assert.assertTrue(false);
//		}
//		
		
	}
	
	

}
