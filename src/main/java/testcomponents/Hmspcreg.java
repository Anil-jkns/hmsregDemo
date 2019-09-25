package testcomponents;

import locators.HMSlocators;
import utlity.BaseClass;

public class Hmspcreg extends BaseClass{
	 HMSlocators hmslocator= new HMSlocators();
	
	public void lunchbrowser(){
		openbrowser();
		openURL("http://selenium4testing.com/hms/");
				
	}
	public void login() throws Exception{
		enterText(hmslocator.username,"admin");
		enterText(hmslocator.password,"admin");
		click(hmslocator.login);
		click(hmslocator.reg);
		
	
	}

}
