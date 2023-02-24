package TESTNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script3 {
	@Test
	public void online() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://compendiumdev.co.uk/");
		Thread.sleep(3000);
		  
		List<WebElement> as = driver.findElements(By.xpath("//div[@class='courseimages textCentered'][3]//img"));
		  
		System.out.println("online training size"+as.size());
		
		for(WebElement atr:as) {
			System.out.println("name="+atr.getAttribute("alt"));
			
		}
	}

}
