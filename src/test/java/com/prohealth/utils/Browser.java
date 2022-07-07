package com.prohealth.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\eclipseworkspace\\PracticeFramework\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "E:\\eclipseworkspace\\PracticeFramework\\drivers\\firefoxdriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
	}
	public static void openApp(String url)
	{
		driver.get(url);
	}
	public static void closeBrowser()
	{
		driver.close();
	}

}
