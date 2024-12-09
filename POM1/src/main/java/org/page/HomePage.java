package org.page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{

	public MyHomePage clickCRMSFA() {
		driver.findElement(By.id("label")).click();
		return new MyHomePage();
	}
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.id("label")).isDisplayed();
		System.out.println(displayed);
		Assert.assertTrue(displayed);
		return this;
	}
}
