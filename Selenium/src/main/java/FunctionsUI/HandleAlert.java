package FunctionsUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();

		//for javascript alert we have to switch web driver to alert


		String x=driver.switchTo().alert().getText(); // to get text present in alert box.
		System.out.println(x);
		driver.switchTo().alert().accept(); // accept used for OK Done yes any positive word

		 // driver.switchTo().alert().dismiss(); //dismiss used for negative words like cancel etc
		// to enter  something in alert box sendkeys method is there
		// driver.switchTo().alert().sendKeys("gagan");


	}

}
