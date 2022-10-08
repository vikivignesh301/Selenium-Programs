package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AIR_ASIA {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.airasia.co.in/home");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement triptype = driver.findElement(By.id("One Way"));
		js.executeScript("arguments[0].click()", triptype);
		driver.findElement(By.xpath("//div[@data-testid='source-field']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("basic-url")).sendKeys("chennai");
		Thread.sleep(1000);
		WebElement listclick = driver.findElement(By.id("list-item"));
		listclick.click();
		Thread.sleep(1000);
		driver.findElement(By.id("basic-url")).sendKeys("new delhi");
		WebElement listclick1 = driver.findElement(By.id("list-item"));
		listclick1.click();
		Thread.sleep(1000);
		WebElement datecontainer = driver.findElement(By.xpath("//div[@class='flight-search-date-picker-wrapper']"));
		datecontainer.click();
		Thread.sleep(1000);
		WebElement dateselect = driver.findElement(By.xpath("//div[text()='Oct 2022']//following-sibling::div/div[5]/div[7]"));
		js.executeScript("arguments[0].scrollIntoView()", dateselect);
		js.executeScript("arguments[0].click()", dateselect);
		Thread.sleep(1000);
		WebElement back = driver.findElement(By.xpath("//button[@class='btn-back']"));
		back.click();
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.xpath("//div[@data-testid='handleClick']"));
		dropdown.click();
		Thread.sleep(1000);
		WebElement seniorcitizzen = driver.findElement(By.id("scp"));
		seniorcitizzen.click();
		WebElement done = driver.findElement(By.xpath("//button[text()='Done']"));
		done.click();
		WebElement flightsearch = driver.findElement(By.xpath("//img[@alt='select']"));
		flightsearch.click();

	}
}
