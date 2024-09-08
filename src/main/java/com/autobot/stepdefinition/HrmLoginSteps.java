package com.autobot.stepdefinition;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.autobot.pages.HrmLogin;
import com.autobot.setup.BaseSetup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class HrmLoginSteps {

	//Page Object
	HrmLogin login = new HrmLogin(BaseSetup.getDriver());
	
	
	//Step Definitions
	@Given("user navigates to the orange hrm login page")
	public void user_navigates_to_orange_hrm_login_page() {
		try {
			login.goToPage();
	    } catch (Throwable e) {
	    	e.printStackTrace();
	    }
	}
	
	@And("user enters valid {string} user name")
	public void user_enters_valid_user_name(String user)
	{
		try {
		login.enterUserName(user);
		}catch (Throwable e) {
	    	e.printStackTrace();
	    }
	}
	
	@And("user enters valid {string} password")
	public void user_enters_valid_password(String password)
	{
		try {
		login.enterPassword(password);
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@When("user clicks the login button")
	public void user_clicks_the_login_button()
	{	
		try {
		login.clickLoginButton();
		}
		catch (Throwable e) {
	    	e.printStackTrace();
		}
	}
}
