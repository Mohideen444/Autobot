package com.autobot.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements IBrowserSetup{
	
	WebDriver driver;

    public WebDriver initBrowser() {

		// Set up ChromeDriver using WebDriverManager
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MMohideenAbdulla\\eclipse-workspace\\Autobot\\driver\\chromedriver.exe");

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	return driver;
    }
    
    public void quitBrowser() {
    	driver.quit();
    }
	
}
