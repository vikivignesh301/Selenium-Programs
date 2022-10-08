package selenium_Practice;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement text = driver.findElement(By.tagName("h2"));
		String t = text.getText();
		System.out.println(t);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jamesvk@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("java@123");

		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\login_acc.png");
		FileUtils.copyFile(source, destination);

		driver.navigate().back();

		WebElement crt_acc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		crt_acc.click();
		
		Thread.sleep(2000);

		WebElement first_name = driver.findElement(By.name("firstname"));
		first_name.sendKeys("vking");

		WebElement last_name = driver.findElement(By.name("lastname"));
		last_name.sendKeys("raja");

		WebElement mobile = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mobile.sendKeys("8222282222");

		WebElement crt_pass = driver.findElement(By.xpath("//input[@data-type='password']"));
		crt_pass.sendKeys("12345678");

		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("4");

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Mar");

		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("1993");

		WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
		male.click();

		WebElement crtacc_submit = driver.findElement(By.name("websubmit"));
		crtacc_submit.click();

		Thread.sleep(7000);
		
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\VIGNESH S\\eclipse-workspace\\Selenium\\Screenshort\\create_acc.png");
		FileUtils.copyFile(source1, destination1);
	}
}
