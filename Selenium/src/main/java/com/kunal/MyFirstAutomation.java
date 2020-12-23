package com.kunal;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyFirstAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement FName = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		WebElement LName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		WebElement RButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
		
		WebElement MNo = driver.findElement(By.xpath("//input[@id='userNumber']"));
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		
		WebElement Subjects = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		
		WebElement Pic = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
		WebElement State = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
		
		WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]"));
		
		
		List<WebElement> hobbies=driver.findElements(By.xpath("//label[@class='custom-control-label']"));
		
		
		
		
		
		FName.sendKeys("Kunal");
		
		LName.sendKeys("Ratra");
		
		Email.sendKeys("kunalratra123@gmail.com");
		
		
		if(!RButton.isSelected())
		{
		RButton.click();
		}
		
		String mobile=null;
		do {
		System.out.println("Enter mobile number");
		
		 mobile=s.nextLine();
		
		MNo.sendKeys(mobile);
		}while(mobile.length()<10 || mobile.length()>10);
		DOB.click();
	
		Actions a=new Actions(driver);
		
		
		
		a.moveToElement(DOB).keyDown(Keys.CONTROL).sendKeys("A").sendKeys(Keys.CLEAR).keyUp(Keys.CONTROL).sendKeys("09 Feb 1994").build().perform();
	
		
		
		Subjects.click();
		
		
		a.moveToElement(Subjects).sendKeys("Computer sc").sendKeys(Keys.ENTER).build().perform();
		
	
		
		int size=hobbies.size();
		
	//	System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			
			
			if(hobbies.get(i).getText().equalsIgnoreCase("Sports") || hobbies.get(i).getText().equalsIgnoreCase("Reading") || hobbies.get(i).getText().equalsIgnoreCase("Music")  )
			{
				hobbies.get(i).click();
				
			}
			
		
		
		}
		
		
	 Pic.sendKeys("C:\\Users\\ACER\\Desktop\\Kunal.png");
		
	 Address.sendKeys("H.no 36 Ram Nagar Karnal");
	 
	 
	 State.click();
	 a.moveToElement(State).sendKeys("Hary").sendKeys(Keys.ENTER).build().perform();
	 City.click();
	 a.moveToElement(City).sendKeys("Karn").sendKeys(Keys.ENTER).build().perform();
	 
	 driver.findElement(By.id("submit")).click();
	 
	 
	 String Text=driver.findElement(By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]")).getText();
		
	 
	 if(Text.equals("Thanks for submitting the form"))
	 {
		 
		 System.out.println("Form Sumitted Successfully");
		 
		 
	 }
	 
	 
//	 driver.findElement(By.xpath("//*[@id=\"closeLargeModal\"]")).click();
	 
	 
	}

}
