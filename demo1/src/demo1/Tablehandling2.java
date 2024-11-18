package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		
		String pw=wd.getWindowHandle();      //1
		wd.get("https://www.google.com/");
		wd.switchTo().newWindow(WindowType.TAB);
		
		String pw1=wd.getWindowHandle();    //2
		wd.get("https://www.youtube.com/");
		wd.switchTo().newWindow(WindowType.TAB);
		

		String pw2=wd.getWindowHandle();  //3
		wd.get("https://maps.google.com//");
		wd.switchTo().newWindow(WindowType.TAB);
		
		
		String pw3=wd.getWindowHandle();  //4
		wd.get("https://drive.google.com/");
		wd.switchTo().newWindow(WindowType.TAB);
		
		wd.switchTo().window(pw2);
		wd.switchTo().window(pw1);
		wd.switchTo().window(pw);
		wd.switchTo().window(pw3);
		

	}

}
