package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Year;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Class {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver wd = new ChromeDriver(); // upcasting
//		wd.get("https://www.facebook.com/"); // browser launch //CSS Selector //javascriptexecutor task //Wait
//		wd.get("https://www.amazon.in/"); // task amazon search box and Robot for keyboard
//		wd.get("https://leafground.com/pages/Dropdown.html"); // single and multiple dropdown 
//		wd.get("https://demo.automationtesting.in/Alerts.html"); // Alert
//		wd.get("https://demo.automationtesting.in/Frames.html"); //Frames
//		wd.get("https://leafground.com/pages/drop.html");   //Actions
//		wd.get("https://www.flipkart.com"); // getwindowhandles  //javeScriptExecutor
//		wd.get("http://www.album.alexflueras.ro/");  //horizontal scroll  
//		wd.get("https://www.myntra.com/");   // To find Total Links in webpage
		wd.get("https://www.javatpoint.com/"); // Absolute X-Path
		wd.manage().window().maximize(); // maximize
//		// =================================//navigation methods==========================================
//		wd.navigate().to("https://www.instagram.com/"); // change to another url
//		wd.manage().window().maximize();
//		
//		wd.navigate().back(); // navigate back to facebook
//		
//		wd.navigate().forward(); // navigate forward to instagram
//		
//		wd.navigate().refresh(); // navigate refresh instagram
//		// =========================================close======================================================
//		wd.close();
//		//=========================================minimize=======================================================
//		//minimize
//		//Dimension
//		Dimension min = new Dimension(750,500);
//		wd.manage().window().setSize(min);
//		
//		//point
//		Point p = new Point(300, 200);
//		wd.manage().window().setPosition(p);
//		//==========================================Get======================================================
//		//Gettitle
//		String title = wd.getTitle();
//		System.out.println(title);
//		
//		//Getcurrenturl
//		String url = wd.getCurrentUrl();
//		System.out.println(url);
//		
//		//Getpagesource
//		String pageSource = wd.getPageSource();
//		System.out.println(pageSource);
//		//=====================================Findwebelement==============================================
//		//Findwebelement
//		WebElement email = wd.findElement(By.id("email"));    //by.id
//		email.sendKeys("James@gmail.com");
//		
//		WebElement pass = wd.findElement(By.name("pass"));    //by.name
//		pass.sendKeys("12345678");                            //sendkeys to enter the value
//		
//		WebElement login = wd.findElement(By.name("login"));
//		login.click();                                        //click for buttons
//		//================================================================================================
//      //isdisplayed
//		boolean displayed = pass.isDisplayed();
//		System.out.println(displayed);
//		
//		//isenabled
//		boolean enabled = pass.isEnabled();
//		System.out.println(enabled);
//		//========================================Relative X-PATH========================================================
//		//x-path (basic)(1-1match)(method 1)
//		WebElement create_acc1 = wd.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		create_acc1.click();
//		
//		//x-path(basic with index)(1of3match)(method 2)
//		WebElement create_acc = wd.findElement(By.xpath("(//a[@role='button'])[2]"));
//		create_acc.click();
//		
//		//x-path (contains attribute) (1-1match)(method 3)
//		WebElement create_acc2 = wd.findElement(By.xpath("//a[contains(@ajaxify,'/reg/spotlight/')]"));
//		create_acc2.click();
//		
//		//x-path ( full text) (1-1match)(method 4)
//		WebElement create_acc3 = wd.findElement(By.xpath("//a[text()='Create New Account']"));
//		create_acc3.click();
//		
//		//x-path (contains text) (1-1match)(method 5)
//		WebElement create_acc4 = wd.findElement(By.xpath("//a[contains(text(),'Create Ne')]"));
//		create_acc4.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement firstname = wd.findElement(By.name("firstname"));
//		firstname.sendKeys("naveen");
//		
//		WebElement lastname = wd.findElement(By.name("lastname"));
//		lastname.sendKeys("kumar");
//		
//		WebElement mobile = wd.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
//		mobile.sendKeys("8248275881");
//		
//		WebElement pass = wd.findElement(By.xpath("//input[contains(@data-type,'password')]"));
//		pass.sendKeys("123456789");

//		//========================================Single Dropdown===========================================
//		
//		//Single dropdown (select keys)                         //single and multiple dropdown
//		WebElement day = wd.findElement(By.id("day"));         //by using selectby values
//		Select s = new Select(day);
//		s.selectByValue("22");
//		
//		WebElement month = wd.findElement(By.id("month"));    //by using selectbyindex
//		Select s1 = new Select(month);
//		s1.selectByIndex(3);
//		
//		WebElement year = wd.findElement(By.id("year"));     //by using selectbyvisibletext
//		Select s2 = new Select(year);
//		s2.selectByVisibleText("1992");
//
//		
//		WebElement gender = wd.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		gender.click();
//		
//		WebElement signup = wd.findElement(By.name("websubmit"));
//		signup.click();
//		
//		Thread.sleep(5000);
//		//========================================Multiple Dropdown===========================================
//		//Multiple Dropdown
//		WebElement multiDropdown = wd.findElement(By.xpath("(//select)[6]"));    //by tagname
//		Select s3 = new Select(multiDropdown);
//		
//		s3.selectByValue("1");                     //select methods
//		
//		s3.selectByIndex(3);
//		
//		s3.selectByVisibleText("Loadrunner");
//		
//		s3.deselectByValue("1");                   //deselect methods
//		
//		boolean multiple = s3.isMultiple();        //to check single or multiple dropdown
//		System.out.println(multiple);
//		
//		//getoptions
//		List<WebElement> options = s3.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(webElement.getText());
//		}
//		//getallselectedoptions
//		List<WebElement> allSelectedOptions = s3.getAllSelectedOptions();
//		for (WebElement webElement : allSelectedOptions) {
//			System.out.println(webElement.getText());
//		}
//		//getfirstselected
//		WebElement firstSelectedOption = s3.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//		
//		//========================================Alert========================================================
//		
//		//Alert                              //Alert
//		// Simple Alert
//		WebElement alert_ok = wd.findElement(By.xpath("//a[@href='#OKTab']"));
//		alert_ok.click();
//		WebElement Simple_ok = wd.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		Simple_ok.click();
//		wd.switchTo().alert().accept();
//		Thread.sleep(2000);
//		
//		//Confirm Alert
//		WebElement alert_ok_can = wd.findElement(By.xpath("//a[@href='#CancelTab']"));
//		alert_ok_can.click();
//		WebElement simple_can = wd.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		simple_can.click();
//		wd.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		
//		//Prompt Alert
//		WebElement alert_text = wd.findElement(By.xpath("//a[@href='#Textbox']"));
//		alert_text.click();
//		WebElement simple_text = wd.findElement(By.xpath("//button[@class='btn btn-info']"));
//		simple_text.click();
//		wd.switchTo().alert().getText();
//		wd.switchTo().alert().sendKeys("Vignesh");
//		wd.switchTo().alert().accept();
//		
//		//========================================Frames========================================================
//		
//		// Single Frames                                             //Frames
//		WebElement single_frame = wd.findElement(By.id("singleframe"));
//		wd.switchTo().frame(single_frame);
//		
//		WebElement text = wd.findElement(By.xpath("//input[@type='text']"));
//		text.sendKeys("vignesh");
//		wd.switchTo().defaultContent(); //back from all the frame 
//		
//		//multi frame
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
//		
//		//========================================Actions========================================================
//		
//		//Actions
//		//Drag and Drop
//		Actions a = new Actions(wd); 
//		WebElement from = wd.findElement(By.id("draggable"));
//		WebElement to = wd.findElement(By.id("droppable"));
//		a.dragAndDrop(from, to).build().perform();
//		
//		//Right click
//		WebElement right_click = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
//		a.contextClick(right_click).build().perform();
//		
//		//Double Click
//		WebElement double_click = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
//		a.doubleClick(double_click).build().perform();
//		
//		//Click and hold
//		WebElement source = wd.findElement(By.id("draggable"));
//		a.clickAndHold(source);
//		
//		//moveToelement
//		a.moveToElement(source);
//		
//		//release
//		WebElement desti = wd.findElement(By.id("droppable"));
//		a.release(desti).build().perform();
//		
//		//Mouse Hover 
//		WebElement mouse_hover = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
//		a.moveToElement(mouse_hover).build().perform();
//		a.contextClick(mouse_hover).build().perform();
//		
//		//========================================Robot========================================================
//
//		//Robot for keyboard    one step down
//		Robot r = new Robot();
//		WebElement books = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
//		a.contextClick(books).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		
//		//Two Step Down
//		WebElement new_release = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_8']"));
//		a.contextClick(new_release).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		
//		//Three step down
//		WebElement electronics = wd.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']"));
//		a.contextClick(electronics).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//				
//		//========================================CSS Selector========================================================
//		
//		//CSS Selector
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
//
//		// =======================================GetWindowHandles==========================================
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
//
//		Set<String> windowHandles = wd.getWindowHandles();
//		for (String string : windowHandles) {
//			System.out.println(wd.switchTo().window(string).getTitle());
//		}
//		Thread.sleep(3000);
//		String s = "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
//		for (String string : windowHandles) {
//			if (wd.switchTo().window(string).getTitle().equalsIgnoreCase(s)) {
//				break;
//			}
//		}
//		// =======================================javeScriptExecutor==========================================
//		
// 	    JavascriptExecutor js = (JavascriptExecutor)wd; // Flipkart and Facebook
//		js.executeScript("window.scroll(0,1000)");    //Scroll
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,1000)");   //ScrollBy  Down
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-500)");   //ScrollBy up
//		js.executeScript("window.scrollBy(3000,0)");   //horizontal Scroll
//		
//		WebElement returnpolicy = wd.findElement(By.xpath("(//a[@class='_1arVWX'])[13]"));
//		js.executeScript("arguments[0].click()", returnpolicy);  //Click
//		
//		WebElement address = wd.findElement(By.xpath("//span[text()='Registered Office Address:']"));
//		js.executeScript("arguments[0].scrollIntoView()",address);
//		
//		//task
//		WebElement email = wd.findElement(By.id("email"));
//		js.executeScript("arguments[0].value='naveensnk24@gmail.com';",email);
//		
//		WebElement pass = wd.findElement(By.name("pass"));
//		js.executeScript("arguments[0].value='123456789';", pass);
//		
//		WebElement login = wd.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()",login);
//				
//		// =======================================To find Total links=====================================
//		List<WebElement> totallinks = wd.findElements(By.tagName("a"));
//		int size = totallinks.size();
//		System.out.println("total no of Links = " + size);
//		for (WebElement webElement : totallinks) {
//			System.out.println(webElement.getAttribute("href"));
//		}
//
//	}
		// =======================================Wait==================================================
