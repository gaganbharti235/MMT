package FunctionsUI;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the city");
		
		String city=s.nextLine();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
				
				
				WebDriver driver =new ChromeDriver();
				
				
				driver.get("https://www.timeanddate.com/worldclock/");
				
				driver.manage().window().maximize();
				
				
				
				
				
				List<WebElement> BtableRow=driver.findElements(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr"));
				
				System.out.println(BtableRow.size());
				
				
			
				Iterator<WebElement> i= BtableRow.iterator();
				

				List<WebElement> TColumn=	driver.findElements(By.xpath("/html/body/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr/td"));
				
				System.out.println(TColumn.size());
				
				Iterator<WebElement> i1= BtableRow.iterator();
				
			/*	for(WebElement row : BtableRow )
				{
						
				/*	if(row.getText().equalsIgnoreCase(city))
					{
					  System.out.println(row.getText());
					  break;
					}
					
					
					 System.out.println(row.getText());
					 
					 System.out.println();
					
					
				}
			*/
			
				
	//System.out.println("Coulmn values");
		//		System.out.println();
				
				
	for(int k=0;k<TColumn.size();k++)
	{
		
		 
		
		if(TColumn.get(k).getText().equalsIgnoreCase(city))
		{
		
		  System.out.println("City is : "+TColumn.get(k).getText());
		  System.out.println("Time is : "+TColumn.get(++k).getText());
		  
		  break;
		}
		
		
	}
				
/*				
	for( WebElement column : TColumn)
	{
		
		if(column.getText().equalsIgnoreCase(city))
		{
		
		  System.out.println(column.getText());
		  
		}
		
	}*/
	
}
}
