package selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_practice {

	public static void main(String[] args) {

		int count = 0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> allheading = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));

		for (WebElement heading : allheading) {
			count++;
			if (count <= 5) {
				System.out.println(heading.getText());
			}
		}

	}
}
