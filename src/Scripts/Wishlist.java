package Scripts;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.AUL;
import Generic.BaseTest;
import Page.HomePage;
import Page.SolitairePage;
import Page.Wishlistpage;

public class Wishlist extends BaseTest {
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
		Thread.sleep(5000);
		SolitairePage s=new SolitairePage(driver);
		s.addwishlist();
		Thread.sleep(2000);
		h.wishlist();
		Thread.sleep(2000);
		Wishlistpage w=new Wishlistpage(driver);
		w.open_product();
		Thread.sleep(2000);
		w.share_email();

		String email=AUL.getcellvalue(EXCEL_PATH,"Sheet1",1,0);
		w.to_email(email);
		w.send_email();	
		w.verifyconfirmation(driver);
	}
}
