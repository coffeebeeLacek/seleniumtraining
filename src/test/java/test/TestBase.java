package test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public WebDriverWait wait;
	public WebDriver driver;
	
	public WebDriver init(String startingLink) {
		String projectPath = System.getProperty("user.dir");
		String fileSep = File.separator;
		String driverPath = projectPath + fileSep + "chromedriver.exe";		
		
		System.setProperty("webdriver.chrome.driver", driverPath);		
		driver = new ChromeDriver();		
		driver.get(startingLink);
		return driver;
	}
	
	
}
