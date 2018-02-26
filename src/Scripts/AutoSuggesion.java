package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesion {

	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
	}
	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(2000);
		String xp="//div[contains(text(),'java')]";
		List<WebElement> wb = driver.findElements(By.xpath(xp));
		int count=wb.size();
		System.out.println(count);
		
				
		

	}

}
