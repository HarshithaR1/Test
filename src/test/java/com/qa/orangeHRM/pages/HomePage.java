package com.qa.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.orangeHRM.utils.ElementUtil;

public class HomePage {

	private WebDriver driver;
	ElementUtil eleUtil;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		 eleUtil = new ElementUtil(driver);
	}
	
	By searchMenu = By.xpath("//input[@placeholder='Search']");
	
	public void adminSearch() {
		eleUtil.getEle(searchMenu).sendKeys("Admin",Keys.ENTER);
	}
}
		
	