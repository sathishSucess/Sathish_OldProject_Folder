package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * @author sathish
 * @date ${22/8/22} Project name: ${Adactin_hotel} Hooks class
 * 
 * 
 */
public class HookClass extends BaseClass {

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 *
	 *
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browserName"));
		enterUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implecitlyWait(40);

	}

	@After
	public void afterScenario(Scenario scenario) {

		TakesScreenshot screenShot = (TakesScreenshot) driver;
		byte[] b = screenShot.getScreenshotAs(OutputType.BYTES);
		scenario.attach(b, "png", "Every after Scenario");
		quit();

	}

}
