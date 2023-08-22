package utility;

import org.testng.annotations.Test;

public class SeleniumTest extends SeleniumBaseTest{
	
	
	
	@Test
	public void test()
	{
		createDriver();
		driver.get(URL);
		click(dropDowns("Game art"));
		click(dropDowns("Home inspiration"));
		click(dropDowns("Studios"));
		click(dropDowns("Artists"));
		click(headerLink("Catalog"));
		click(headerLink("Magazine"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
	}

}
