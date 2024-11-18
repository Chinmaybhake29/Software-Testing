package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		String s=d.getCurrentUrl();
		
		WebDriver d1= new ChromeDriver();
		d1.get("https://www.javatpoint.com");
		String s1=d.getCurrentUrl();
		
		if(s.equals(s1)) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			

	}

}
