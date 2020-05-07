package com.Flipkart.AddtoCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.Flipkart.Init.AbstractPage;
import com.Flipkart.Init.Common;

public class AddtoCartIndexPage extends AbstractPage {


	public AddtoCartIndexPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = ".//button[@class='_2AkmmA _29YdH8']")
	WebElement ClosePopupBtn;
	
	public AddtoCartVerification ClickonCloseBtn() {
		Common.clickableElement(ClosePopupBtn, driver);
		ClosePopupBtn.click();
		return new AddtoCartVerification(driver);
	}
	
	public AddtoCartVerification HoveronMenu(String MenuName) {
		WebElement SelectMenu = driver.findElement(By.xpath(".//span[contains(text(),'"+MenuName+"')]"));
		Common.mouseHover(driver, SelectMenu);		
		return new AddtoCartVerification(driver);
	}
	
	public AddtoCartVerification ClickonMobileCompany(String MobileCompany) {
		WebElement SelectCompany = driver.findElement(By.xpath(".//a[@title='"+MobileCompany+"']"));
		SelectCompany.click();
		return new AddtoCartVerification(driver);
	}
	
	@FindBy(xpath=".//div[@class='_1p7h2j _2irnD_']")
	WebElement Assured;
	
	public AddtoCartVerification SelectAssured() {
		Assured.click();
		return new AddtoCartVerification(driver);
	}
	
	public AddtoCartVerification SelectRAM(String ram) {
		WebElement RAM = driver.findElement(By.xpath(".//div[@class='_1GEhLw'][contains(text(),'"+ram+"')]"));
		RAM.click();
		return new AddtoCartVerification(driver);
	}
	
//	public AddtoCartVerification SelectRating(String rating) {
//		WebElement Rating = driver.findElement(By.xpath(".//div[@class='_1GEhLw'][contains(text(),'"+rating+"')]"));
//		Rating.click();
//		return new AddtoCartVerification(driver);
//	}
	
	public AddtoCartVerification SelectRating() {
		WebElement Rating = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[6]/div[2]/div/div[1]/div/div/label/div[2]"));
		Rating.click();
		return new AddtoCartVerification(driver);
	
	}
	
	public AddtoCartVerification FindMaxPrice() {
		List<WebElement> list_of_products = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		
		//Use of HashMap to store Products and Their prices(after conversion to Integer)
		String product_name;
		String product_price;
		int int_product_price;
		HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
		for(int i=0;i<list_of_products.size();i++) {
			product_name = list_of_products.get(i).getText();//Iterate and fetch product name
			product_price = list_of_products_price.get(i).getText();//Iterate and fetch product price
			product_price = product_price.replaceAll("[^0-9]", "");//Replace anything wil space other than numbers
			int_product_price = Integer.parseInt(product_price);//Convert to Integer
			map_final_products.put(int_product_price,product_name);//Add product and price in HashMap
		}
		Set<Integer> allkeys = map_final_products.keySet();
		ArrayList<Integer> array_list_values_product_prices = new ArrayList<Integer>(allkeys);
		
		Collections.sort(array_list_values_product_prices);
		
		int high_price = array_list_values_product_prices.get(array_list_values_product_prices.size()-1);
				
		String Product_Name = map_final_products.get(high_price);
		log("Maximum Price : " + high_price + "Product Name : " +Product_Name);
		
		WebElement MaxPrice =driver.findElement(By.xpath(".//div[@class='_3wU53n'][contains(text(),'"+Product_Name+"')]"));
		Common.clickableElement(MaxPrice, driver);
		MaxPrice.click();
		
		return new AddtoCartVerification(driver);
	}
	
	@FindBy(xpath=".//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement AddtocartButton;
	
	public AddtoCartVerification ClickonAddtocartBtn() {
		AddtocartButton.click();
		return new AddtoCartVerification(driver);
	}

	@FindBy(xpath=".//input[@name='q']")
	WebElement SearchBar;

	public AddtoCartVerification clickonSearchBar() {
		SearchBar.click();
		return new AddtoCartVerification(driver);
		
	}
}