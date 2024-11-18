package demo2;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test(priority = 1)
  public void regtest() 
  {
	  System.out.println("Register your self");
  }
  @Test(priority = 2)
  public void login() 
  {
	  System.out.println("Login The page");
  }
  @Test(priority = 3)
  public void logout() 
  {
	  
	  throw new SkipException("Still Working here...");
	 // System.out.println("Logout the page");
  }
  @Test(priority = 4)
  public void home() 
  {
	  
	  System.out.println("Home feed");  
  }
}
