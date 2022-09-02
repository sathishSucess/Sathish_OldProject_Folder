package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
/**
 * @author sathish
 * @date ${22/8/22}
 *  Project name: ${Adactin_hotel}  
 * @cucumberOption
 * @runWith
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,snippets = SnippetType.CAMELCASE ,publish = true,stepNotifications = false,monochrome = true,plugin = {"pretty","json:target/joutput.json"},features = {"src\\test\\resources\\Features"},glue = {"com.stepdefinition"})
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {
			Reporting.generateJvmReport(System.getProperty("user.dir")+"\\target\\joutput.json");	
	}
	
	
	
	
	
	
	
}
