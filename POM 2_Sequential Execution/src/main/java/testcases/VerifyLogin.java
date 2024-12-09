package testcases;

import org.page.LoginPage;
import org.testng.annotations.Test;

import base.BaseClass;

public class VerifyLogin extends BaseClass{

	@Test
	public void runVerifyLogin() {
		
	 new LoginPage()
		.enterUserName().
		enterPassword().
		clickLogin().
	 
	 verifyHomePage().
	 clickCRMSFA();
	 

	}
}
