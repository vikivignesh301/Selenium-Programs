package selenium_Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Star_Health_Insurance {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.starhealth.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		WebElement plans = driver.findElement(By.xpath("//div[@class='homeHeaderMenuGA']"));
		a.moveToElement(plans).build().perform();
		WebElement health_insurance = driver.findElement(By.xpath("//div[text()='Health Insurance']"));
		a.moveToElement(health_insurance).build().perform();
		WebElement for_me = driver.findElement(By.xpath("//div[text()='For Me']"));
		a.moveToElement(for_me).build().perform();
		for_me.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(for_me));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
	}

}
