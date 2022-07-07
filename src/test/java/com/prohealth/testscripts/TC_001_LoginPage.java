package com.prohealth.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.prohealth.pages.functions.LoginPage;
import com.prohealth.utils.Browser;
import com.prohealth.utils.ReadData;

public class TC_001_LoginPage {
	WebDriver driver;
	@BeforeClass
	public void setup() throws Exception
	{
		String browsername=ReadData.getdata("browserdata", "browser1");
		String url=ReadData.getdata("browserdata", "url");
		driver=Browser.launchBrowser(browsername);
		Browser.openApp(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterClass
	public void teardown()
	{
		//driver.close();
	}
	@Test
	public void login() throws Exception
	{
		String username=ReadData.getdata("logindata", "username");
		String password=ReadData.getdata("logindata", "password");
		LoginPage log=new LoginPage(driver);
		log.proHealthLoginPage(username, password);
		
	}
	

}
