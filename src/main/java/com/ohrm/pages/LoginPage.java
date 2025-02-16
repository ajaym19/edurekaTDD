package com.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ohrm.base.OrangeHRMBase;

public class LoginPage extends OrangeHRMBase {

	By txtUsername = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");

//	@FindBy(name = "username")
//	WebElement pftxtUsername;
//	
//	@FindBy(name = "password")
//	WebElement pftxtPassword;
//	
//	@FindBy(xpath = "//button[@type='submit']")
//	WebElement pfbtnLogin;
//	
//	public LoginPage() {
//		PageFactory.initElements(driver, this);
//	}

	public String getPageTitle() {
		return driver.getTitle();
	}

//	public DashboardPage loginPF() {
//		pftxtUsername.sendKeys(prop.getProperty("username"));
//		pftxtPassword.sendKeys(prop.getProperty("password"));
//		pfbtnLogin.click();
//		return new DashboardPage();
//	}

	public DashboardPage login() {
		driver.findElement(txtUsername).sendKeys(prop.getProperty("username"));
		driver.findElement(txtPassword).sendKeys(prop.getProperty("password"));
		driver.findElement(btnLogin).click();
		return new DashboardPage();
	}
}
