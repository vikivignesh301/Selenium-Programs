package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Practice { // Edge Browser Launch

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe"); // driver path
		WebDriver wd = new EdgeDriver();
//		wd.get("https://www.instagram.com/");  //launch browser
//		wd.get("https://www.amazon.in/");  
//		wd.get("https://leafground.com/pages/Dropdown.html");  //browse to leafground
//		wd.get("https://demo.automationtesting.in/Alerts.html"); // Alert
//		wd.get("https://demo.automationtesting.in/Frames.html"); // Frames
//		wd.get("https://leafground.com/pages/drop.html");   //Actions
//		wd.get("https://www.flipkart.com");   // Robot Class
		wd.get("https://www.myntra.com/");   //javascript
//		wd.get("http://www.album.alexflueras.ro/");  //horizontal scroll
		wd.manage().window().maximize(); // maximize
//		wd.navigate().to("https://www.flipkart.com/");    //navigate to flipkart
//		wd.navigate().back();   //back to instagram
//		wd.navigate().forward();   //forward to flipkart
//		wd.navigate().refresh();    //refresh  flipkart
//		Dimension d = new Dimension(750,500);   //minimise to size on left side 
//		wd.manage().window().setSize(d);
//		Point p = new Point(500,250);            //minimis to size with center of the windows
//		wd.manage().window().setPosition(p);
//		String title = wd.getTitle();      //get title
//		System.out.println(title);
//		String currentUrl = wd.getCurrentUrl();    //get current title
//		System.out.println(currentUrl);
//		String pageSource = wd.getPageSource();     //get pagesource
//		System.out.println(pageSource);
//		Thread.sleep(2000);
//		WebElement username = wd.findElement(By.name("username"));
//		username.sendKeys("naveensnk0690@gmail.com");
//		WebElement pass = wd.findElement(By.name("password"));
//		pass.sendKeys("123456789");
//		WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
//		login.click();
//		Thread.sleep(2000);
//		WebElement signup = wd.findElement(By.xpath("//span[text()='Sign up']"));
//		signup.click();
//		Thread.sleep(1000);
//		WebElement email = wd.findElement(By.name("emailOrPhone"));
//		email.sendKeys("9042198555");
//		Thread.sleep(1000);
//		WebElement name = wd.findElement(By.name("fullName"));
//		name.sendKeys("naveen");
//		Thread.sleep(1000);
//		WebElement user = wd.findElement(By.name("username"));
//		user.sendKeys("naveen12345");
//		Thread.sleep(1000);
//		WebElement pwd = wd.findElement(By.name("password"));
//		pwd.sendKeys("naveen12");
//		Thread.sleep(1000);
//		WebElement submit = wd.findElement(By.xpath("//button[@type='submit']"));
//		submit.click();
//		Thread.sleep(2000);
//		
//		// single Dropdown example                          //dropdown
//		WebElement dropdown1 = wd.findElement(By.id("dropdown1"));
//		Select s = new Select(dropdown1);
//		s.selectByValue("1");
//		WebElement dropdown2 = wd.findElement(By.name("dropdown2"));
//		Select s1 = new Select(dropdown2);
//		s1.selectByIndex(2);
//		WebElement dropdown3 = wd.findElement(By.id("dropdown3"));
//		Select s2 = new Select(dropdown3);
//		s2.selectByVisibleText("UFT/QTP");
//		WebElement dropdown4 = wd.findElement(By.xpath("//select[@class='dropdown']"));
//		Select s3 = new Select(dropdown4);
//		s3.selectByValue("4");
//		WebElement dropdown5 = wd.findElement(By.xpath("(//select)[5]"));
//		Select s4 = new Select(dropdown5);
//		s4.selectByVisibleText("Appium");

//		// multiple dropdown
//		WebElement multi = wd.findElement(By.xpath("(//select)[6]"));
//		Select s5 = new Select(multi);
//		s5.selectByIndex(1);
//		s5.selectByValue("2");
//		s5.selectByVisibleText("UFT/QTP");
//		s5.selectByValue("4");
//		// deselectbyvalue
//		s5.deselectByValue("4");
//		// getoptions
//		List<WebElement> options = s5.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//		}
//		// getallselectedoptions
//		List<WebElement> allSelectedOptions = s5.getAllSelectedOptions();
//		for (WebElement webElement : allSelectedOptions) {
//			System.out.println(webElement.getText());
//		}
//		// getfirstselectedoption
//		WebElement firstSelectedOption = s5.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//
//		// Alert                        //alert
//		// Simple Alert
//		WebElement alert_ok = wd.findElement(By.xpath("//a[@href='#OKTab']"));
//		alert_ok.click();
//		WebElement Simple_ok = wd.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		Simple_ok.click();
//		wd.switchTo().alert().accept();
//		Thread.sleep(2000);
//
//		// Confirm Alert
//		WebElement alert_ok_can = wd.findElement(By.xpath("//a[@href='#CancelTab']"));
//		alert_ok_can.click();
//		WebElement simple_can = wd.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		simple_can.click();
//		wd.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//
//		// Prompt Alert
//		WebElement alert_text = wd.findElement(By.xpath("//a[@href='#Textbox']"));
//		alert_text.click();
//		WebElement simple_text = wd.findElement(By.xpath("//button[@class='btn btn-info']"));
//		simple_text.click();
//		wd.switchTo().alert().getText();
//		wd.switchTo().alert().sendKeys("Vignesh");
//		wd.switchTo().alert().accept();
//
//		// Single Frames                                        //Frames
//		WebElement single_frame = wd.findElement(By.id("singleframe"));
//		wd.switchTo().frame("singleframe");
//
//		WebElement text = wd.findElement(By.xpath("//input[@type='text']"));
//		text.sendKeys("vignesh");
//		wd.switchTo().defaultContent(); // back from all the frame
//
//		// multi frame
//		WebElement multi = wd.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		multi.click();
//
//		WebElement multi_frame = wd.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
//		wd.switchTo().frame(multi_frame);
//
//		WebElement multi_frame1 = wd.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
//		wd.switchTo().frame(multi_frame1);
//
//		WebElement text1 = wd.findElement(By.xpath("//input[@type='text']"));
//		text1.sendKeys("selenium");

//		//Actions
//		//Drag and Drop
		Actions a = new Actions(wd);
//		WebElement from = wd.findElement(By.id("draggable"));
//		WebElement to = wd.findElement(By.id("droppable"));
//		a.dragAndDrop(from, to).build().perform();
//		
//		//Right click
//		WebElement right_click = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
//		a.contextClick(right_click).build().perform();
//		//Double Click
//		WebElement double_click = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
//		a.doubleClick(double_click).build().perform();
//
//		// Click and hold
//		WebElement source = wd.findElement(By.id("draggable"));
//		a.clickAndHold(source);
//		// moveToelement
//		a.moveToElement(source);
//		// release
//		WebElement desti = wd.findElement(By.id("droppable"));
//		a.release(desti).build().perform();
		
//		//Robot for keyboard
//		Robot r = new Robot();
//		WebElement login_cancel = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		login_cancel.click();
//		//Grocery
//		WebElement grocery = wd.findElement(By.xpath("(//div[@class='eFQ30H'])[2]"));
//		a.contextClick(grocery).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		//Mobiles
//		WebElement mobile = wd.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
//		a.contextClick(mobile).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		//Travel
//		WebElement travel = wd.findElement(By.xpath("//img[@alt='Travel']"));
//		a.contextClick(travel).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		//CSS Selector
//		//Locate by ID(method 1) (For Username)
//		WebElement ID_Met1 = wd.findElement(By.cssSelector("input#email"));    //with tag name
//		ID_Met1.sendKeys("8248275881");
//		WebElement ID_Met2 = wd.findElement(By.cssSelector("#email"));    //without tag name
//		ID_Met2.sendKeys("8248275881");
//		
//		//Locate by Class(method 2) (For Password)
//		WebElement Class_met1 = wd.findElement(By.cssSelector("input._9npi"));   //with tagname and half classname
//		Class_met1.sendKeys("123456789");         								// Full stop for Spaces
//				
//		//Locate by Name or Attribute  (For Login)
//		WebElement Name_1 = wd.findElement(By.cssSelector("[name='login']"));   //without tagname
//		Name_1.click();
//		WebElement Name_2 = wd.findElement(By.cssSelector("button[name='login']"));  //with tagname
//		Name_2.click();
//		
//		//Match with Prefix  (For Username)
//		WebElement prefix = wd.findElement(By.cssSelector("[aria-label^='Email address or']"));  //first half letter
//		prefix.sendKeys("8248275881");
//		
//		//Match With Suffix  (For Password)
//		WebElement suffix = wd.findElement(By.cssSelector("[data-testid$='_pass']"));   //last half letter
//		suffix.sendKeys("123456789");
//		
//		//Match With Substring (For login)
//		WebElement Substring = wd.findElement(By.cssSelector("[data-testid*='al_login_b']"));   //substring
//		Substring.click();
		
//		//GetWindowHandles
//		Thread.sleep(3000);
//		WebElement loginclose = wd.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		loginclose.click();
//		WebElement mobiles = wd.findElement(By.xpath("//img[@alt='Mobiles']"));
//		a.contextClick(mobiles).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		WebElement elctronics = wd.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[3]"));
//		a.contextClick(elctronics).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		WebElement home = wd.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
//		a.contextClick(home).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		WebElement travel = wd.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
//		a.contextClick(travel).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		Set<String> windowHandles = wd.getWindowHandles();
//		for (String string : windowHandles) {
//			System.out.println(wd.switchTo().window(string).getTitle());
//		}
//		Thread.sleep(3000);
//		String s = "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
//		for (String string : windowHandles) {
//			if(wd.switchTo().window(string).getTitle().equalsIgnoreCase(s)) {
//			break;
//			}
//		}
		//to find links in webpage
		List<WebElement> totallinks = wd.findElements(By.tagName("a"));
		int size = totallinks.size();
		System.out.println("total no of Links = " + size);
		for (WebElement webElement : totallinks) {
			System.out.println(webElement.getAttribute("href"));
				}

			}
//		
		//javascriptexecutor
//		JavascriptExecutor js = (JavascriptExecutor) wd;
//		js.executeScript("window.scrollBy(0,2000)");    //scroll down
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");    //scroll up
//		js.executeScript("window.scrollBy(3000,0)");   //horizontal scroll
//		WebElement onlineshopping = wd.findElement(By.xpath("(//a[@data-reactid='8'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView()", onlineshopping);
//		
		//Takescreenshort		
//		TakesScreenshot ts = (TakesScreenshot) wd;
//		File Source = ts.getScreenshotAs(OutputType.FILE);
//		File Destination = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\error0.png");
//		FileUtils.copyFile(Source, Destination);

	}

