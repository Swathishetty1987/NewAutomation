package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.AUL;
import Generic.BaseTest;
import Page.HomePage;
import Page.ProductPage;
import Page.SolitairePage;

public class Solitaire extends BaseTest {
  @Test
  public void SolFilterBy() throws Exception {

	  HomePage h=new HomePage(driver);
		h.ClickLoginin();
		Thread.sleep(2000);
		String un=AUL.getcellvalue(EXCEL_PATH,"Sheet1",1,0);
		h.setemailid(un);
		String pw=AUL.getcellvalue(EXCEL_PATH, "Sheet1",1,1);
		h.setpassword(pw);
		h.ClickLoginhere();
		Thread.sleep(2000);
		h.clicksolitaire();
		Thread.sleep(2000);
		SolitairePage s=new SolitairePage(driver);
		s.move_mouse_Price(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-displayname='rs 10000 to rs 20000']")).click();
		Thread.sleep(6000);
		s.move_mouse_Type(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-displayname='rings']")).click();
		
		Thread.sleep(6000);
		s.move_mouse_MetalForm(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-displayname='gold']")).click();
		
		Thread.sleep(6000);
		s.move_mouse_Gender(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-displayname='women']")).click();
		
		Thread.sleep(6000);
		s.move_mouse_GoldPurity(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-displayname='18k']")).click();
		
		Thread.sleep(6000);
		s.clickMoreFilter();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-displayname='next day delivery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='pid_8519'])[1]")).click();
		
		ProductPage p=new ProductPage(driver);
		p.clickbuynow();
         p.clickcontinueshopping();
				
  }
}

