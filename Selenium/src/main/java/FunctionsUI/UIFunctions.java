package FunctionsUI;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
				
				
				WebDriver driver =new ChromeDriver();
				
				
				driver.get("https://www.amazon.com/");

				driver.manage().window().maximize();
				
				
				//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
			/*	WebDriverWait wait=new WebDriverWait(driver,70);
				
				WebElement changeAdress = driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div[2]/div/div[3]/span[2]/span/input"));
				
				wait.until(ExpectedConditions.visibilityOf(changeAdress));
				
				*/
				
				
				
				WebElement changeAdress = driver.findElement(By.xpath("//*[@id=\"fRhW-mJmLL3XAdiFjC7M7A\"]/div/div/span/a/img"));
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
						.withTimeout(50, TimeUnit.SECONDS) 			
						.pollingEvery(5, TimeUnit.SECONDS) 			
						.ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.elementToBeSelected(changeAdress));
				
				
				
				
				
				
				
			
				
				
		/*	driver.findElement(By.xpath("//input[@type='submit' and @data-action-type='DISMISS']")).click();
		 
		 
			Actions a=new Actions(driver);  // driver gets the capability of Action class methods.
			
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"))).keyDown(Keys.CONTROL).click().build().perform();
				
			*/
				
				
				
				
				/*List<WebElement> list=driver.findElements(By.xpath("//input[@type='submit']"));
				
			/*	Iterator<WebElement> it=list.iterator();
				
				while(it.hasNext())
				{
					
					it.next().click();
					
				}
				
				
				*/
				
				
				
				
	}

}
