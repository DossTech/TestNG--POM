package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass{
	
	public LeadsPage(RemoteWebDriver driver) {
	this.driver=driver;
	}

	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		return new CreateLeadPage(driver);

	}

	


	//clicking the submit button


	//fetching the id
	//	 driver.findElement(By.linkText("A (18525)"))




}
