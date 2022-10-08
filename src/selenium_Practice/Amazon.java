package selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByValue("search-alias=baby");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("soft toys");
		Thread.sleep(2000);
		List<WebElement> total_suggestion = driver
				.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div/div"));
		for (WebElement suggestion : total_suggestion) {
			String text = suggestion.getText();
			if (text.equals("soft toys")) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", suggestion);
				break;
			}
		}
		Thread.sleep(2000);
		List<WebElement> moreresults = driver.findElements(By.xpath("//span[text()='MORE RESULTS']/following::div[@data-component-type='s-search-result']"));
		System.out.println("the total more results is : "+moreresults.size());
		List<WebElement> results = driver.findElements(By.xpath("//span[text()='MORE RESULTS']/preceding::div[@data-component-type='s-search-result']"));
		System.out.println("the total results is : "+results.size());

	}

}
