package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropDown=Driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
		Select sc = new Select(dropDown);
		sc.selectByIndex(5);
		Thread.sleep(2000);
		sc.selectByValue("ASM");
		Thread.sleep(2000);
		sc.selectByVisibleText("India");
	}

}
