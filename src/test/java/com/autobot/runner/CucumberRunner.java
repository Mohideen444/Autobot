package com.autobot.runner;



import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import java.io.IOException;


//Runner file to execute the cucumber tests

@CucumberOptions(

        features = {"src/test/resources/features"},
        glue = {"com.autobot.stepdefinition"},
        
        tags = "@UI",
        
        monochrome = true,
        dryRun = false
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
