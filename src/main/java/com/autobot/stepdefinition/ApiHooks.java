package com.autobot.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.autobot.setup.BaseSetup;

import io.cucumber.java.Before;

public class ApiHooks {
	private Logger logger = LoggerFactory.getLogger(UiHooks.class);
	
	BaseSetup baseSetup = null;

	@Before("@API")
	public void setUpUI() throws IOException, AWTException {
		
		try {
		 
		} catch ( Exception e) {
			e.printStackTrace();
		}
		logger.info("Base Setup is initialized ");

	}
}
