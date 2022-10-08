package selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cowin {

	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		driver.manage().window().maximize();
	}

	public static void stateSelect() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement heading = driver.findElement(By.xpath("(//img[@class='img-fluid'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()", heading);
		Thread.sleep(1000);
		WebElement statedropdown = driver
				.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c69-352']"));
		statedropdown.click();
		Thread.sleep(1000);
		List<WebElement> allstates = driver.findElements(By.xpath("//div[@role='listbox']/mat-option"));
		for (WebElement state : allstates) {
			String text = state.getText();
			if (text.trim().equals("Tamil Nadu")) {
				js.executeScript("arguments[0].click();", state);
				break;
			}
		}
		Thread.sleep(1000);
		WebElement districtdropdown = driver
				.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c69-354']"));
		districtdropdown.click();
		Thread.sleep(1000);
		List<WebElement> alldistrict = driver.findElements(By.xpath("//div[@role='listbox']/mat-option"));
		for (WebElement district : alldistrict) {
			String text = district.getText();
			if (text.trim().equals("Chennai")) {
				js.executeScript("arguments[0].click();", district);
				break;
			}
		}
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//button[@tabindex='0']"));
		js.executeScript("arguments[0].click();", search);
		js.executeScript("window.scrollBy(0,500)");
	}

	public static void vaccineDetails() throws InterruptedException {
		Thread.sleep(2000);
		WebElement filter_age18 = driver.findElement(By.xpath("//label[@for='c1']"));
		filter_age18.click();
		Thread.sleep(2000);
		WebElement filter_dose2 = driver.findElement(By.xpath("//label[@for='cdoes2']"));
		filter_dose2.click();
		Thread.sleep(2000);
		WebElement filter_paid = driver.findElement(By.xpath("//label[@for='c6']"));
		filter_paid.click();
		Thread.sleep(2000);
		WebElement filter_covidshield = driver.findElement(By.xpath("//label[@for='c3']"));
		filter_covidshield.click();
	}

	public static void validation() throws InterruptedException {
		List<WebElement> validate = driver
				.findElements(By.xpath("//div[@class='show-result']/descendant::li[@class='ng-star-inserted']/span[2]"));
		Thread.sleep(2000);
		for (WebElement crosscheck : validate) {
			String text = crosscheck.getText();
			if (text.equals("18+")) {
				System.out.println("18+ is Clicked");
			}
			if (text.equals("Paid")) {
				System.out.println("Paid is Clicked");
			}
			if (text.equals("2")) {
				System.out.println("Dose 2 is Clicked");
			}
			if (text.equals("COVISHIELD")) {
				System.out.println("CovidShield is clicked");
			}
		}
	}

	public static void centrePrint() {
		List<WebElement> all_centres = driver.findElements(By.xpath("//div[@class='row-disp']"));
		for (WebElement centre : all_centres) {
			System.out.println("The centre is : " + centre.getText());
		}
	}

	public static void main(String[] args) throws Exception {
		browserLaunch();
		stateSelect();
		vaccineDetails();
		validation();
		centrePrint();
	}

}
