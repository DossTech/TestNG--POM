package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUserName() {
		//userName
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("DemoSalesManager");


		return this;
	}

	public LoginPage enterPassword() {
		//password
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("crmsfa");


		return this;
	}

	public HomePage clickLogin() {
		//Login button
		WebElement btnLogin = driver.findElement(By.className("decorativeSubmit"));
		btnLogin.click();

		return new HomePage(driver);
	}
}
