package com.qa.orangeHRM.factory;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver driver;
	public Properties prop;

	public Properties initProp() {

		FileInputStream file;
		try {
			file = new FileInputStream("F:\\workspace\\OrangeHRM\\src\\test\\resources\\config.properties");

			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	}

	public WebDriver initBrowser(Properties prop) {

		String browser = prop.getProperty("browser");
		System.out.println(browser);
		switch (browser) {
		case "ch":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "ff":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please enter the correct Browser");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
