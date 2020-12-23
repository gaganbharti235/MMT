package FunctionsUI;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheapestFilght {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		String src="Bengaluru, India";
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		try
		{
		if(driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]/div[3]")).isEnabled())
		{
			
			

			WebElement LoginLogo = driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[1]/ul/li[6]"));

				LoginLogo.click();

		}
		}
		catch (Exception e) {
			
			System.out.println("Popup Didn't appear");
			// TODO: handle exception
		}
		WebElement Source=driver.findElement(By.id("fromCity"));

		Thread.sleep(4000);
		
		Source.sendKeys(src);
		
//		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.DOWN);

	//	System.out.println(driver.findElement(By.xpath("//input[@id='fromCity']")).getText());

		
	/*	JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String Script="return document.getElementById(\"react-autowhatever-1\").value;";
		
		String Text=(String) js.executeScript(Script);
		
		System.out.println(Text);
		
		*/
		Thread.sleep(4000);
		List<WebElement> lt=driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul"));
		
		for(WebElement x:lt)
		{
		//	System.out.println("option ");
			//System.out.println(x.getText());
			
			if(x.getText().contains(src))
			{
			//	System.out.println("Selected");
				System.out.println(x.getText());
				
				if(x.isDisplayed() && x.isEnabled())
				{
				x.click();
				break;
				}
			}
			
			
			//System.out.println(x.getText());
			
		}
		
		
		
		WebElement Dest=driver.findElement(By.id("toCity"));
		
		String Destination="Delhi, India";
		
		Dest.sendKeys(Destination);
		
		Thread.sleep(4000);
		
		List<WebElement> dt=driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]/div"));
		
		for(WebElement y:dt)
		{
			//System.out.println("option ");
			//System.out.println(y.getText());
			
			if(y.getText().contains(Destination))
			{
				System.out.println("Selected");
				System.out.println(y.getText());
				if(y.isDisplayed() && y.isEnabled())
				{
				//System.out.println(y.getText());
				y.click();
				break;
				}
			}
			
			
			//System.out.println(x.getText());
			
		}
		
		
		String Month ="March 2021";
		String Date="23";
		
		
		WebElement Heading=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]"));
		
		
		
		String ActualHeading=Heading.getText();
		
		
	   System.out.println(ActualHeading);
		
		while(!ActualHeading.equalsIgnoreCase(Month))
		{
						
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
			
			
			
			if(Heading.getText().equalsIgnoreCase(Month))
			{
				
				break;
				
			}
			
			
			
			
		}
		
		
	List<WebElement> DatePickerDates=driver.findElements(By.className("dateInnerCell"));
		
	//	String ActalDates=driver.findElement(By.xpath("//div[@class=\"DayPicker-Body\"]")).getText();
		
	for(WebElement d:DatePickerDates)
		{
			//System.out.println(d.getText());
			//System.out.println("  pause  ");
			if(d.getText().contains(Date))
			{
			d.click();
			break;
			}
		}

	
	WebElement Search=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a"));
	
	Search.click();
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	WebElement Price=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"sorting-togglers\"]/div[5]/span/span[1]"))));
	
		
	String lowestPrice=	driver.findElement(By.xpath("//div[@class=\"pull-left  make_relative price\"]/p/span")).getText();

		System.out.println(lowestPrice);
		
		
		Price.click();
		
		Thread.sleep(2000);
		
		String highestPrice=	driver.findElement(By.xpath("//div[@class=\"pull-left  make_relative price\"]/p/span")).getText();
		
	System.out.println(highestPrice);
	
    
	
	
    
	
	
	
	
	
	
	
	
		
	}

}
