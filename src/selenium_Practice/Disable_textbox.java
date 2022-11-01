package selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_textbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);

		// To disable text box

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String todisable = "document.getElementsByName('firstname')[0].setAttribute('disabled', '');";
		js.executeScript("document.getElementsByName('firstname')[0].setAttribute('disabled', '');");
		Thread.sleep(2000);

		// To enable text box(interview)

//		String toenable ="document.getElementsByName('lastname')[0].setAttribute('disabled', '');" ;
		js.executeScript("document.getElementsByName('lastname')[0].setAttribute('disabled', '');");
		Thread.sleep(3000);
		
		js.executeScript("document.getElementByName('firstname')[0].removeAttribute('disabled')");

		js.executeScript("document.getElementByName('lastname')[0].removeAttribute('disabled')");

	}

}
