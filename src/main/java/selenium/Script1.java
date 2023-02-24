package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		//Driver.get("https://www.w3schools.com/");
		
		Driver.navigate().to("https://www.w3schools.com/");
		
		 String title =Driver.getTitle();
		 System.out.println(title);
		
		 String url = Driver.getCurrentUrl();
		 System.out.println(url);
		 
		 Thread.sleep(2000);
		 //Driver.close();
		 
	}

}

