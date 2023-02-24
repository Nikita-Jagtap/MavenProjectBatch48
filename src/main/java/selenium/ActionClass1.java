package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("https://phptravels.org/login");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement rr=driver.findElement(By.xpath("//a[@href='/knowledgebase']"));
		Actions ac = new Actions(driver);
		//ac.contextClick().build().perform();
		//ac.contextClick(rr).build().perform();
		WebElement flag = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span/span[2]/span[1]"));
		ac.moveToElement(flag).build().perform();
	}

}
