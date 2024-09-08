package com.autobot.setup;

import org.openqa.selenium.WebDriver;



public class BaseSetup{
	
	private static WebDriver driver;
	
	public BaseSetup() {
		initBrowser();
	}
	
	
    public void initBrowser() {
    	IBrowserSetup browser = new ChromeBrowser();
    	browser.initBrowser();
    }
    
    
    public static WebDriver getDriver() {
        return driver;
    }
    
}
