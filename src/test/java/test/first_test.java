package test;


import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import us.fallenfootwear.index;


public class first_test  extends TestBase{


	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = init("https://www.wikipedia.org");
		index indx = new index(driver);
		indx.SelectMainLanguage("fa");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	@Test
	public void testEnglishLocale() throws InterruptedException {
		WebDriver driver = init("https://www.wikipedia.org");
		index indx = new index(driver);
		indx.selectLinkByText("Download Wikipedia for Android or iOS");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	
}
