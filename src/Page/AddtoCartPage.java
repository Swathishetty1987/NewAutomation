package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCartPage {

	@FindBy(xpath="(//a[@class='btn btn-block btn-lg'])[1]")
	private WebElement placeorder;
	
	@FindBy(xpath="//select[@name='shippingAddress.country.id']")
	private WebElement country;
	
	@FindBy(xpath="//select[@name='shippingAddress.postCode']")
	private WebElement postCode;
	
	@FindBy(xpath="//select[@name='shippingAddress.fullname']")
	private WebElement recipient;
	
	@FindBy(xpath="//select[@name='shippingAddress.contactNumber']")
	private WebElement contactnumb;
	
	@FindBy(xpath="//select[@name='shippingAddress.alternateContactNumber']")
	private WebElement altcontactnumb;
	
	@FindBy(xpath="//select[@name='shippingAddress.address']")
	private WebElement shippingaddress;
	
	@FindBy(xpath="//select[@name='shippingAddress.cityName']")
	private WebElement city;
	
	@FindBy(xpath="//select[@name='shippingAddress.state.id']")
	private WebElement state;
	

	

		
	public void Placeorder()
	{
		placeorder.click();
	}
	
	public void Country(String cntry)
	{
		country.clear();	
		country.sendKeys(cntry);
	}
	
	public void PostCode(String pin)
	{
		postCode.clear();
		postCode.sendKeys(pin);
	}
	
	public void Recipient(String name)
	{
		recipient.clear();
		recipient.sendKeys(name);
	}
	
	public void Contactnumb(String contactno)
	{
		contactnumb.clear();
		contactnumb.sendKeys(contactno);
	}
	
	public void AltContactnumb(String altcontactno)
	{
		altcontactnumb.clear();
		altcontactnumb.sendKeys(altcontactno);
	}
	
	public void Shippingaddress(String shippingadd)
	{
		shippingaddress.clear();
		shippingaddress.sendKeys(shippingadd);
	}
	
	public void City(String city)
	{
		shippingaddress.clear();
		shippingaddress.sendKeys(city);
	}
	
	public void State(String state)
	{
		shippingaddress.clear();
		shippingaddress.sendKeys(state);
	}
}
