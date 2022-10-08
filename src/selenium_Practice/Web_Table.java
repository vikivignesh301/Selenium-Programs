package selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
	}

	public static void allHaeader() {
		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (WebElement header : allheader) {
			System.out.println(header.getText());
		}
	}

	public static void allData() throws InterruptedException {
		List<WebElement> alldata = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td"));
		for (WebElement data : alldata) {
			Thread.sleep(0050);
			System.out.println(data.getText());
		}
	}

	public static void rowWise() {
		List<WebElement> rowwise = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td"));
		for (WebElement row : rowwise) {
			System.out.println(row.getText());
		}
	}

	public static void coloumWise() throws InterruptedException {
		List<WebElement> coloumwise = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td[2]"));
		for (WebElement coloum : coloumwise) {
			Thread.sleep(0050);
			System.out.println(coloum.getText());
		}
	}

	public static void particularData() {
		WebElement particulardata = driver
				.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td[15]"));
		System.out.println(particulardata.getText());
	}

	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		allHaeader();
		allData();
		rowWise();
		coloumWise();
		particularData();
	}

}
