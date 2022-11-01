package selenium_Practice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_Webtable {

	public static WebDriver driver;
	public static Map<String, Integer> headerindexmap = new LinkedHashMap<>();
	public static Integer indexofcountry;
	public static Integer indexofpopulation;
	public static Integer indexoftotalrecovered;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();

	}

	public static void allHeader() {
		List<WebElement> allheader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allheader.size(); i++) {
			String header = allheader.get(i).getText().replaceAll("\n", "");
			headerindexmap.put(header, i);
		}
		Set<Entry<String, Integer>> entrySet = headerindexmap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		indexofcountry = headerindexmap.get("Country,Other");
		indexofpopulation = headerindexmap.get("Population");
		indexoftotalrecovered = headerindexmap.get("TotalRecovered");

		System.out.println("Index of Country is : " + indexofcountry);
		System.out.println("Index of Population is : " + indexofpopulation);
	}

	public static void particularData(String countryname) {
		List<WebElement> allrows = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));

		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> allcolumns = allrows.get(i).findElements(By.xpath("td"));

			for (int j = 0; j < allcolumns.size(); j++) {
				if (allcolumns.get(indexofcountry).getText().equals(countryname)) {
					System.out
							.println(countryname + "country Population" + allcolumns.get(indexofpopulation).getText());
					System.out.println(
							countryname + "country Population" + allcolumns.get(indexoftotalrecovered).getText());
				break;
				}
			}

		}

	}

	public static void allData() throws InterruptedException {
		List<WebElement> alldata = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td"));
		for (WebElement data : alldata) {
//			Thread.sleep(0050);
			System.out.println(data.getText());
		}
	}

	

	public static void main(String[] args) {
		browserLaunch();
		allHeader();
//		particularData("india");
	}

}
