package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseLayer.BaseClass;

public class RegisterPage extends BaseClass{
	By fname = By.name("firstName");
	By lname = By.name("lastName");
	By mobileNo = By.name("phone");
	By email = By.name("userName");

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String firstname) {
		boolean fnamedisplayed = driver.findElement(fname).isDisplayed();
		boolean fnameEnabled = driver.findElement(fname).isEnabled();

		if (fnamedisplayed && fnameEnabled) {
		driver.findElement(fname).sendKeys(firstname);
		}

//		if(fnamedisplayed==true)
//		{
//			if(fnameEnabled==true)
//			{
//				driver.findElement(fname).sendKeys(firstname);
//			}
//		}

	}

	public String captureFirstNameValue() {
		return driver.findElement(fname).getAttribute("value");
	}

	public void enterLastName(String lastname) {
		boolean lnameDisplayed = driver.findElement(lname).isDisplayed();
		boolean lnameEnabled = driver.findElement(lname).isEnabled();

		if (lnameDisplayed && lnameEnabled) {
			driver.findElement(lname).sendKeys(lastname);
		}
	}

	public String captureLastNameValue() {
		return driver.findElement(lname).getAttribute("value");
	}

	public void enterPhone(String mobile) {
		boolean phoneDisplayed = driver.findElement(mobileNo).isDisplayed();
		boolean phoneEnabled = driver.findElement(mobileNo).isEnabled();

		if (phoneDisplayed && phoneEnabled) {
			driver.findElement(mobileNo).sendKeys(mobile);
		}
	}

	public String captureMobileNumberValue() {
		return driver.findElement(mobileNo).getAttribute("value");
	}

	public void enterEmail(String mail) {
		boolean emailDisplayed = driver.findElement(email).isDisplayed();
		boolean emailEnabled = driver.findElement(email).isEnabled();

		if (emailDisplayed && emailEnabled) {
			driver.findElement(email).sendKeys(mail);
		}
	}

	public String captureEmailValue() {
		return driver.findElement(email).getAttribute("value");
	}
}
