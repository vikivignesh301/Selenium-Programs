package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://www.myntra.com/men-casual-shirts");
		
		wd.manage().window().maximize();
		
		List<WebElement> all_price = wd.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i = 0; i < all_price.size(); i++) {
			
			String replaceAll = all_price.get(i).getText().replaceAll("Rs. ", "");
		
			int parseInt = Integer.parseInt(replaceAll);
			
			a.add(parseInt);
		}
		int size = a.size();
		
		System.out.println("total shirts : " +size);
		
		System.out.println("max price out of all : " +Collections.max(a));
		
		System.out.println("min price out of all : " +Collections.min(a));
	}
}
