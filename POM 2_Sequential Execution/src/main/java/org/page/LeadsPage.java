package org.page;

import org.openqa.selenium.By;

import base.BaseClass;

public class LeadsPage extends BaseClass{

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		return new CreateLeadPage();

	}

	


	//clicking the submit button


	//fetching the id
	//	 driver.findElement(By.linkText("A (18525)"))




}
