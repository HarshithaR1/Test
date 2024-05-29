package com.qa.orangeHRM.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.orangeHRM.factory.DriverFactory;
import com.qa.orangeHRM.pages.HomePage;
import com.qa.orangeHRM.pages.LoginPage;

public class BaseClass {

	protected WebDriver driver;
	protected Properties prop;
	protected DriverFactory df;
	protected LoginPage loginPage;
	protected HomePage homePage;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initBrowser(prop);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);

	}

	/*
	 * @AfterTest public void tearDown() { driver.quit(); }
	 */
}
