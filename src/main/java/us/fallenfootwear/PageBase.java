package us.fallenfootwear;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
	}
}
