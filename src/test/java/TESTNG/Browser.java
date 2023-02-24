package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver Driver;
	@Parameters({ "name","pass","browser"})
	@Test
	public void multiple(String name,String pass,String browser) throws InterruptedException
	{
		SoftAssert ss = new SoftAssert();
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 Driver =new ChromeDriver();
			Driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 Driver =new EdgeDriver();
			Driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 Driver =new ChromeDriver();
			Driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 Driver =new EdgeDriver();
			Driver.manage().window().maximize();
		}else
		{
			System.out.println("Browser not found");
		}
		
		Driver.navigate().to("https://www.saucedemo.com/");
		String Title=Driver.getTitle();
		System.out.println(Title);
		Thread.sleep(2000);
		ss.assertEquals(Driver.getTitle(), "Swag Labs");
		WebElement username = Driver.findElement(By.xpath("//input[@type='text']"));
		ss.assertTrue(username.isDisplayed());
		username.sendKeys(name);
	    Thread.sleep(2000);
	    WebElement password = Driver.findElement(By.xpath("//input[@id='password']"));
		ss.assertTrue(password.isDisplayed());
		password.sendKeys(pass);
	    Thread.sleep(2000);
	
	    WebElement logbutton = Driver.findElement(By.cssSelector("[id='login-button']"));
	    logbutton.click();
		Thread.sleep(10000);
		ss.assertAll();
	}

}
