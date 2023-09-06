package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import us.fallenfootwear.PageBase;
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
		PageBase pb = new PageBase(driver);
		index in = new index(driver);
		in.enterEmailToNewsletter("garrett.gesel@lacek.com");
		in.clickSubscribe();
		
	}
}
