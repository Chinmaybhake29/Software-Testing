package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class demo {
	  public static WebDriver wd=new ChromeDriver();

	@Test
  public void f() {
	  wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Chinmay");
  }
  @BeforeTest
  public void beforeTest() {
	  wd.get("https://demo.guru99.com/test/newtours/register.php");
  }

}
