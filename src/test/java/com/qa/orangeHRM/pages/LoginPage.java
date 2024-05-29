package com.qa.orangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangeHRM.factory.DriverFactory;
import com.qa.orangeHRM.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	DriverFactory df;
	ElementUtil eleUtil;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);

	}

	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By image = By.xpath("//img[@alt='company-branding']");
	By button = By.xpath("//button[text()=' Login ']");
	By forgotPassword = By.xpath("//p[text()='Forgot Your Password? ']");

	public String actualTitle() {
		return eleUtil.getCurrentTitle();
	}	

	public String actualUrl() {
		return eleUtil.getCurrentUrl();
	}

	public boolean isForgetPasswordPresent() {
		return eleUtil.isDisplayed(forgotPassword);
	}

	public HomePage doLogin(String uname, String pwd) {
		eleUtil.doSendKeys(username, uname);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(button);
		return new HomePage(driver);
	}

}
