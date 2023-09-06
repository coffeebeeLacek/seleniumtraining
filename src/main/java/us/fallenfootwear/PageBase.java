package us.fallenfootwear;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement findByXpath(String xpath) {
		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
		return driver.findElement(By.xpath(xpath));
	}
	
}
