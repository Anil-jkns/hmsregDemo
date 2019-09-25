package hmspctest;

import org.testng.annotations.Test;

import testcomponents.Hmspcreg;

public class Testhmspc {
	Hmspcreg hmspcreg =new Hmspcreg();
  @Test
  public void f() throws Exception {
	  Thread.sleep(2000);
	  hmspcreg.lunchbrowser();
	  hmspcreg.login();
	 
  }
}
