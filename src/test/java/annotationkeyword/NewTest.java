package annotationkeyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  Assert.assertTrue(username.isDisplayed());
	  username.sendKeys("Admin");
	  
	  WebElement password = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	  Assert.assertTrue(password.isDisplayed());
	  password.sendKeys("admin123");
	  
	  WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	  Assert.assertTrue(login.isDisplayed());
	  login.click();
	  Thread.sleep(3000);
	  driver.close();
  }
}
