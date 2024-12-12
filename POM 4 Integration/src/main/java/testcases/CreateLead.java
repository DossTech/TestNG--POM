package testcases;

import org.page.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setup() {
		fileName = "CreateLead";

	}
	@Test(dataProvider="data1")
	public void verifyCreateLead(String cName, String fName, String lName) {
		
		new LoginPage(driver).
		enterUserName().
		enterPassword().
		clickLogin().
		clickCRMSFA().
		clickLeads().
		clickCreateLead().
		enterCompanyName(cName).
		enterFirstName(fName).
		enterLastName(lName).
		enterPhoneNo().
		clickSubmitButton().
		verifyFirstName();
		
		

	}

}
