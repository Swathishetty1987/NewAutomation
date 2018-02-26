package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	@FindBy(id="login")
	private WebElement Loginin;
	
	@FindBy(id="email-id")
	private WebElement emailid;
	
	@FindBy(id="password")
	private WebElement password; 
	
	@FindBy(id="edit-login-account")
	private WebElement Loginhere; 
	
	@FindBy(xpath="//span[.='Solitaires ']")
	private WebElement solitaires; 
	
	@FindBy(xpath="//span[.='All Jewellery ']")
	private WebElement AllJewellery; 
	
	@FindBy(xpath="//span[.='Collections ']")
	private WebElement Collections; 
	
	@FindBy(xpath="//span[.='Gifts ']")
	private WebElement Gifts; 
	
	@FindBy(xpath="//span[@class='icon-img hs wishlist-icon']")
	private WebElement wish;
	 
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickLoginin()
	{
		Loginin.click();
	}
	
	public void setemailid(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void setpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void ClickLoginhere()
	{
		Loginhere.click();
	}
	
	public void clicksolitaire()
	{
		solitaires.click();
	}
	
	public void clicksalljew()
	{
		AllJewellery.click();
	}
	
	public void move_mouse_sol(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(solitaires).perform();
		
	}
	
				
public void move_mouse_jew(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(AllJewellery).perform();
		
	}

public void move_mouse_collections(){
	
	Actions actions = new Actions(driver);
	actions.moveToElement(Collections).perform();
	
}

public void move_mouse_Gifts(){
	
	Actions actions = new Actions(driver);
	actions.moveToElement(Gifts).perform();
	
}

public void wishlist(){
	
	wish.click();
	
}
}

