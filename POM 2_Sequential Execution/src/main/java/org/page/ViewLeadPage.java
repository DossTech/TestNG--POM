package org.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{

	public void verifyFirstName() {
				
		Assert.assertTrue(driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed());
	
	}
}
