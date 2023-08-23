package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

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
	String email = "garrett.gessell@lacek.com";
	
	@Test
	public void inputEmail() throws InterruptedException {
		in.inputEmailToNewsletterModal(email);		
	}
	
	
	@Test
	public void hashExample()	{
		HashMap<String, String> jordan = new HashMap<String, String>();
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		jordan.put("fav_person", "jordan");
		jordan.put("jordans_fav_person", "nik");
		System.out.println(jordan.get("fav_person"));
		
		hash.put(1, "first");
		hash.put(2, "second");
		System.out.println(hash.get(2));		
	}
	
}
