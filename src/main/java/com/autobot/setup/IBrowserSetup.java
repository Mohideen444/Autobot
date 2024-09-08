package com.autobot.setup;

import org.openqa.selenium.WebDriver;

public interface IBrowserSetup {

    public default WebDriver initBrowser() {
		return null;

    }
    
    public default void quitBrowser() {
    }
}
