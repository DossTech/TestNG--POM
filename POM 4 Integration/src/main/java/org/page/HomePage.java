package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.id("label")).click();
		return new MyHomePage(driver);
	}
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.id("label")).isDisplayed();
		System.out.println(displayed);
		Assert.assertTrue(displayed);
		return this;
	}
}
