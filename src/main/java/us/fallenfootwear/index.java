package us.fallenfootwear;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class index extends PageBase{

	protected WebDriver driver;
	
	//Newsletter elements
	String newsletterID = "NewsletterPopup-newsletter-popup";
	String newsletter = "//*[@id='"+newsletterID+"']";
	
	//Store elements
	String product_grid = "//div[@class='grid-product__content']";
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
	
	public index inputEmailToNewsletterModal(String email) {
		WebElement el = findByXpath(newsletter+"//input[@type='email']");
		el.sendKeys(email);
		assertEquals(email, el.getAttribute("value"));
		return new index(driver);
	}
	
	public index clickNewsLetterSubmit() {
		findByXpath(newsletter+"//button[@type='submit']").click();
		return new index(driver);
	}
	
}
