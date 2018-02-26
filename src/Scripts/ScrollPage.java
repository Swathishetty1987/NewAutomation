package Scripts;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.HomePage;

public class ScrollPage extends BaseTest {
@Test
	public void testScroll() throws Exception
	{
		HomePage h=new HomePage(driver);
		h.ClickLoginin();
	
		h.setemailid("swathi.js@gmail.com");
		h.setpassword("hellosishellosis");
		h.ClickLoginhere();
		Thread.sleep(2000);
		h.clicksolitaire();
		Thread.sleep(2000);
		JavascriptExecutor e= (JavascriptExecutor) driver;
		
		WebElement policies = driver.findElement(By.xpath("//span[.='POLICIES']"));

		for(int i=0;i<=5;i++)
		{
		e.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
	//	e.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		}

	}
}
