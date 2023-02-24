package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//WebElement dropDown=Driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[1]/a"));
		WebElement Home=Driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
		Actions ac = new Actions(Driver);
		//ac.contextClick(Home).build().perform();
		//ac.doubleClick().build().perform();
		ac.moveToElement(Home).build().perform();
		ac.moveToElement(Home).keyDown(Keys.CONTROL).click().build().perform();
	}

}
