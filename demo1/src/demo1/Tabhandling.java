package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		String pw=wd.getWindowHandle();
		wd.get("https://mail.google.com/mail");
		wd.switchTo().newWindow(WindowType.TAB);
		
		
		String cw=wd.getWindowHandle();
		wd.get("https://www.youtube.com/");
		Thread.sleep(2000);
		wd.switchTo().window(pw);
		
	}

}
