package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(Listenerclassdemo.class)
public class Softassertdemo 
{
	public static WebDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		SoftAssert ss = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.saucedemo.com/");
		String Title=Driver.getTitle();
		System.out.println(Title);
		Thread.sleep(2000);
		ss.assertEquals(Driver.getTitle(), "Swag Labs");
		WebElement username = Driver.findElement(By.xpath("//input[@type='text']"));
		ss.assertTrue(username.isDisplayed());
		username.sendKeys("standard_user");
	    Thread.sleep(2000);
	    WebElement password = Driver.findElement(By.xpath("//input[@id='password']"));
		ss.assertTrue(password.isDisplayed());
		password.sendKeys("secret_sauce");
	    Thread.sleep(2000);
	
	    WebElement logbutton = Driver.findElement(By.cssSelector("[id='login-button']"));
	    logbutton.click();
		Thread.sleep(10000);
		ss.assertAll();
	}

}
