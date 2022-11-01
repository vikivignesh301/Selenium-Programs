package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		option.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		
	}

}
