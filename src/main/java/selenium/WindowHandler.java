package selenium;

import java.util.Set;

//import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		String mainwin = Driver.getWindowHandle();
		
		WebElement Gmail = Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
		Actions ac = new Actions(Driver);
		ac.moveToElement(Gmail).keyDown(Keys.CONTROL).click().build().perform();
		Set<String>all=Driver.getWindowHandles();
		for(String a:all)
		{
			System.out.println(a);
		}
	}

}
