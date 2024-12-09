package testcases;

import org.page.LoginPage;
import org.testng.annotations.Test;

import base.BaseClass;

public class CreateLead extends BaseClass{
	
	@Test
	public void verifyCreateLead() {
		
		new LoginPage().
		enterUserName().
		enterPassword().
		clickLogin().
		clickCRMSFA().
		clickLeads().
		clickCreateLead().
		enterCompanyName().
		enterFirstName().
		enterLastName().
		enterPhoneNo().
		clickSubmitButton().
		verifyFirstName();
		
		

	}

}
