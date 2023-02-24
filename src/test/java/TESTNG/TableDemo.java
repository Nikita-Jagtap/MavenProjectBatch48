package TESTNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableDemo {
	WebDriver driver;
	@Test
	public void table() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(); 
		 driver.manage().window().maximize();
		
		 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		  Thread.sleep(4000);
		  
		 List<WebElement>  Totalrows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		  System.out.println("total no. of rows:"+ Totalrows.size());
		  
		  List<WebElement> Tableheading= driver.findElements(By.xpath("//table[@id='customers']//th"));
		  for(WebElement thh:Tableheading) {
			  System.out.println("Heading:");
			  System.out.print( thh.getText());
			  int count= Tableheading.size();
			  System.out.println(count);
		  }
		  
		  List<WebElement> Tabledata= driver.findElements(By.xpath("//table[@id='customers']//td"));
		  for(WebElement data:Tabledata) {
			  System.out.println("data:");
			  System.out.print( data.getText());
			  int count1= Tabledata.size();
			  System.out.println(count1);
		  }
	}

}
