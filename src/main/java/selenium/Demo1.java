package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver Driver = new ChromeDriver();
		//Driver.get("https://www.google.com/");
		Driver.navigate().to("https://www.google.com/");
		String Title=Driver.getTitle();
		System.out.println(Title);
		String url=Driver.getCurrentUrl();
		System.out.println(url);
		String page=Driver.getPageSource();
		System.out.println(page);
		Driver.close();
	}

}
