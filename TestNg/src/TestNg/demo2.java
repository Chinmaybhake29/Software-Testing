package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class demo2 {
	public static WebDriver wd=new ChromeDriver();
  @Test
  @Parameters({"un","pw"})
  public void login(String un, String pw) {
	  wd.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	  wd.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	  wd.findElement(By.xpath("//button[@id='submit']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  wd.get("https://practicetestautomation.com/practice-test-login/");
  }
  
  public void afterTest() throws InterruptedException{
	Thread.sleep(5000);
	wd.close();
  }

}
