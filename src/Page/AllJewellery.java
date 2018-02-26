package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllJewellery {
public WebDriver driver;
	@FindBy(xpath="(//a[.='Rings'])[5]")
	private WebElement rings;
	
	@FindBy(xpath="(//a[.=' Earrings'])")
	private WebElement Earrings;
	
	@FindBy(xpath="(//a[.=' Pendants'])")
	private WebElement Pendants;
	
	@FindBy(xpath="(//a[.=' Bangles'])")
	private WebElement Bangles;
	
	@FindBy(xpath="(//a[.=' Bracelets'])")
	private WebElement Bracelets;
	
	@FindBy(xpath="(//a[.=' Nosepins'])")
	private WebElement Nosepins;
	
	@FindBy(xpath="(//a[.=' Necklaces'])")
	private WebElement Necklaces;
	
	@FindBy(xpath="(//a[.=' Mangalsutras'])")
	private WebElement Mangalsutras;
	
	@FindBy(xpath="//span[.='Price']")
	private WebElement Pric;
	
	@FindBy(id="Type-form")
	private WebElement Type;

	
	@FindBy(id="Metal-form")
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
	
	public AllJewellery(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickrings()
	{
		rings.click();
	}
	
	public void clickEarrings()
	{
		Earrings.click();
	}
	
	public void clickPendants()
	{
		Pendants.click();
	}
	
	public void clickBangles()
	{
		Bangles.click();
	}
	
	public void clickBracelets()
	{
		Bracelets.click();
	}
	
	public void clickNosepins()
	{
		Nosepins.click();
	}
	public void clickNecklaces()
	{
		Necklaces.click();
	}
	public void clickMangalsutras()
	{
		Mangalsutras.click();
	}
	
			
	public void move_mouse_Pric(){
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Pric).perform();
	}
	
    public void move_mouse_Type(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Type).perform();
	}

    public void move_mouse_MetalForm(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(MetalForm).perform();
	}

    public void move_mouse_Gender(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Gender).perform();
	}

    public void move_mouse_GoldPurity(){
		
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
	
	public void move_mouse_Popular(){
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Popular).perform();
	}
		
	
}

