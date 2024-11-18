package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		String s=d.getCurrentUrl();
		
		d.get("https://www.javatpoint.com");
		System.out.println();
		
//		d1.manage().window().maximize();
//		
//		d1.manage().window().fullscreen();
//		d1.manage().window().minimize();
		
//		String s=d.getTitle();
//		System.out.println(s);
//		
//		System.out.println(d.getCurrentUrl());
//		
//	    	
//		String s=d.getTitle();
//		System.out.println(s);
//		
//		String s1=d.getTitle();
//		System.out.println(s1);
//		
//		if(s.s1) {
//			System.out.println("Passs");
//		}
//		else if(s!=s1)
//		{
//			System.out.println("fail");
//		}
		Thread.sleep(5000);
		d.navigate().back();
	}
	
}
