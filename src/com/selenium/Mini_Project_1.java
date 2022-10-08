package com.selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://adactinhotelapp.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebElement user = wd.findElement(By.id("username"));
		user.sendKeys("vignesh1300");
		WebElement pwd = wd.findElement(By.id("password"));
		pwd.sendKeys("Viki@1301");
		WebElement login = wd.findElement(By.id("login"));
		login.click();
		Thread.sleep(2000);
		WebElement location = wd.findElement(By.id("location"));
		Select s = new Select(location);
		location.click();
		s.selectByValue("Paris");
		Thread.sleep(1000);
		WebElement hotel = wd.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		hotel.click();
		s1.selectByIndex(3);
		Thread.sleep(1000);
		WebElement room_type = wd.findElement(By.name("room_type"));
		Select s2 = new Select(room_type);
		room_type.click();
		s2.selectByVisibleText("Super Deluxe");
		Thread.sleep(1000);
		WebElement room_qty = wd.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select s3 = new Select(room_qty);
		room_qty.click();
		s3.selectByValue("2");
		Thread.sleep(1000);
		WebElement date1 = wd.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		date1.clear();
		date1.sendKeys("03/09/2022");
		Thread.sleep(1000);
		WebElement date2 = wd.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
		date2.clear();
		date2.sendKeys("05/09/2022");
		Thread.sleep(1000);
		WebElement person_qty = wd.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(person_qty);
		person_qty.click();
		s4.selectByIndex(2);
		Thread.sleep(1000);
		WebElement child = wd.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(child);
		child.click();
		s5.selectByVisibleText("1 - One");
		Thread.sleep(1000);
		WebElement submit = wd.findElement(By.id("Submit"));
		submit.click();
		Thread.sleep(1000);
		WebElement click_button = wd.findElement(By.xpath("//input[@type='radio']"));
		click_button.click();
		Thread.sleep(1000);
		WebElement continu = wd.findElement(By.id("continue"));
		continu.click();
		WebElement firstname = wd.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Vignesh ");
		WebElement lastname = wd.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("s");
		WebElement address = wd.findElement(By.id("address"));
		address.sendKeys("no2455,benny street,paris");
		WebElement credit_card = wd.findElement(By.xpath("//input[@name='cc_num']"));
		credit_card.sendKeys("1234567891234567");
		WebElement card_type = wd.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(card_type);
		s6.selectByValue("VISA");
		WebElement exp_month = wd.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		Select s7 = new Select(exp_month);
		s7.selectByIndex(11);
		WebElement exp_year = wd.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8 = new Select(exp_year);
		s8.selectByVisibleText("2022");
		WebElement cvv = wd.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("123");
		WebElement book_now = wd.findElement(By.xpath("//input[@name='book_now']"));
		book_now.click();
		Thread.sleep(7000);
		WebElement my_iti = wd.findElement(By.xpath("//input[@name='my_itinerary']"));
		my_iti.click();
		Thread.sleep(2000);
		WebElement logout = wd.findElement(By.id("logout"));
		logout.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) wd;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\image2.png");
		FileUtils.copyFile(source, Destination);
			
			
		
		
	}

}