//		//Implicit Wait
//		wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		WebElement create = wd.findElement(By.xpath("(//a[@role='button'])[2]"));
//		create.click();
//		WebElement email = wd.findElement(By.name("firstname"));
//		email.sendKeys("james");
//		
//		//Explicit Wait
//		WebDriverWait wait = new WebDriverWait(wd, 50);
//		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname"))).sendKeys("james");
//		
//		//Fluent Wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(wd);
//		             .withTimeout(Duration.ofSeconds(10))
//		             .pollingEvery(Duration.ofSeconds(2))
//		             .withMessage("FB : Message")
//		             .ignoring(NoSuchElementException.class);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys("123654789");
		// =======================================Absolute X-Path========================================
//		wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//		wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/ul/li[3]/a")).click();
//		WebElement app = wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[6]/div[2]/div[1]/table/tbody/tr/td/h2[3]"));
//		js.executeScript("arguments[0].scrollIntoView()",app);
//		
		// Task
		wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/ul/li[3]/a")).click();
		WebElement mcq = wd.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[19]/a[22]/span"));
		mcq.click();

		// =======================================TakeScreenShort========================================

//		Thread.sleep(2000);
//		//TakeScreenShort Day 6
//		TakesScreenshot ts =  (TakesScreenshot) wd ;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination  = new File ("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\frames.png");
//		FileUtils.copyFile(source, destination);
//				
//		//=======================================Task amazon==========================================
//		//task                                                //amazon search box task
//		WebElement amazon_search = wd.findElement(By.id("twotabsearchtextbox"));
//		amazon_search.sendKeys("laptop");	
//		
//		WebElement clss = wd.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
//		clss.sendKeys("laptop");
//		
//		WebElement search = wd.findElement(By.id("nav-search-submit-button"));
//		search.click();

	}

}
