package TestNg;

import org.testng.annotations.Test;

public class demo1 {
	
  @Test(priority = 1)
  public void f1() {
	  System.out.println("Register");
  }
  @Test(priority = 2)
  public void f2() {
	  System.out.println("Login");
  }
  @Test(priority = 3)
  public void f3() {
	  System.out.println("Homefeed");
  }
  @Test(priority = 4)
  public void f4() {
	  System.out.println("Logout");
  }
}
