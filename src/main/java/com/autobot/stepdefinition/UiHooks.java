package com.autobot.stepdefinition;

import io.cucumber.java.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.*;

import com.autobot.setup.BaseSetup;
import com.autobot.setup.ChromeBrowser;

import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;

// Hooks are blocks of code that run before and after each scenario
// precondition and teardown of scenarios maintained here

public class UiHooks {
	private Logger logger = LoggerFactory.getLogger(UiHooks.class);
	
	BaseSetup baseSetup = new BaseSetup();

	@Before("@UI")
	public void setUpUI() throws IOException, AWTException {
		
		try {
		  baseSetup.initBrowser();
		} catch ( Exception e) {
			e.printStackTrace();
		}
		logger.info("Base Setup is initialized ");

	}

}



