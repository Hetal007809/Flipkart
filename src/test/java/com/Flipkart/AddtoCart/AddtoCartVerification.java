package com.Flipkart.AddtoCart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Flipkart.Init.AbstractPage;

public class AddtoCartVerification extends AbstractPage{

	public AddtoCartVerification(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath =".//img[@class='_1e_EAo']")
	WebElement HomePage;
	
	public boolean VerifyPopup() {
		if(HomePage.isEnabled())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath=".//h1[contains(text(),'Mobiles')]")
	WebElement PageTitle;
	
	public boolean VerifyPageTitle() {
		if(PageTitle.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean VerifySelectedRam(String Ram) {
		List<WebElement> VerifyRam = driver.findElements(By.xpath(".//span[contains(@id, 'productRating')]/../..//ul/li[1]"));
		for(int i=0; i<VerifyRam.size(); i++) {
			if(VerifyRam.get(i).getText().contains(Ram))
				return true;
			else
				return false;
		}
		return false;
	}
	
	public boolean VerifySelectedRating(String Rating) {
		List<WebElement> VerifyRating = driver.findElements(By.xpath(".//span[contains(@id,'productRating')]//div[@class='hGSR34']"));
		for(int j=0; j<VerifyRating.size(); j++) {
			if(VerifyRating.get(j).getText().contains(Rating))
				return true;
			else
				return false;
		}
		return false;
	}
	
	@FindBy(xpath=".//div[@class='_1lBhq8']")
	WebElement MyCartTitle;
	
	@FindBy(xpath=".//a[@class='_325-ji _3ROAwx'][contains(text(),'Asus ROG (Black, 128 GB)')]")
	WebElement MobileTitle;
	
	public boolean VerifyAddtocartPage() {
		if(MyCartTitle.isDisplayed() &&  MobileTitle.isDisplayed())
			return true;
		else
			return false;
	}

}
