package us.fallenfootwear;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

	//Instance Variables
	public WebDriverWait wait;
	public WebDriver driver;
	
	//Constructor Example
	public PageBase(WebDriver driver) {
		this.driver = driver;
	wait = new WebDriverWait(driver,Duration.ofMillis(2500));			
	}
	
	//Methods	
	public PageBase clickByID(String id) {
	WebElement element = driver.findElement(By.id(id));
	element.click();
	return new PageBase(driver);
}
	public WebElement findByXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
		
		return driver.findElement(By.xpath(xpath));
	
	}
	
	public PageBase selectLinkByText(String text) {
		WebElement downloadApp = findByXpath("//a[contains(text(),'"+text+"')]");
		downloadApp.click();
		return new PageBase(driver);
	}
}
