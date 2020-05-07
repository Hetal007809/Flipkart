package com.Flipkart.AddtoCart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Flipkart.Init.Common;
import com.Flipkart.Init.SeleniumInit;

public class AddtoCartIndex extends SeleniumInit {

//	@Test
//	public void AddToCart() {
//		int numOfFailure = 0;
//		int step = 1;
//		String MenuName = "Electronics";
//		String MobileCompany = "Asus";
//		String ram ="6 GB";
//		String rating = "4★";
//		String Rating = "4";
//		String name= "Asus ROG (Black, 128 GB)" ;
//
//
//		logStep(step++, "Open Flipkart URL " + testUrl);
//		Common.pause(3);
//		logStep(step++, "Click on close button to close Popup");
//		addtoCartVerification = addtoCartIndexPage.ClickonCloseBtn();
//
//		Common.pause(3);
//		log("Verify Pop up is hide & user redirect to Home page.");
//		if (addtoCartVerification.VerifyPopup()) {
//			logStatus(1, "Pass");
//		} else {
//			logStatus(2, "Fail");
//			numOfFailure++;	
//		}
//		
//		Common.pause(2);
//		logStep(step++, "Hover on " + MenuName + " to Open Submenu.");
//		addtoCartVerification = addtoCartIndexPage.HoveronMenu(MenuName);
//		
//		Common.pause(2);
//		logStep(step++, "Click on " + MobileCompany);
//		addtoCartVerification = addtoCartIndexPage.ClickonMobileCompany(MobileCompany);		
//		
//		Common.waitForElement(addtoCartVerification.PageTitle, driver);
//		log("Verify to selected " + MobileCompany + " Mobile company Page title");
//		if(addtoCartVerification.VerifyPageTitle()) {
//			logStatus(1, "Pass");
//		} else {
//			logStatus(2, "Fail");
//			numOfFailure++;
//		}
//		
//		Common.pause(2);
//		logStep(step++, "Select Assured from Filter");
//		addtoCartVerification = addtoCartIndexPage.SelectAssured();
//		
//		Common.pause(3);
//		logStep(step++, "Select RAM from Filter");
//		addtoCartVerification = addtoCartIndexPage.SelectRAM(ram);
//
//		Common.pause(5);
//		logStep(step++, "Select Rating From Filter");
//		addtoCartVerification = addtoCartIndexPage.SelectRating();
//		
//		Common.pause(2);
//		log("Verify to check " + ram + " RAM Mobile is display."  );
//		if(addtoCartVerification.VerifySelectedRam(ram)) {
//			logStatus(1, ram + " Ram is select Properly.");
//		}else {
//			logStatus(2, "Fail");
//			numOfFailure++;
//		}
//		
//		Common.pause(2);
//		log("Verify to check " + rating + " Rating Mobile is display.");
//		if(addtoCartVerification.VerifySelectedRating(Rating)) {
//			logStatus(1, "Pass");
//		}else {
//			logStatus(2,"Fail");
//			numOfFailure++;
//		}
//		
//		String handleCurrentWindow = driver.getWindowHandle();
//		Common.pause(4);
//		logStep(step++, "Find Maximum price from Mobile List & Click on it.");
//		addtoCartVerification = addtoCartIndexPage.FindMaxPrice();
//		
//		Common.findAndSwitchToSecondWindow(driver, handleCurrentWindow);
//		logStep(step++, "Click on Add to cart button.");
//		Common.clickableElement(addtoCartIndexPage.AddtocartButton, driver);
//		addtoCartVerification = addtoCartIndexPage.ClickonAddtocartBtn();
//		
//		Common.pause(5);
//		log("Verify Cart page after click on add to cart.");
//		if(addtoCartVerification.VerifyAddtocartPage()) {
//			logStatus(1, "Pass");
//		}else {
//			logStatus(2,"Fail");
//			numOfFailure++;
//		}
//		
//		if (numOfFailure>0) {
//			Assert.assertTrue(false);
//		} 
//	}
//
	@Test
	public void Search() {
		int numOfFailure = 0;
		int step = 1;
		
		logStep(step++, "Open Flipkart URL " + testUrl);
		Common.pause(3);
		logStep(step++, "Click on Search bar.");
//		addtoCartVerification = addtoCartIndexPage.clickonSearchBar();
		
	}
}
