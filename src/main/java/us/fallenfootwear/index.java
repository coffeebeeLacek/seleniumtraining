package us.fallenfootwear;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class index extends PageBase{	
	public index(WebDriver driver) {
	super(driver);
	}
	
	////a[contains(@class,'site-nav__link')] Main navigation bar
	
	public index clickByLinkText_MainNav(String linkText) {
		
		//a[contains(@class,'site-nav__link')][contains(text(),'SHOES')]
		WebElement target = driver.findElement(By.xpath("//a[contains(@class,'site-nav__link')][contains(text(),'"+linkText.toUpperCase()+"')]"));
		target.click();

		return new index(driver);
	}
	
	public index enterEmailToNewsletter(String email) {		
		WebElement el = findByXpath("//input[@id='Email-newsletter-popup']");
		el.sendKeys(email);
		assertEquals(el.getAttribute("value"), email);
		return new index(driver);
	}
	
	public index clickSubscribe() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement el = findByXpath("//span[contains(text(),'Subscribe')]");
		el.click();
		wait = new WebDriverWait(driver, Duration.ofMillis(30000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Thanks for subscribing')]"))));
		System.out.println("Thanks for subcribing is visiible");
		return new index(driver);
	}
	
	public dashboard login() {
		
		return new dashboard(driver);
	}
}
