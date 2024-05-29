package com.qa.orangeHRM.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orangeHRM.base.BaseClass;

public class LoginPageTest extends BaseClass {

	@Test(priority = 1)
	public void urlTest() {
		String actualURL = loginPage.actualUrl();
		System.out.println(actualURL);
		Assert.assertEquals(actualURL, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	public void TitleTest() {
		loginPage.actualTitle();
	}
	
	@Test(priority = 3)
	public void loginTest() {
		loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}

}
