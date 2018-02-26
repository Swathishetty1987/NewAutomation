package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolitairePage {

	@FindBy(xpath="//span[.='Price']")
	private WebElement Price;

	@FindBy(xpath="//span[.='Type']")
	private WebElement Type;


	@FindBy(xpath="//span[.='Metal']")
	private WebElement MetalForm;


	@FindBy(id="Gender-form")
	private WebElement Gender;

	@FindBy(id="Gold Purity-form")
	private WebElement 	GoldPurity;

	@FindBy(xpath="//span[.='More Filters']")
	private WebElement MoreFilter;

	@FindBy(xpath="//label[.='Next Day Delivery']")
	private WebElement nextdaydelivery;

	@FindBy(xpath="//span[.=' Popular ']")
	private WebElement Popular;

	@FindBy(xpath="//a[@class='wishlist no-wishlist outline']")
	private WebElement AddtoWishlist;


	@FindBy(xpath="//div[@class='details-button']")
	private WebElement viewdetails;

	public SolitairePage(WebDriver driver)
	{

		PageFactory.initElements(driver,this);
	}

	public void move_mouse_Price(WebDriver driver){

		Actions actions = new Actions(driver);
		actions.moveToElement(Price).build().perform();
	}

	public void move_mouse_Type(WebDriver driver){

		Actions actions = new Actions(driver);
		actions.moveToElement(Type).perform();
	}

	public void move_mouse_MetalForm(WebDriver driver){

		Actions actions = new Actions(driver);
		actions.moveToElement(MetalForm).perform();
	}

	public void move_mouse_Gender(WebDriver driver){

		Actions actions = new Actions(driver);
		actions.moveToElement(Gender).perform();
	}

	public void move_mouse_GoldPurity(WebDriver driver){

		Actions actions = new Actions(driver);
		actions.moveToElement(GoldPurity).perform();
	}

	public void clickMoreFilter(){

		MoreFilter.click();
	}


	public void nextdaydelivery()
	{
		nextdaydelivery.click();			
	}

	public void move_mouse_Popular(WebDriver driver){

		Actions actions = new Actions(driver);
		actions.moveToElement(Popular).perform();
	}

	public void addwishlist()
	{
		AddtoWishlist.click();
	}

	public void Wishlistviewdetails()
	{
		viewdetails.click();
	}
}


