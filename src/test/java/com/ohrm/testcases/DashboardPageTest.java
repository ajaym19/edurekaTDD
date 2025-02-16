package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class DashboardPageTest {
	
	LoginPage lp;
	DashboardPage dp;

	@BeforeMethod
	public void browserSetup() {
		lp = new LoginPage();
		lp.initialization();
	}
	
	@Test
	public void validateTimeWorkSectionTest() {
		lp.login();
		dp = new DashboardPage();
		Assert.assertTrue(dp.getTimeWorkSection());
	}
	
	@AfterMethod
	public void closeSetup() {
		lp.teardown();
	}
}
