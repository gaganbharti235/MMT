package FunctionsUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delaingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		

	}

}
