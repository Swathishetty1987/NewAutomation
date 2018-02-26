package Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.AllJewellery;
import Page.HomePage;
import Page.ProductPage;
import Page.SolitairePage;

public class AddToCart extends BaseTest {
@Test
	public void testlogin() throws Exception
	{
	//first commit.
		HomePage h=new HomePage(driver);
		h.ClickLoginin();
		h.setemailid("swathi.js@gmail.com");
		h.setpassword("hellosishellosis");
		h.ClickLoginhere();
			h.clicksolitaire();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='pid_8506'])[1]")).click();
		ProductPage p=new ProductPage(driver);
		p.clickbuynow();
		}
}
