package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest1 {
  @Test
  public void f() {
	  
  }
  @Parameters({"un","pw"})
  @BeforeTest
  public void beforeTest() {
  }

}
