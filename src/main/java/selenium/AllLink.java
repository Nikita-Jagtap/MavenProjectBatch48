package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.w3schools.com/");
		Thread.sleep(2000);
		List<WebElement> links = Driver.findElements(By.xpath("//a"));
		for(WebElement a:links) {
			//System.out.println(a);
			System.out.println(a.getAttribute("href"));
			//System.out.println(a.getText());
		}
	}

}
