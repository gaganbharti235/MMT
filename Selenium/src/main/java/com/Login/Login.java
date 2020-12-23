package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		/*driver.get("https://www.amazon.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 11 pro");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
		*/
		

		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

		
//		driver.findElement(By.)

	}

}
