package demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://demoqa.com/alerts");
		
		wd.findElement(By.id("alertButton")).click();
		
		Thread.sleep(1000);

		Alert alt=wd.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		alt.accept();
		
	}
}
