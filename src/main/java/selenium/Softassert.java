package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassert {
	@Test
	public void j() throws InterruptedException{
		
		SoftAssert ss = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  Thread.sleep(3000);
		  
		  ss.assertEquals(driver.getTitle(), "OrangeHRM");
		  WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  ss.assertTrue(username.isDisplayed());
		  username.sendKeys("Admin");
		  
		  WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		  ss.assertTrue(password.isDisplayed());
		  password.sendKeys("admin123");
		  
		  WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		  ss.assertTrue(login.isDisplayed());
		  login.click();
		  ss.assertAll();
		  Thread.sleep(3000);
		  driver.close();
		  
	}

	

}
