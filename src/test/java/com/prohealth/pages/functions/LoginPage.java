package com.prohealth.pages.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.prohealth.pages.locators.LoginPageLocators;

public class LoginPage extends LoginPageLocators {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterUsername(String uname)
	{
		WebElement ph_username=driver.findElement(loginpage_username);
		ph_username.sendKeys(uname);
	}
	public void enterPassword(String pass) throws Exception
	{
		WebElement ph_password=driver.findElement(loginpage_password);
		ph_password.sendKeys(pass);
		Thread.sleep(3000);
	}
	public void clickSubmit() throws Exception
	{
		WebElement ph_submit=driver.findElement(loginpage_LoginButton);
		ph_submit.click();
		Thread.sleep(3000);
	}
	public void facilitydropdown()
	{
		Select selectFacility=new Select(driver.findElement(postlogin_facility));
		selectFacility.selectByVisibleText("Apollo");
	}
	public void rolesdropdown()
	{
		Select selectRoles=new Select(driver.findElement(postlogin_roles));
		selectRoles.selectByVisibleText("ADMIN");
	}
	public void clickLogin()
	{
		WebElement ph_Login=driver.findElement(postlogin_loginButton);
		ph_Login.click();
	}
	public void proHealthLoginPage(String uname,String pass) throws Exception
	{
		this.enterUsername(uname);
		this.enterPassword(pass);
		this.clickSubmit();
		this.facilitydropdown();
		this.rolesdropdown();
		this.clickLogin();
	}
	 

}
