package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		wd.findElement(By.name("firstName")).sendKeys("Chinmay");
		Thread.sleep(2000);
		wd.findElement(By.name("lastName")).sendKeys("Bhake");
		wd.findElement(By.name("phone")).sendKeys("436472534");
		
		wd.findElement(By.name("userName")).sendKeys("whredws@gmail.com");
		wd.findElement(By.name("address1")).sendKeys("56,jdgsgd,dsgds");
		wd.findElement(By.name("city")).sendKeys("Nagpur");
		wd.findElement(By.name("state")).sendKeys("Maharashtra");
		wd.findElement(By.name("postalCode")).sendKeys("465656");
	
		//WebElement we=null;
		Select sr=new Select(wd.findElement(By.name("country")));
		sr.selectByVisibleText("INDIA");
		wd.findElement(By.name("email")).sendKeys("whredws@gmail.com");
		wd.findElement(By.name("password")).sendKeys("whredws@gmail.com");
		wd.findElement(By.name("confirmPassword")).sendKeys("whredws@gmail.com");

		

	}

}
