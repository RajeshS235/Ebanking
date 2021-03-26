package com.ebankingTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ebankingPageObject.HomePageObjects;
import com.ebankingPageObject.LoginPageObjects;
import com.ebankingUtilities.DataConfig;

public class BaseClass {

	public WebDriver driver;
	public LoginPageObjects login;
	public HomePageObjects home;
	
	public DataConfig data;
	
	@BeforeClass
	public void setUp() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		login = new LoginPageObjects(driver);
		home = new HomePageObjects(driver);
		
		data = new DataConfig();
	}
	
	@AfterClass
	public void teatDown() {
//		driver.close();
	}
	
	
}
