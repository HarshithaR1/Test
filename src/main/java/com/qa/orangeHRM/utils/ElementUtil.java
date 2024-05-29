package com.qa.orangeHRM.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil{
	private WebDriver driver;
	public ElementUtil(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getEle(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}
	 
	public void doClick(By locator) {
		getEle(locator).click();
	}
	
	public void doSendKeys(By locator, String keys) {
		getEle(locator).sendKeys(keys);
		
	}
	
	public boolean isDisplayed(By locator) {
		return getEle(locator).isDisplayed();
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
		
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	
	
	

}
