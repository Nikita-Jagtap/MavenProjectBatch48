package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro {
	
	WebDriver driver;
	@Test(dataProvider="abc")
	public void search(String Place,String City) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchbox.sendKeys(Place + " " + City);
		WebElement btn = driver.findElement(By.name("btnk"));
		btn.click();
		Thread.sleep(1000);
		
		driver.close();
	}
	@DataProvider(name="abc")
	public Object[][] getData()
	{
		Object[][] searchword = new Object[2][2];
		
		searchword[0][0]="India Gate";
		searchword[0][1]="Delhi";
		searchword[1][0]="Taj Mahal";
		searchword[1][1]="Agra";
		
		return searchword;
	}

}
