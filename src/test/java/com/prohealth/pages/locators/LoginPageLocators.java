package com.prohealth.pages.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	
	public static By loginpage_username=By.xpath("//input[contains(@placeholder,'Enter Username ...')]");
	public static By loginpage_password=By.xpath("//input[contains(@placeholder,'Enter Password ...')]");
	public static By loginpage_LoginButton=By.xpath("//button[@type='submit'][contains(.,'LOGIN')]");
	public static By postlogin_facility=By.xpath("//select[contains(@id,'facility')]");
	public static By postlogin_roles=By.xpath("//select[contains(@id,'roles')]");
	public static By postlogin_loginButton=By.xpath("//button[@type='submit'][contains(.,'LOGIN')]");

}
