package com.ohrm.pages;

import org.openqa.selenium.By;

import com.ohrm.base.OrangeHRMBase;

public class DashboardPage extends OrangeHRMBase {
	

	By timeWorkSection = By.xpath("//p[text()='Time at Work']");
	By dashboardLabel = By.xpath("//h6[text()='Dashboard']");
	
	public boolean getTimeWorkSection() {
		return driver.findElement(timeWorkSection).isDisplayed();
	}
	
	
	public boolean getDashboardLabel() {
		return driver.findElement(dashboardLabel).isDisplayed();
	}
}
