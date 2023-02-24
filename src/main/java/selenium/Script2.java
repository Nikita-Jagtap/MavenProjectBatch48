package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
		Thread.sleep(3000);
		
		WebElement email = Driver.findElement(By.id("modalusername"));
		email.sendKeys("xyz@gmail.com");
		
		WebElement password = Driver.findElement(By.name("current-password"));
		password.sendKeys("xyz12345");
		
		WebElement logbutton = Driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"));
		logbutton.click();
		Thread.sleep(3000);
		Driver.close();
		
	}

}
