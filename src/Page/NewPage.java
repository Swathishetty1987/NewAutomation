package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NewPage {

	@FindBy(xpath="//span[@class='b-price-wrapper']")
	private List<WebElement> all;

	@FindBy(xpath="//span[@class='total-designs']")
	private WebElement value;

	public NewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void size()
	{
		int adigit=all.size();
		System.out.println(adigit);
	String newvalue =value.getText();
		String[] a = newvalue.split(" ");
		String digit = a[0];
		int edigit=Integer.parseInt(digit);
	

	if(adigit==edigit)
	{
		Reporter.log("pass",true);

	}	
	else
	{
		Reporter.log("fail", true);
	}
}
	
}
