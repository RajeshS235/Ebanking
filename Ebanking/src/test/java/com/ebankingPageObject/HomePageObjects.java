package com.ebankingPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	WebDriver driverr;
	
	public HomePageObjects(WebDriver driverl) {
		driverr = driverl;
		PageFactory.initElements(driverr, this);
	}
	
	@FindBy(xpath="//*[@id=\"mobileMenuMain\"]/nav/ul[2]/li/a")
	private WebElement company;
	
	
	@FindBy(linkText="About Us")
	private WebElement aboutUs;
	
	public void companyClick() {
		Actions a = new Actions(driverr);
		a.moveToElement(company).perform();
		a.moveToElement(aboutUs).perform();
	}
	
	
	
}
