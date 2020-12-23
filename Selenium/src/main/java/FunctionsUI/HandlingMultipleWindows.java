package FunctionsUI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F%3Fgws_rd%3Dssl&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());// selenium will stick to parent window only and hence same title will be printed 2 times as one is above
		// to print child window title we need to switch selenium to child window first
		
		Set<String>ids=driver.getWindowHandles();//this command will open all the windows open and throws into Set which is the return type.
		// parent will be stored in first column of Set and Subsequent childs in 2nd 3 rd and so on
		Iterator<String> it=ids.iterator();// return type of iterator is String, now it is at the top of the ids Set.
		String ParentId=it.next();// return type of next() is String, now it has moved to first row i.e parent row in ids Set.
		String ChildId=it.next();//now it has moved to Second row i.e child row in ids Set
		driver.switchTo().window(ChildId);//now driver has successfully moved to child id window
		System.out.println("moved to child");
		System.out.println(driver.getTitle());// now title of child window will be displayed	


	}

}
