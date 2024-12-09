package org.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class MyHomePage extends BaseClass{

	@Test
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}
}
