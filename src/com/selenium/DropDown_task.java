package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_task {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://leafground.com/pages/Dropdown.html");
		wd.manage().window().maximize();
		// single Dropdown
		WebElement dropdown1 = wd.findElement(By.id("dropdown1"));
		Select s = new Select(dropdown1);
		s.selectByValue("1");
		WebElement dropdown2 = wd.findElement(By.name("dropdown2"));
		Select s1 = new Select(dropdown2);
		s1.selectByIndex(2);
		WebElement dropdown3 = wd.findElement(By.id("dropdown3"));
		Select s2 = new Select(dropdown3);
		s2.selectByVisibleText("UFT/QTP");
		WebElement dropdown4 = wd.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3 = new Select(dropdown4);
		s3.selectByValue("4");
		WebElement dropdown5 = wd.findElement(By.xpath("(//select)[5]"));
		Select s4 = new Select(dropdown5);
		s4.selectByVisibleText("Appium");
		// multiple dropdown
		WebElement multi = wd.findElement(By.xpath("(//select)[6]"));
		Select s5 = new Select(multi);
		boolean multi1 = s5.isMultiple();
		System.out.println(multi1);
		s5.selectByIndex(1);
		s5.selectByValue("2");
		s5.selectByVisibleText("UFT/QTP");
		s5.selectByValue("4");
		// deselectbyvalue
		s5.deselectByValue("4");
		// getoptions
		List<WebElement> options = s5.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		// getallselectedoptions
		List<WebElement> allSelectedOptions = s5.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		// getfirstselectedoption
		WebElement firstSelectedOption = s5.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		//Takesscreenshort
		TakesScreenshot ts = (TakesScreenshot) wd;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\image3.png");
		FileUtils.copyFile(source, desti);
		
	}

}
