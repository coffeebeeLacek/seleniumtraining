package test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import us.fallenfootwear.index;

public class TestBase {
	public WebDriverWait wait;
	public WebDriver driver;
	public String url = "https://fallenfootwear.us";
	index in;
	@BeforeTest
	public WebDriver init() {
		String projectPath = System.getProperty("user.dir");
		String fileSep = File.separator;
		String driverPath = projectPath + fileSep + "chromedriver.exe";		
		
		System.setProperty("webdriver.chrome.driver", driverPath);		
		driver = new ChromeDriver();		
		driver.get(url);
		in = new index(driver);

		return driver;
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
	
	
}
