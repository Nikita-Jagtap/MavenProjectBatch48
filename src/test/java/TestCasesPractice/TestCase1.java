package TestCasesPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	WebDriver driver;
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		//WebElement shop = driver.findElement(By.xpath("//a[text()='Shop']"));
		//shop.click();
		//WebElement home = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/nav/a"));
		//home.click();
		List<WebElement> img = driver.findElements(By.xpath("//div[@class='n2-ss-slider-3']//img"));
		 int expectedSlidderCount =3;
		  int actualSlidderCount = img.size();
		  Assert.assertEquals(actualSlidderCount, expectedSlidderCount);
		  System.out.println("size="+ img.size());
	}

}
