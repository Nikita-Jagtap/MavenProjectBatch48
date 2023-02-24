package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderdemo {
	@Test(dataProvider = "getData")
	public void login(String username,String password) throws InterruptedException
	{
		SoftAssert sf = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		Thread.sleep(3000);
		sf.assertEquals(Driver.getTitle(), "Log in - W3Schools");
		WebElement email = Driver.findElement(By.id("modalusername"));
		sf.assertTrue(email.isDisplayed());
		email.sendKeys(username);
		
		WebElement password1 = Driver.findElement(By.name("current-password"));
		sf.assertTrue(password1.isDisplayed());
		password1.sendKeys(password);
		
		WebElement logbutton = Driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"));
		sf.assertTrue(logbutton.isDisplayed());
		logbutton.click();
		Thread.sleep(3000); 
		
		String ActualTitle = Driver.getTitle();
		String exceptedtitle = "My learning | W3Schools";
		sf.assertEquals(ActualTitle, exceptedtitle);
		sf.assertAll();
		Driver.close();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[][]{
			{"nikitahjagtap@gmail.com","Nikita@1234"},
			{"anandioo7@gmail.com","anandi@1234"},
			{"tusharh@gmail.com","tushar@123"}
		};
		return obj;
		
	}
}