package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		
		String cw=wd.getWindowHandle();
		wd.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act=new Actions(wd);
		WebElement drag=wd.findElement(By.id("fourth"));
		WebElement drop=wd.findElement(By.id("amt7"));
		act.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag1=wd.findElement(By.id("credit2"));
		
		
	}

}
