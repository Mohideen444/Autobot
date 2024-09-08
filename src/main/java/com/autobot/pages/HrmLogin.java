package com.autobot.pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autobot.setup.ChromeBrowser;

public class HrmLogin {
	
	private WebDriver driver;

	public HrmLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	By username_field = By.xpath("//input[@name='username']");
	By pwd_field = By.xpath("//input[@name='password']");
	By login_button = By.xpath("//button[contains(@class,'orangehrm-login-button')]");
	By login_error = By.xpath("//div[contains(@class,'oxd-alert-content--error')]/p");
	
	
	//Log
	Logger log = LoggerFactory.getLogger(getClass());
	
	//Page Functions
	public void goToPage() throws IOException, ParseException {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		log.info("Navigated to the URL : "+url);
	}
	
	
	public void enterUserName(String user) throws IOException, ParseException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("someId"))
            );
		
		WebElement usernameEle = driver.findElement(username_field);
		usernameEle.sendKeys(user);
		log.info("Entered username : " + user);
	}
	
	public void enterPassword(String password) throws IOException, ParseException
	{
		WebElement passwordEle = driver.findElement(pwd_field);
		passwordEle.sendKeys(password);
		log.info("Entered password : " + password);
	}
	
	public void clickLoginButton() throws IOException, ParseException
	{
		WebElement loginButton = driver.findElement(login_button);
		loginButton.click();
		log.info("login button clicked");
	}
	
	
	
	
}
