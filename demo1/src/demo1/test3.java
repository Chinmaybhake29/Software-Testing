package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://www.demoblaze.com/");
		wd.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("sign-username")).sendKeys("chinmaybhake29@gmail.com");
		Thread.sleep(2000);
		wd.findElement(By.id("sign-password")).sendKeys("erer");
		Thread.sleep(2000);
	}

}
