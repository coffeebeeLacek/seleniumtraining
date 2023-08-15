package us.fallenfootwear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class index extends PageBase{

	private WebDriver driver;
	String CentralLanguage = "//div[contains(@class,'central-featured-lang')]";
	
	public index(WebDriver driver) {
		super(driver);
	}
	
	public index SelectMainLanguage(String lang) {
		findByXpath(CentralLanguage+"[@lang='"+lang+"']/a").click();
		return new index(driver);
	}
	
	
	
}
