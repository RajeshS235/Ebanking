package com.ebankingTestCases;

import org.testng.annotations.Test;

public class Logintest extends BaseClass {
	
	@Test(priority=1)
	public void urlValidate() {
		driver.get(data.applicationUrl());
		if(driver.getCurrentUrl().equals("https://phptravels.net/login")) {
			System.out.println("Url is matched");
		}
		else {
			System.out.println("Url is not matched");
		}
	}
	
	@Test(priority=2)
	public void userLoginValidate() {
		login.username(data.userName());
		login.pass(data.password());
		login.clickLogin();
	}
	
	@Test(priority=3)
	public void companyAboutUs() {
			home.companyClick();
	}

}
