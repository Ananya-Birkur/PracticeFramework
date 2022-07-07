package cucumber.stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.prohealth.pages.locators.LoginPageLocators;

import cucumber.global.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginstepDefination extends BaseClass {
	
	@Given("^Navigate to prohealth website$")
    public void navigate_to_prohealth_website() throws Throwable {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.navigate().to("http://183.82.123.57:3000/login");
    }

    @When("^Enter valid (.+) (.+) $")
    public void enter_valid(String username, String password) throws Throwable {
    	driver.findElement(LoginPageLocators.loginpage_username).sendKeys(username);
    	driver.findElement(LoginPageLocators.loginpage_password).sendKeys(password);
    }
    
    @And("^click on login$")
    public void click_on_submit() {
    	driver.findElement(LoginPageLocators.loginpage_LoginButton).click();
       
    }
  
    @Then("^select (.+) (.+)$")
    public void select(int facility, int roles) throws Throwable {
      Select selectfacility=new Select(driver.findElement(LoginPageLocators.postlogin_facility));
      selectfacility.selectByIndex(facility);
      
      Select selectroles=new Select(driver.findElement(LoginPageLocators.postlogin_roles));
      selectfacility.selectByIndex(roles);
      
    }

    @And("^click on login$")
    public void click_on_login() throws Throwable {
       driver.findElement(LoginPageLocators.postlogin_loginButton).click();
    }



}
