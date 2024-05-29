package com.qa.orangeHRM.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangeHRM.base.BaseClass;

public class HomePageTest extends BaseClass{
	
	

	@BeforeMethod
	public void login() {
		loginPage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void searchTask() {
		
		homePage.adminSearch();
	}
		
}
