package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String args[]) {
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Chinmay");
		wd.findElement(By.xpath("//a[contains(text(),'SUPPORT')]")).click();

	}
}
