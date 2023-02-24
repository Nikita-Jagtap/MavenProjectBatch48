package TestCasesPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
	WebDriver driver;
	@Test
	public void arrival()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		//WebElement shop = driver.findElement(By.xpath("//a[text()='Shop']"));
		//shop.click();
		//WebElement home = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/nav/a"));
		//home.click();
	}

}
