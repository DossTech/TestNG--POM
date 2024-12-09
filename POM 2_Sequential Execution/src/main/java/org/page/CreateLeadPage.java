package org.page;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{


	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mphasis");
		return this;
	}
	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumar");
		return this;
	}

	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		return this;
	}
	public CreateLeadPage enterPhoneNo() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9800");
		return this;
	}


	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}

