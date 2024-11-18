package demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.browserstack.com/users/sign_up"); //open web site
		
		String s=wd.getTitle();
		System.out.println(s);  //get title
		
		Thread.sleep(2000);
		
		wd.findElement(By.name("commit")).click();  //Click on button 
		
		Thread.sleep(2000);
		
		Alert al=wd.switchTo().alert();
		al.accept();
	}
}
