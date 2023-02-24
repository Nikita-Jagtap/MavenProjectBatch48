package TESTNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script4 {
	@Test
	public void method() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();   
		  driver.manage().window().maximize();
		  
		  driver.get("http://practice.automationtesting.in/");
		  Thread.sleep(3000);
		  
		  List<WebElement> arri = driver.findElements(By.xpath("(//div[@class='row_inner_wrapper'])[2]//img"));
		  int expectedArrivalCount =3;
		  int actualArrivalCount = arri.size();
		  
		  Assert.assertEquals(actualArrivalCount, expectedArrivalCount);
		  WebElement ss= driver.findElement(By.xpath("(//a[@class='woocommerce-LoopProduct-link'])[3]"));
		  ss.click();
		  
		  
	
}
	}


