package TESTNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	
	WebDriver driver;
	@BeforeSuite(alwaysRun = true)                        //preconditions
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void ClickOnShopbtn()
	{
		WebElement btn = driver.findElement(By.xpath("//a[text()='Shop']"));
		btn.click();
	}
	@Test(priority = 1)
	public void ClickOnBookPage()
	{
		
		 List<WebElement> arri = driver.findElements(By.xpath("(//div[@class='row_inner_wrapper'])[2]//img"));
		  int expectedArrivalCount =3;
		  int actualArrivalCount = arri.size();
		  
		 Assert.assertEquals(actualArrivalCount, expectedArrivalCount);
		  WebElement ss= driver.findElement(By.xpath("(//a[@class='woocommerce-LoopProduct-link'])[3]"));
		  ss.click();
		  
	}
	@Test(priority = 2)
	public  void GetTitle()
	{
		WebElement ss=driver.findElement(By.xpath("//h1[text()='Mastering JavaScript']"));
		driver.navigate().to("https://practice.automationtesting.in/product/mastering-javascript//");
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	@AfterSuite(alwaysRun= true)
	public void tearup()
	{
		driver.close();
	}

}
