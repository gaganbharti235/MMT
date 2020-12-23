package FunctionsUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverandMovetoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.blackstone.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	WebElement Hover=driver.findElement(By.xpath("//*[@id=\"menu-item-34\"]/a"));
		
	//	Actions a=new Actions(driver);
		
		//a.moveToElement(Hover).build().perform();;
		
//		driver.findElement(By.xpath("//*[@id=\"menu-item-303\"]/a")).click();*/
		
		driver.findElement(By.xpath("//*[@id=\"primary-nav\"]/li[2]/ul/li[3]/ul/li[3]/a")).click();
		
		
		
		
		

	}

}
