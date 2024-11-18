package Classtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommanTask {
		public static void main(String args[]) {
			
			WebDriver wd=new ChromeDriver();      
			
			wd.get("https://automationexercise.com/login");  //open the web site
			
			System.out.println("URL: "+ wd.getCurrentUrl());   //current URL
		    

			String s1=wd.getTitle();   
			System.out.println("Site Title: " + s1);  //get the title web page

			
			
			
			wd.findElement(By.name("name")).sendKeys("Chinmay");   //Fetch the data using 
			wd.findElement(By.name("email")).sendKeys("t2bhake@gmail.com");
					
			String s11,s12;                 //get Attributes
			
			WebElement we=wd.findElement(By.name("name"));
			s11=we.getAttribute("value");
			System.out.println(s11);
			
			WebElement we1=wd.findElement(By.name("email"));
			s12=we1.getAttribute("value");
			System.out.println(s12);
			
			
			
		}
}
