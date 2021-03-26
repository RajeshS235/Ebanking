package com.ebankingPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	WebDriver driverr;
	
	
	public LoginPageObjects(WebDriver driverl) {
	driverr = driverl;
	PageFactory.initElements(driverr, this);
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginfrm\"]/button")
	private WebElement click;
	
	
	public void username(String userName) {
		username.sendKeys(userName);
	}
	public void pass(String pas) {
		password.sendKeys(pas);
	}
	public void clickLogin() {
		click.click();
	}
	
}
