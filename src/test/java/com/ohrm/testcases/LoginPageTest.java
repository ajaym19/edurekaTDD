package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class LoginPageTest {

	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}

	@Test
	public void validateTitleTest() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getPageTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test(enabled = false)
	public void validateLoginMultipleRoles() {
		
	}
	
	@DataProvider
	public void getLoginData() {
		
	}

	@AfterMethod
	public void closeSetup() {
		lp.teardown();
	}

	@Test
	public void validateLoginTest() {
		dp = lp.login();
		Assert.assertTrue(dp.getDashboardLabel());
		
	}

}
