package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{
	public static RegisterPage registerpage;
	@BeforeClass
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateContactInformation()
	{
	registerpage =new RegisterPage(driver);
		registerpage.enterFirstName("Ajit");
		registerpage.enterLastName("Patil");
		registerpage.enterPhone("90909090");
		registerpage.enterEmail("ajit@tcs.com");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}

