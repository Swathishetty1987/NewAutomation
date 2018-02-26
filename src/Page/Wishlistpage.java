package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Wishlistpage {

	@FindBy(xpath="//a[@class='btn with-icon-l outline email']")
	private WebElement shareemail;

	@FindBy(xpath="//textarea[@id='shareWishListId']")
	private WebElement to;


	@FindBy(xpath="//input[@value='Send via email']")
	private WebElement sendemail;

	@FindBy(xpath="//h1[.='Thank you']")
	private WebElement ele;
	
	@FindBy(xpath="//a[.=' Open Product ']")
	private List<WebElement> openProduct;

	public Wishlistpage(WebDriver driver)
	{

		PageFactory.initElements(driver,this);
	}

	public void share_email()
	{
		shareemail.click();
	}

	public void to_email(String email)
	{
		to.sendKeys(email);
	}
	public void send_email()
	{
		sendemail.click();
	}
	
	public void open_product()
	{
		int size=openProduct.size();
		String stsize=size+"";
		Reporter.log(stsize,true);
				}


	public void verifyconfirmation(WebDriver driver)
	{

		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));

		try
		{
			Reporter.log("confirmation is pass",true);
		}

		catch(Exception e)
		{
			Reporter.log("Confirmation fails",true);
		}
		
	}


}
