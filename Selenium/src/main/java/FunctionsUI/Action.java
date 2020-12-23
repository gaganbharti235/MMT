package FunctionsUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		Actions a=new Actions(driver);  // driver gets the capability of Action class methods.
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform(); // build() means that your move action is ready to execute but not execute for executing we have perform method.
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform(); 
		//this will rightclick on that item
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// concatenating composite functions and performing in a single step


		
	}

}
