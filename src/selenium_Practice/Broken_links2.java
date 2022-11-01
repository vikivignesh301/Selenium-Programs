package selenium_Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broken_links2 {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("all links in application : " + alllinks.size());
		for (int i = 0; i < alllinks.size(); i++) {
			if (alllinks.get(i).getAttribute("href") != null
					&& (!alllinks.get(i).getAttribute("href").contains("javascript"))) {
				String url = alllinks.get(i).getAttribute("href");

				URL links = new URL(url);
				HttpURLConnection Connection = (HttpURLConnection) links.openConnection();
				Connection.connect();
				int response = Connection.getResponseCode();
				Connection.disconnect();

				if (response >= 400) {
					System.out.println(url + "----->" + "is broken link");
				}

			}

		}
	}

}
