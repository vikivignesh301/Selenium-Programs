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
import org.seleniumhq.jetty9.server.HttpConnection;

public class Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("total links in application : " + alllinks.size());
		for (int i = 0; i < alllinks.size(); i++) {
			if (alllinks.get(i).getAttribute("href") != null
					&& (!alllinks.get(i).getAttribute("href").contains("javascript"))) {
				String url = alllinks.get(i).getAttribute("href");
				URL link = new URL(url);
				HttpURLConnection Connection = (HttpURLConnection) link.openConnection();
				Connection.connect();
				int response = Connection.getResponseCode();
				Connection.disconnect();
				if (response >= 400) {
					System.out.println(url + "--->" + "is broken link");
				} else {
					System.out.println(url + "--->" + "is valid link");
				}
			}
		}
	}
}
