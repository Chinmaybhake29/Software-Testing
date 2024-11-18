package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://www.jotform.com/42382403598964");
		
		wd.findElement(By.name("q3_name")).sendKeys("Chinmay");

		
		wd.findElement(By.name("q4_email")).sendKeys("ydsfdyf@gmail.com");
		
		
	
		
		Thread.sleep(2000);
		Select sr3=new Select(wd.findElement(By.id("input_7_month")));
		sr3.selectByIndex(1);
		Thread.sleep(2000);

	
		Select sr4=new Select(wd.findElement(By.id("input_7_day")));
		sr4.selectByIndex(1);
		Thread.sleep(2000);
		

		
		
		
		
	
	}

}
