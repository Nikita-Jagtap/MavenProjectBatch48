package TESTNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script2 {
	@Test
	public void method() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();  
		 driver.manage().window().maximize();
		
		 driver.get("http://practice.automationtesting.in/");
		  Thread.sleep(3000);
		  
		  List<WebElement> sss = driver.findElements(By.xpath("//div[@class='n2-ss-slider-3']//img"));
		  int expectedSlidderCount =3;
		  int actualSlidderCount = sss.size();
		  Assert.assertEquals(actualSlidderCount, expectedSlidderCount);
	}

}
