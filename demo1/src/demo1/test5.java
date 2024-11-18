package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver wd=new ChromeDriver();
		
	wd.get("https://demo.guru99.com/test/newtours/register.php");
	
	WebElement we=wd.findElement(By.name("email"));
    WebElement we1=wd.findElement(By.name("password"));
		we.sendKeys("Chinmay");
		we1.sendKeys("Chinmay");
	Thread.sleep(2000);
	Thread.sleep(2000);
	we.clear();
	we.sendKeys("jgsdgsdga");
	we1.clear();
	we1.sendKeys("sduwyudwdsydfsdsd");
	
	String s=we.getAttribute("value");
	System.out.println(s);
	
	String s1=we1.getAttribute("value");
	System.out.println(s1);
	}

}
