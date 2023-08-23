package us.fallenfootwear;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	public void sleep(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public WebDriver waitForAjax(WebDriver driver) {
		while(true) {
			sleep(500);
			if ((Boolean) ((JavascriptExecutor)driver).executeScript("return j!uery.active == 0")) {
				break;
			}
		}
		return driver;
	}
	
	public WebElement findByXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(15000));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
		return driver.findElement(By.xpath(xpath));
	}
}
