package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project_2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://automationpractice.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement women = wd.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		women.click();
		WebElement dropdown = wd.findElement(By.xpath("(//span[@class='grower CLOSE'])[2]"));
		dropdown.click();
		WebElement casual = wd.findElement(
				By.xpath("(//a[contains(@title,'You are looking for a dress for every day? Take a look at')])[1]"));
		casual.click();
		WebElement movetodress = wd.findElement(By.xpath("//div[@class='right-block']"));
		Actions a = new Actions(wd);
		a.moveToElement(movetodress).build().perform();
		WebElement addcart = wd.findElement(By.xpath("//span[text()='Add to cart']"));
		addcart.click();
		WebElement checkout = wd.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		checkout.click();
		WebElement qty = wd.findElement(By.xpath("(//input[@type='text'])[2]"));
		qty.sendKeys("9");
		WebElement pay_checkout = wd.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		pay_checkout.click();
		//create account
		WebElement crt_email = wd.findElement(By.xpath("//input[@id='email_create']"));
		crt_email.sendKeys("naveensnj838@gmail.com");
		WebElement create_acc = wd.findElement(By.xpath("(//button[@type='submit'])[2]"));
		create_acc.click();
		WebElement mr = wd.findElement(By.xpath("//input[@id='id_gender1']"));
		mr.click();
		WebElement first_name = wd.findElement(By.xpath("//input[@id='customer_firstname']"));
		first_name.sendKeys("vignesh");
		WebElement last_name = wd.findElement(By.xpath("//input[@id='customer_lastname']"));
		last_name.sendKeys("s");
		WebElement pass = wd.findElement(By.id("passwd"));
		pass.sendKeys("Viki@1301");
		WebElement day = wd.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("24");
		WebElement month = wd.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		WebElement years = wd.findElement(By.id("years"));
		Select s2 = new Select(years);
		s2.selectByValue("1994");
		WebElement company = wd.findElement(By.id("company"));
		company.sendKeys("vector");
		WebElement address = wd.findElement(By.id("address1"));
		address.sendKeys("no-3,roy street");
		WebElement address1 = wd.findElement(By.id("address2"));
		address1.sendKeys("germany,chennai");
		WebElement city = wd.findElement(By.id("city"));
		city.sendKeys("chennai");
		WebElement state = wd.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select s3 = new Select(state);
		s3.selectByValue("46");
		WebElement postcode = wd.findElement(By.id("postcode"));
		postcode.sendKeys("99950");
		WebElement country = wd.findElement(By.xpath("//select[@name='id_country']"));
		Select s4 = new Select(country);
		s4.selectByValue("21");
		WebElement other_info = wd.findElement(By.id("other"));
		other_info.sendKeys("dress to be ordered for women in automation site");
		WebElement home_phone = wd.findElement(By.id("phone"));
		home_phone.sendKeys("044-24252627");
		WebElement mobile_no = wd.findElement(By.xpath("(//input[@class='form-control'])[8]"));
		mobile_no.sendKeys("8652354659");
		WebElement alias = wd.findElement(By.id("alias"));
		alias.sendKeys("ramapuram,germany");
		WebElement submit_acc = wd.findElement(By.id("submitAccount"));
		submit_acc.click();
		WebElement message = wd.findElement(By.xpath("//textarea[@class='form-control']"));
		message.sendKeys("super site for practicing");
		WebElement proceed = wd.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		proceed.click();
		WebElement check_box = wd.findElement(By.id("cgv"));
		check_box.click();
		WebElement checkout_deliv = wd.findElement(By.xpath("//button[@name='processCarrier']"));
		checkout_deliv.click();
		WebElement payment = wd.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		WebElement check_out = wd.findElement(By.xpath("(//button[@type='submit'])[2]"));
		check_out.click();
		TakesScreenshot ts = (TakesScreenshot) wd;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\miniproj.png");
		FileUtils.copyFile(source, desti);

	}

}
