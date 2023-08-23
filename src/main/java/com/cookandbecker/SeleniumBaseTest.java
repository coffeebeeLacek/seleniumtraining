package com.cookandbecker;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SeleniumBaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	String path = System.getProperty("user.dir") + File.separator + "chromedriver.exe";
	String driverPath = System.getProperty("webdriver.chrome.driver", path);
	public String URL = "https://www.cookandbecker.com/en";
	//public String gameArt = "//a[@class='link link--regular menu-bar__overlay-item']//span[@class='link__span'][normalize-space()='Game art']" ;
	//                         a[@class='link link--regular menu-bar__overlay-item']//span[@class='link__span'][normalize-space()='Home inspiration']
	//                         a[@class='link menu-bar__overlay-item link--regular']//span[@class='link__span'][normalize-space()='Books, notebooks and vinyl']
	
	public void createDriver()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.silentOutput","true");
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        //driver = new ChromeDriver(options);
        wait = new WebDriverWait(this.driver,java.time.Duration.ofMillis(350000));		
	}
	
	public void click(String xpath)
	{
		WebElement el = driver.findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.elementToBeClickable(el));
		//System.out.println("Clicking element "+ el);
		el.click();
	}
	
	public String dropDowns(String name)
	{
	   String path = "//a[@class='link link--regular menu-bar__overlay-item']//span[@class='link__span'][normalize-space()='"+name+"']";
	   return path;
	}
	public String headerLink(String name)
	{
	   String path = "//a[@class='link menu-bar__overlay-item link--regular']//span[@class='link__span'][normalize-space()='"+name+"']";
	   return path;
	}
}
