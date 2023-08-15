package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import us.fallenfootwear.index;


public class first_test  extends TestBase{


	@Test
	public void test1() throws InterruptedException {
		
	}
	
	@Test
	public void testEnglishLocale() throws InterruptedException {
		WebDriver driver = init("https://fallenfootwear.us/");

		driver.get("https://neopets.com");
		Thread.sleep(1500);
		String currentTitle = driver.getTitle();
		assertTrue(currentTitle.contains("Legendary"));
		driver.navigate().back();
		driver.navigate().back();
		driver.close();
		
	}
}
