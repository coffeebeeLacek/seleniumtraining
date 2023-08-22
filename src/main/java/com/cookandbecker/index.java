package com.cookandbecker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class index {

	protected WebDriver driver;
	
	public index(WebDriver driver) {
		this.driver=driver;
	}
	
	////a[contains(@class,'site-nav__link')] Main navigation bar
	
	public index clickByLinkText_MainNav(String linkText) {
		
		//a[contains(@class,'site-nav__link')][contains(text(),'SHOES')]
		WebElement target = driver.findElement(By.xpath("//a[contains(@class,'site-nav__link')][contains(text(),'"+linkText.toUpperCase()+"')]"));
		target.click();

		return new index(driver);
	}
}
