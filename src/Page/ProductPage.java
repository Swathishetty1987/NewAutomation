package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
@FindBy(xpath="//span[@class='text']")
private WebElement tryathome;

@FindBy(id="buy-now")
private WebElement BuyNow;

@FindBy(xpath="//input[@ id='tahLpPhone']")
private WebElement mobileno;

@FindBy(id="try_email_pd")
private WebElement emailaddress;

@FindBy(xpath="//input[@value='Schedule']")
private WebElement schedule;

@FindBy(id="try_name_pd")
private WebElement youraddress;

@FindBy(xpath="//a[@title='Continue Shopping']")
private WebElement continueshopping;

public ProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickTryathome()
{
	tryathome.click();
			
}

public void mobileno(String no)
{
	mobileno.clear();
	mobileno.sendKeys(no);
}

public void emailaddress(String emailadd)
{
	emailaddress.sendKeys(emailadd);
}

public void schedule()
{
	schedule.click();
}

public void clickbuynow()
{
	BuyNow.click();
}


public void clickcontinueshopping() {
	continueshopping.click();
	
}


}

