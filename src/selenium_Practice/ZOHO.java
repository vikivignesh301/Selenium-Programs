package selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZOHO {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/login.html");
		driver.manage().window().maximize();
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
		signup.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("james@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("viki@123");
		Thread.sleep(2000);
		WebElement check_button = driver.findElement(By.xpath("//span[@class='unchecked']"));
		check_button.click();
		Thread.sleep(1000);
//		WebElement submit = driver.findElement(By.xpath("//input[@onclick='return zSignupPrevent();']"));
//		submit.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\zoho.png");
		FileUtils.copyFile(source, destination);
	}
}
