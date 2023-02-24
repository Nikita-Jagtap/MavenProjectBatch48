package TestCasesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithValidUsernamePassword {
	WebDriver driver;
	
	@Test
	public void HomeCase1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		
		WebElement account=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		account.click();
		
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[1]/input"));
		username.sendKeys("nikitahhjagtap@gmal.com");
		
		WebElement password=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[2]/input"));
		password.sendKeys("Nikitaa@241196");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/input[3]"));
		login.click();
	}

}
