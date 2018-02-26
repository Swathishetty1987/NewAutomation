package Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import Generic.AUL;
import Generic.BaseTest;
import Page.HomePage;
import Page.ProductPage;
import Page.SolitairePage;

public class TryAtHome extends BaseTest {

@Test
	public void testSolitaire() throws Exception
	{
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	HomePage h=new HomePage(driver);
	h.ClickLoginin();
	Thread.sleep(2000);
	String un=AUL.getcellvalue(EXCEL_PATH,"Sheet1",1,0);
	h.setemailid(un);
	String pw=AUL.getcellvalue(EXCEL_PATH, "Sheet1",1,1);
	h.setpassword(pw);
	h.ClickLoginhere();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Swathi']")));
		//click on try at home
		
		ProductPage p=new ProductPage(driver);
		p.clickTryathome();
		Thread.sleep(2000);
		p.mobileno("974329436");
		p.schedule();
		
		
		}
		
	
		
	}
