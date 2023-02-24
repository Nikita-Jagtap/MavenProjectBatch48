package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement username = Driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys("xyz@gmail.com");
	Thread.sleep(2000);
		
		WebElement password = Driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		password.sendKeys("xyz12345");
	Thread.sleep(2000);
		
	WebElement logbutton = Driver.findElement(By.cssSelector("[type='submit']"));
	logbutton.click();
		Thread.sleep(10000);
		TakesScreenshot ts = (TakesScreenshot)Driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProjectBatch48\\src\\screenshot\\abc.png");
		FileHandler.copy(src, loc);
	}

}
