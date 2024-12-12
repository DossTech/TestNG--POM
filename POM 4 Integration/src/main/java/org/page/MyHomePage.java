package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	@Test
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}
}
